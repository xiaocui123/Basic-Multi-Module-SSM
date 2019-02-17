package com.mtiming.manage.mapper;

import java.util.List;

import com.mtiming.manage.pojo.SysRoleInfo;

public interface SysRoleInfoMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(SysRoleInfo record);

    int insertSelective(SysRoleInfo record);

    SysRoleInfo selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(SysRoleInfo record);

    int updateByPrimaryKey(SysRoleInfo record);

    List<SysRoleInfo> queryAll();
}