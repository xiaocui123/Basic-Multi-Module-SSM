package com.mtiming.manage.service;

import java.util.List;

import com.mtiming.manage.pojo.SysRoleInfo;
import com.mtiming.manage.pojo.SysRolePermission;
import com.mtiming.manage.vo.Page;

/**
 * Created by cui on 2017/5/31.
 */
public interface SysRoleService {

    /**
     * 分布查询角色列表
     *
     * @param page
     * @return
     */
    List<SysRoleInfo> queryAll(Page<SysRoleInfo> page);

    /**
     * 查询角色包含的权限ID列表
     * @param sysRoleId
     * @return
     */
    List<SysRolePermission> queryPermission(String sysRoleId);

    /**
     * 添加角色，角色权限对应关系
     *
     * @param sysRole
     * @param lstPermissionId
     * @return
     */
    int add(SysRoleInfo sysRole, List<String> lstPermissionId);

    /**
     * 更新
     *
     * @param sysRole
     * @param lstPermissionId
     * @return
     */
    int update(SysRoleInfo sysRole, List<String> lstPermissionId);

    int delete(String sysRoleId);
}
