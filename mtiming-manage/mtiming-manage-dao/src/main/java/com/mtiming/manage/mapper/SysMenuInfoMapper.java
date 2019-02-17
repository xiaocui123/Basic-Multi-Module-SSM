package com.mtiming.manage.mapper;

import java.util.List;

import com.mtiming.manage.pojo.SysMenuInfo;

public interface SysMenuInfoMapper {
    int deleteByPrimaryKey(String menuId);

    int insert(SysMenuInfo record);

    int insertSelective(SysMenuInfo record);

    SysMenuInfo selectByPrimaryKey(String menuId);

    int updateByPrimaryKeySelective(SysMenuInfo record);

    int updateByPrimaryKey(SysMenuInfo record);

    List<SysMenuInfo> queryByUser(String userId);

    List<SysMenuInfo> queryAll();
}