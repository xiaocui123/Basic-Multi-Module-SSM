package com.mtiming.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.mtiming.manage.mapper.SysRoleInfoMapper;
import com.mtiming.manage.mapper.SysUserRoleMapper;
import com.mtiming.manage.pojo.SysRoleInfo;
import com.mtiming.manage.pojo.SysUserRoleKey;
import com.mtiming.manage.pojo.UserInfo;
import com.mtiming.manage.qvo.AddUserRoleQO;
import com.mtiming.manage.service.UserInfoService;
import com.mtiming.manage.vo.BaseResultBean;
import com.mtiming.manage.vo.CommonTreeVO;
import com.sun.istack.internal.Nullable;

/**
 * Created by cui on 2017/5/27.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private SysRoleInfoMapper sysRoleMapper;

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @RequestMapping("add")
    @ResponseBody
    public UserInfo add(@RequestBody UserInfo userInfo) {
        userInfoService.add(userInfo);
        return userInfo;
    }

    @RequestMapping("update")
    @ResponseBody
    public BaseResultBean update(@RequestBody UserInfo userInfo) {
        BaseResultBean result = new BaseResultBean();
        userInfoService.update(userInfo);
        return result;
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    @ResponseBody
    public BaseResultBean delete(@RequestParam String userId) {
        BaseResultBean result = new BaseResultBean();
        userInfoService.delete(userId);
        return result;
    }

    @RequestMapping(value = "queryById", method = RequestMethod.GET)
    @ResponseBody
    public UserInfo queryById(@RequestParam("userId") String userId) {
        return userInfoService.queryById(userId);
    }

    /**
     * 查询用户所属角色列表
     *
     * @param sysUserId
     * @return
     */
    @RequestMapping(value = "role", method = RequestMethod.GET)
    @ResponseBody
    public List<CommonTreeVO> queryRoles(@RequestParam("sysUserId") String sysUserId) {
        List<CommonTreeVO> result = Lists.newArrayList();
        List<SysRoleInfo> lstRoles = sysRoleMapper.queryAll();
        result.addAll(Lists.transform(lstRoles, new Function<SysRoleInfo, CommonTreeVO>() {
            @Nullable
            @Override
            public CommonTreeVO apply(@Nullable SysRoleInfo input) {
                CommonTreeVO treeVO = new CommonTreeVO();
                treeVO.setId(input.getRoleId());
                treeVO.setName(input.getRoleName());
                return treeVO;
            }
        }));
        List<SysUserRoleKey> lstHasRoles = sysUserRoleMapper.queryByStaff(sysUserId);
        List<String> hasRolesId = Lists.transform(lstHasRoles, new Function<SysUserRoleKey, String>() {
            @Nullable
            @Override
            public String apply(@Nullable SysUserRoleKey input) {
                return input.getRoleId();
            }
        });
        for (CommonTreeVO treeVO : result) {
            String roleId = treeVO.getId();
            treeVO.setChecked(hasRolesId.contains(roleId));
        }
        return result;
    }

    @RequestMapping("saveStaffRole")
    @ResponseBody
    public BaseResultBean saveStaffRole(@RequestBody AddUserRoleQO addStaffRoleQO){
        BaseResultBean result=new BaseResultBean();
        userInfoService.addRole(addStaffRoleQO.getStaffId(),addStaffRoleQO.getLstRoleId());
        return result;
    }
}
