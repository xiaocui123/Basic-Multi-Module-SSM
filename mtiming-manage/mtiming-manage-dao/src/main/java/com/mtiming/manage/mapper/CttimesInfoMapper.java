package com.mtiming.manage.mapper;

import java.util.List;

import com.mtiming.manage.pojo.CttimesInfo;
import com.mtiming.manage.pojo.CttimesInfoExample;

public interface CttimesInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CttimesInfo record);

    int insertSelective(CttimesInfo record);

    List<CttimesInfo> selectByExample(CttimesInfoExample example);

    CttimesInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CttimesInfo record);

    int updateByPrimaryKey(CttimesInfo record);
}