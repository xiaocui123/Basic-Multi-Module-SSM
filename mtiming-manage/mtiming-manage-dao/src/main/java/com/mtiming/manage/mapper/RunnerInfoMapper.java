package com.mtiming.manage.mapper;

import java.util.List;

import com.mtiming.manage.pojo.RunnerInfo;
import com.mtiming.manage.pojo.RunnerInfoExample;

public interface RunnerInfoMapper {
    int insert(RunnerInfo record);

    int insertSelective(RunnerInfo record);

    List<RunnerInfo> selectByExample(RunnerInfoExample example);
}