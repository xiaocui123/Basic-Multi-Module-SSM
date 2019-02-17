package com.mtiming.manage.mapper;

import java.util.List;

import com.mtiming.manage.pojo.RaceCatMaster;
import com.mtiming.manage.pojo.RaceCatMasterExample;

public interface RaceCatMasterMapper {
    int insert(RaceCatMaster record);

    int insertSelective(RaceCatMaster record);

    List<RaceCatMaster> selectByExample(RaceCatMasterExample example);
}