/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package com.mtiming.timing.service.impl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mtiming.manage.mapper.*;
import com.mtiming.manage.pojo.*;
import com.mtiming.manage.TimingConstants;
import com.mtiming.excel.DataSet2ExcelSXSSFHelper;
import com.mtiming.excel.IValueFormatter;
import com.mtiming.timing.service.CttimeService;

/**
 * @author cui
 * @version CttimeServiceImpl, v0.1 2018/12/12 9:43
 */
@Service
public class CttimeServiceImpl implements CttimeService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CttimesInfoMapper cttimesInfoMapper;


    @Override
    public Map<String, Object> calcResult(RunnerInfo runner, List<PointsFLow> lstPointFlow, RaceGunInfo raceGunInfo) {

        Preconditions.checkArgument(raceGunInfo != null, "发枪时间未配置！");

        Map<String, Object> objectMap = calcRunnerRealTimePassLocation(runner, lstPointFlow, raceGunInfo);

        return objectMap;

    }

    private Map<String, Object> calcRunnerRealTimePassLocation(RunnerInfo runnerInfo, List<PointsFLow> pointsFLows, RaceGunInfo raceGunInfo) {
        Map<String, Object> result = Maps.newLinkedHashMap();

        Integer tag = runnerInfo.getTag();

        if (tag == null) {
            throw new IllegalArgumentException("runner 【" + runnerInfo.getNamechi() + "】没有Tag信息！");
        }
        result.put(TimingConstants.TAG, tag);

        CttimesInfoExample example = new CttimesInfoExample();
        example.or().andTagEqualTo(String.valueOf(tag));
        example.setOrderByClause(TimingConstants.CTTIME_ORDER_BY_KEY);

        List<CttimesInfo> lstTimes = cttimesInfoMapper.selectByExample(example);
        if (lstTimes == null || lstTimes.size() <= 0) {
            logger.error("runner 【" + runnerInfo.getNameeng() + "】没有采集到数据！");
            for(PointsFLow points:pointsFLows){
                result.put(points.getPoints(),null);
            }
            return result;
        }

        for (PointsFLow points : pointsFLows) {

            try {
                if (points.getSeq() == 1) {
                    //处理始发点，要选择最后一次感应到的时间
                    Integer time = getSFLocationTime(lstTimes, points, true, raceGunInfo);
                    result.put(points.getPoints(), time);
                } else if (points.getSeq() == pointsFLows.size()) {
                    //处理终点
                    Integer time = getSFLocationTime(lstTimes, points, false, raceGunInfo);
                    result.put(points.getPoints(), time);

                } else if (!Strings.isNullOrEmpty(points.getPriorpoint())) {
                    //这一点被通过多于一次，且不是第一次
                    Integer time = getMutiPassLocationTime(lstTimes, points, result);
                    result.put(points.getPoints(), time);
                } else {
                    //其他情况取最早感应的时间即可
                    Integer time = getCommonLocationTime(lstTimes, points);
                    result.put(points.getPoints(), time);
                }
            } catch (Exception e) {
                logger.error("计算Location【{}】时间时出错", points.getDevice(), e);
                result.put(points.getPoints(), null);
            }
        }
        return result;
    }


    private Integer getSFLocationTime(List<CttimesInfo> lstTimes, final PointsFLow points, final boolean isFirst, final RaceGunInfo raceGunInfo) {
        final Integer gunTime = Integer.valueOf(raceGunInfo.getGuntime());
        final Integer cutoffTime = Integer.valueOf(raceGunInfo.getGuntime()) + Integer.valueOf(raceGunInfo.getCutoffoffset());
        List<CttimesInfo> lstSFTimes = Lists.newArrayList(Iterators.filter(lstTimes.iterator(), new Predicate<CttimesInfo>() {
            @Override
            public boolean apply(CttimesInfo cttimesInfo) {
                boolean flag = cttimesInfo.getLocation().equalsIgnoreCase(points.getDevice());
                if (flag) {
                    Integer cttime = Integer.valueOf(cttimesInfo.getTime());
                    if (isFirst) {
                        return cttime > gunTime && cttime < cutoffTime;
                    } else {
                        return cttime > cutoffTime;
                    }
                } else {
                    return false;
                }
            }
        }));

        if (lstSFTimes.size() > 0) {
            if (isFirst) {
                final Integer startTime = Integer.valueOf(lstSFTimes.get(lstSFTimes.size() - 1).getTime());
                //过滤时间列表
                lstTimes.removeIf(cttime -> Integer.valueOf(cttime.getTime()) <= startTime);

                return startTime;
            } else {
                return Integer.valueOf(lstSFTimes.get(0).getTime());
            }
        } else {
            return null;
        }
    }

    private Integer getCommonLocationTime(List<CttimesInfo> lstTimes, final PointsFLow points) {
        List<CttimesInfo> lstResult = Lists.newArrayList(Iterators.filter(lstTimes.iterator(), new Predicate<CttimesInfo>() {
            @Override
            public boolean apply(CttimesInfo cttimesInfo) {
                return cttimesInfo.getLocation().equals(points.getDevice());
            }
        }));
        Integer commonLocationTime = lstResult.size() > 0 ? Integer.valueOf(lstResult.get(0).getTime()) : null;
        if (commonLocationTime != null) {
            lstTimes.removeIf(cttime -> Integer.valueOf(cttime.getTime()) <= commonLocationTime);
        }
        return commonLocationTime;
    }

    private Integer getMutiPassLocationTime(List<CttimesInfo> lstTimes, final PointsFLow points, Map<String, Object> result) {

        String priorPoint = points.getPriorpoint();
        final Integer priorTime = (Integer) result.get(priorPoint);
        if (priorTime == null) {
            throw new IllegalArgumentException("runner 【" + lstTimes.get(0).getTag() + "】在点【" + priorPoint + "】处没有采集数据！");
        }
        List<CttimesInfo> lstResult = Lists.newArrayList(Iterators.filter(lstTimes.iterator(), new Predicate<CttimesInfo>() {
            @Override
            public boolean apply(CttimesInfo cttimesInfo) {
                return cttimesInfo.getLocation().equals(points.getDevice()) && Integer.valueOf(cttimesInfo.getTime()) > (priorTime + points.getInterval());
            }
        }));

        Integer locationTime = lstResult.size() > 0 ? Integer.valueOf(lstResult.get(0).getTime()) : null;
        if (locationTime != null) {
            lstTimes.removeIf(cttime -> Integer.valueOf(cttime.getTime()) <= locationTime);
        }
        return locationTime;
    }

    @Override
    public List<CttimesInfo> getMeasuredRecordByTag(String tag) {
        //TODO 条件 时间大于实际开枪时间，减少无效数据
        CttimesInfoExample example=new CttimesInfoExample();
        example.or().andTagEqualTo(tag);
        example.setOrderByClause(TimingConstants.CTTIME_ORDER_BY_KEY);
        return cttimesInfoMapper.selectByExample(example);
    }
}
