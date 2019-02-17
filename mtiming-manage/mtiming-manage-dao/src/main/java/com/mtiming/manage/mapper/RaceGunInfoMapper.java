package com.mtiming.manage.mapper;

import java.util.List;

import com.mtiming.manage.pojo.RaceGunInfo;
import com.mtiming.manage.pojo.RaceGunInfoExample;

public interface RaceGunInfoMapper {
    int insert(RaceGunInfo record);

    int insertSelective(RaceGunInfo record);

    List<RaceGunInfo> selectByExample(RaceGunInfoExample example);
}