package com.mtiming.manage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.github.pagehelper.PageHelper;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.mtiming.manage.mapper.SysRoleInfoMapper;
import com.mtiming.manage.pojo.SysRoleInfo;
import com.mtiming.manage.pojo.SysRolePermission;
import com.mtiming.manage.qvo.SysRoleQVO;
import com.mtiming.manage.service.SysRoleService;
import com.mtiming.manage.vo.BaseResultBean;
import com.mtiming.manage.vo.Page;
import com.sun.istack.internal.Nullable;

/**
 * Created by cui on 2017/5/31.
 */
@Controller
@RequestMapping("/sysrole")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @Autowired
    private SysRoleInfoMapper sysRoleMapper;

    @RequestMapping("init")
    public String init() {
        return "sys/sysrolelist";
    }

    @RequestMapping(value = "queryAll")
    @ResponseBody
    public Page<SysRoleQVO> queryAll(@RequestBody Page<SysRoleQVO> page, HttpServletRequest request) {
        PageHelper.offsetPage(page.getOffset(), page.getLimit());
        List<SysRoleInfo> lstSysRole = sysRoleMapper.queryAll();
        com.github.pagehelper.Page<SysRoleInfo> result = (com.github.pagehelper.Page<SysRoleInfo>) lstSysRole;
        page.setTotal((int) result.getTotal());

        List<SysRoleQVO> lstSysRoleVO = Lists.newArrayList();
        for (SysRoleInfo sysRole : lstSysRole) {
            SysRoleQVO vo = new SysRoleQVO();
            BeanUtils.copyProperties(sysRole, vo);
            List<SysRolePermission> lstPermission = sysRoleService.queryPermission(sysRole.getRoleId());
            List<String> lstPermissionId = Lists.transform(lstPermission, new Function<SysRolePermission, String>() {
                @Nullable
                @Override
                public String apply(@Nullable SysRolePermission input) {
                    return input.getPermissionId();
                }
            });
            vo.getLstPermissionId().addAll(lstPermissionId);
            lstSysRoleVO.add(vo);
        }
        page.setRows(lstSysRoleVO);
        return page;
    }

    @RequestMapping("add")
    @ResponseBody
    public BaseResultBean add(@RequestBody SysRoleQVO sysRoleQVO, HttpServletRequest request) {
        BaseResultBean result = new BaseResultBean();
        sysRoleService.add(sysRoleQVO, sysRoleQVO.getLstPermissionId());
        return result;
    }

    @RequestMapping("update")
    @ResponseBody
    public BaseResultBean update(@RequestBody SysRoleQVO sysRoleQVO, HttpServletRequest request) {
        BaseResultBean result = new BaseResultBean();
        sysRoleService.update(sysRoleQVO, sysRoleQVO.getLstPermissionId());
        return result;
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    @ResponseBody
    public BaseResultBean delete(@RequestParam("sysRoleId") String sysRoleId) {
        BaseResultBean result = new BaseResultBean();
        sysRoleService.delete(sysRoleId);
        return result;
    }
}
