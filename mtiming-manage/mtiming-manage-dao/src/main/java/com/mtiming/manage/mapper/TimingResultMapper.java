package com.mtiming.manage.mapper;

import java.util.List;
import java.util.Map;

import com.mtiming.manage.pojo.TimingFinalResultType;
import org.apache.ibatis.annotations.Param;

import com.mtiming.manage.pojo.RunnerInfo;
import com.mtiming.manage.pojo.TimingFinalResultType;

public interface TimingResultMapper {

    int dropTable(@Param("tableName") String tableName);

    int existTable(String tableName);

    void createTimingResult(@Param("tableName") String tableName, @Param("cloums") List<String> cloums);


    void saveResult(@Param("tableName") String tableName, @Param("params") Map<String, String> params);

    List<Map<String, Object>> selectTimingResult(@Param("tableName") String tableName, @Param("runnerInfo") RunnerInfo runnerInfo);

    List<TimingFinalResultType> selectTimingFinalResult(@Param("tableName") String tableName, @Param("runnerInfo") RunnerInfo runnerInfo);

}
