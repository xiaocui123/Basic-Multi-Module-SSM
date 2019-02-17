package com.mtiming.manage.mapper;

import java.util.List;

import com.mtiming.manage.pojo.DeptUserTreeVO;
import com.mtiming.manage.pojo.SysDeptInfo;

public interface SysDeptInfoMapper {
    int deleteByPrimaryKey(String departmentId);

    int insert(SysDeptInfo record);

    int insertSelective(SysDeptInfo record);

    SysDeptInfo selectByPrimaryKey(String departmentId);

    int updateByPrimaryKeySelective(SysDeptInfo record);

    int updateByPrimaryKey(SysDeptInfo record);

    List<DeptUserTreeVO> queryTree();
}