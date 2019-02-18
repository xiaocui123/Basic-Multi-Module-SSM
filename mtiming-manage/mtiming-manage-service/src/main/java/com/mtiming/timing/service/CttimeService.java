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
     * 初步计算跑者通过Location的实际时间
     *
     * @param runnerInfo
     * @param raceGunInfo
     * @return
     */
    Map<String, Object> calcRunnerRealTimePassLocation(RunnerInfo runnerInfo, List<PointsFLow> pointsFLows, RaceGunInfo raceGunInfo);

    /**
     * 计时获取流程
     *
     * @param courseId
     * @return
     */
    List<PointsFLow> getPointFlow(Integer courseId);

    /**
     * 将计算结果保存到Excel中
     */
    void saveResult2Excel();

    /**
     * 计算计时结果
     */
    Map<String, Object> calcResult(RunnerInfo runner, List<PointsFLow> lstPointFlow, Integer courseID);

    /**
     * 获取动态列名称
     *
     * @return
     */
    List<String> getColumns();

    /**
     * 获取比赛类型
     *
     * @return
     */
    Map<Integer, List<String>> getCourseCats();

    List<RaceCatMaster> getRaceCatMaster();

    RaceGunInfo getRaceGunInfo(Integer courseID);

    /**
     * 获取Tag的所有比赛时间
     * @param tag
     * @return
     */
    List<CttimesInfo> getMeasuredRecordByTag(String tag);
}

