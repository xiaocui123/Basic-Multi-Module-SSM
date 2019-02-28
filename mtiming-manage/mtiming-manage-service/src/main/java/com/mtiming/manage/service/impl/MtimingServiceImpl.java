/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package com.mtiming.manage.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.base.Function;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mtiming.manage.TimingConstants;
import com.mtiming.manage.mapper.PointsFLowMapper;
import com.mtiming.manage.mapper.RaceCatMasterMapper;
import com.mtiming.manage.mapper.RaceGunInfoMapper;
import com.mtiming.manage.pojo.*;
import com.mtiming.manage.service.MtimingService;
import org.springframework.stereotype.Service;

/**
 * @author cui
 * @version MtimingServiceImpl, v0.1 2019/2/28 17:42
 */
@Service
public class MtimingServiceImpl implements MtimingService {

    @Autowired
    private PointsFLowMapper pointsFLowMapper;

    @Autowired
    private RaceGunInfoMapper raceGunInfoMapper;

    @Autowired
    private RaceCatMasterMapper raceCatMasterMapper;

    @Override
    public List<PointsFLow> getPointFlow(Integer courseId) {

        PointsFLowExample example = new PointsFLowExample();
        example.or().andCourseidEqualTo(courseId);
        example.setOrderByClause(TimingConstants.POINTFLOW_ORDER_BY_KEY);
        return pointsFLowMapper.selectByExample(example);
    }


    @Override
    public  RaceGunInfo getRaceGunInfo(Integer courseID) {

        RaceGunInfoExample example = new RaceGunInfoExample();
        example.or().andRaceEqualTo(courseID);
        List<RaceGunInfo> lstRaceInfo = raceGunInfoMapper.selectByExample(example);

        if (lstRaceInfo.size() > 0) {
            RaceGunInfo raceGunInfo = lstRaceInfo.get(0);
            if (Strings.isNullOrEmpty(raceGunInfo.getGuntime())) {
                raceGunInfo.setGuntime(raceGunInfo.getPlannedguntime());
            }
            return raceGunInfo;
        }
        return null;
    }


    @Override
    public List<String> getColumns() {
        List<String> columns = Lists.newArrayList();
        columns.addAll(Arrays.asList(TimingConstants.DEFAULT_RESULT_TABLE_COLUMNS));
        List<PointsFLow> lstPoint = getMeasuredKeys();
        columns.addAll(Lists.transform(lstPoint, new Function<PointsFLow, String>() {
            @Override
            public String apply(PointsFLow pointsFLow) {
                return pointsFLow.getPoints();
            }
        }));
        return columns;
    }

    /**
     * 结果表测量数据columns
     *
     * @return
     */
    private List<PointsFLow> getMeasuredKeys() {
        PointsFLowExample example = new PointsFLowExample();
        //默认courseid=0定义结果表中字段名字
        example.or().andCourseidEqualTo(0);
        return pointsFLowMapper.selectByExample(example);
    }


    @Override
    public Map<Integer, List<String>> getCourseCats() {
        Map<Integer, List<String>> courceCatsMap = Maps.newHashMap();
        List<RaceCatMaster> lstRaceCat = raceCatMasterMapper.selectByExample(new RaceCatMasterExample());

        for (RaceCatMaster raceCatMaster : lstRaceCat) {
            Integer courceId = raceCatMaster.getCourseid();
            if (courceCatsMap.get(courceId) == null) {
                courceCatsMap.put(courceId, Lists.<String>newArrayList());
            }
            courceCatsMap.get(courceId).add(raceCatMaster.getRacecat());
        }

        return courceCatsMap;

    }

    @Override
    public List<RaceCatMaster> getRaceCatMaster() {
        return raceCatMasterMapper.selectByExample(new RaceCatMasterExample());
    }

}
