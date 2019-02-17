package com.mtiming.manage.qvo;

import java.util.List;

import com.google.common.collect.Lists;
import com.mtiming.manage.pojo.SysRoleInfo;

/**
 * 系统角色请求返回数据对象
 * Created by cui on 2017/5/31.
 */
public class SysRoleQVO extends SysRoleInfo {

    /**
     * 角色包含的权限ID list
     */
    private List<String> lstPermissionId;

    public List<String> getLstPermissionId() {
        if (lstPermissionId == null) {
            lstPermissionId = Lists.newArrayList();
        }
        return lstPermissionId;
    }

    public void setLstPermissionId(List<String> lstPermissionId) {
        this.lstPermissionId = lstPermissionId;
    }
}
