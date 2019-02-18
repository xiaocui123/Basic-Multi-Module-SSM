/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package com.mtiming.manage.service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.mtiming.manage.mapper.TimingResultMapper;
import com.mtiming.manage.pojo.PointsFLow;
import com.mtiming.manage.pojo.RunnerInfo;
import com.mtiming.manage.pojo.TimingFinalResultType;
import com.mtiming.manage.service.TimingResultService;
import com.mtiming.manage.vo.Page;
import com.mtiming.manage.TimingConstants;

/**
 * @author cui
 * @version TimingResultServiceImpl, v0.1 2018/12/24 11:30
 */
@Service
public class TimingResultServiceImpl implements TimingResultService {

    @Autowired
    private TimingResultMapper timingResultMapper;

    @Override
    public boolean existTable(String tableName) {
        return timingResultMapper.existTable(TimingConstants.DEFAULT_RESULT_TABLE_NAME) > 0;
    }

    @Override
    public int dropTable(String tableName) {
        return timingResultMapper.dropTable(TimingConstants.DEFAULT_RESULT_TABLE_NAME);
    }

    @Override
    public void createTimingResult(String tableName, List<String> cloums) {
        timingResultMapper.createTimingResult(tableName, cloums);
    }

    @Override
    public void saveResult(String tableName, Map<String, String> params) {
        timingResultMapper.saveResult(TimingConstants.DEFAULT_RESULT_TABLE_NAME, params);
    }


    @Override
    public List<Map<String, Object>> sortResult(List<PointsFLow> lstFlow, List<Map<String, Object>> lstResult) {

        final String startKey = lstFlow.get(0).getPoints();

        final String finishKey = lstFlow.get(lstFlow.size() - 1).getPoints();

        Collections.sort(lstResult, new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                Integer o1FinishTime = (Integer) o1.get(finishKey);
                Integer o2FinishTime = (Integer) o2.get(finishKey);
                if (o1FinishTime == null && o2FinishTime == null)
                    return 0;
                if (o1FinishTime == null)
                    return 1;
                if (o2FinishTime == null)
                    return -1;
                return o1FinishTime - o2FinishTime;
            }
        });
        //设置枪声排名信息
        for (Map<String, Object> result : lstResult) {
            result.put(TimingConstants.RANK_GUN, lstResult.indexOf(result) + 1);
        }

        Collections.sort(lstResult, new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                Integer o1Rank = null;
                Integer o1StartTime = (Integer) o1.get(startKey);
                Integer o1finishTime = (Integer) o1.get(finishKey);
                if (o1StartTime != null && o1finishTime != null) {
                    o1Rank = o1finishTime - o1StartTime;
                }

                Integer o2Rank = null;
                Integer o2StartTime = (Integer) o2.get(startKey);
                Integer o2finishTime = (Integer) o2.get(finishKey);
                if (o2StartTime != null && o2finishTime != null) {
                    o2Rank = o2finishTime - o2StartTime;
                }
                if (o1Rank == null && o2Rank == null)
                    return 0;
                if (o1Rank == null)
                    return 1;
                if (o2Rank == null)
                    return -1;
                return o1Rank - o2Rank;
            }
        });

        //设置排名信息
        for (Map<String, Object> result : lstResult) {
            result.put(TimingConstants.RANK_CAT, lstResult.indexOf(result) + 1);
        }

        return lstResult;
    }

    @Override
    public Page<TimingFinalResultType> queryForAll(RunnerInfo qo, int offset, int limit) {
        Page<TimingFinalResultType> resultPage = new Page<>();
        PageHelper.offsetPage(offset, limit);
        List<TimingFinalResultType> lstResult = timingResultMapper.selectTimingFinalResult(TimingConstants.DEFAULT_RESULT_TABLE_NAME, qo);
        com.github.pagehelper.Page<TimingFinalResultType> result = (com.github.pagehelper.Page<TimingFinalResultType>) lstResult;
        resultPage.setTotal((int) result.getTotal());
        resultPage.setRows(result.getResult());
        return resultPage;
    }

    @Override
    public Map<String, Object> getResultByTag(String tag) {
        RunnerInfo runnerInfo=new RunnerInfo();
        runnerInfo.setTag(Integer.valueOf(tag));
        List<Map<String,Object>> lstResult=timingResultMapper.selectTimingResult(TimingConstants.DEFAULT_RESULT_TABLE_NAME,runnerInfo);
        if(lstResult.size()==1){
            return lstResult.get(0);
        }
        throw new IllegalArgumentException("未查询到Runner tag = 【"+tag+"】的结果");
    }
}
