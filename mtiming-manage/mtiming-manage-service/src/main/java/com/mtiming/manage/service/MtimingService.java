package com.mtiming.manage.service;

import com.mtiming.manage.pojo.*;

import java.util.List;
import java.util.Map;

/**
 * @author cui
 * @version MtimingService, v0.1 2019/2/28 17:41
 */
public interface MtimingService {

    /**
     * 计时获取流程
     *
     * @param courseId
     * @return
     */
    List<PointsFLow> getPointFlow(Integer courseId);



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
}
