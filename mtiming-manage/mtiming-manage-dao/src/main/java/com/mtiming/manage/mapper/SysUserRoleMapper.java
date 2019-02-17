package com.mtiming.manage.mapper;

import java.util.List;

import com.mtiming.manage.pojo.SysUserRoleKey;

public interface SysUserRoleMapper {
    int deleteByPrimaryKey(SysUserRoleKey key);

    int insert(SysUserRoleKey record);

    int insertSelective(SysUserRoleKey record);

    /**
     * 查询用户所属角色信息
     * @param staffId
     * @return
     */
    List<SysUserRoleKey> queryByStaff(String staffId);

    //删除用户的角色
    int deleteByStaff(String staffId);
}