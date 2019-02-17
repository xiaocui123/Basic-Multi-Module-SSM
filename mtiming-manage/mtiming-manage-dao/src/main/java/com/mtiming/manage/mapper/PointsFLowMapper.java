package com.mtiming.manage.mapper;

import java.util.List;

import com.mtiming.manage.pojo.PointsFLow;
import com.mtiming.manage.pojo.PointsFLowExample;

public interface PointsFLowMapper {
    int insert(PointsFLow record);

    int insertSelective(PointsFLow record);

    List<PointsFLow> selectByExample(PointsFLowExample example);
}