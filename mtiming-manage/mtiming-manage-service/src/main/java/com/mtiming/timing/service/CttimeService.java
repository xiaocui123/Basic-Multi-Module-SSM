package com.mtiming.timing.service;

import com.mtiming.manage.pojo.*;

import java.util.List;
import java.util.Map;

/**
 * @author cui
 * @version CttimeService, v0.1 2018/12/12 9:42
 */
public interface CttimeService {

    /**
     * 计算计时结果
     */
    Map<String, Object> calcResult(RunnerInfo runner, List<PointsFLow> lstPointFlow, RaceGunInfo raceGunInfo);

    List<CttimesInfo> getMeasuredRecordByTag(String tag);

}

