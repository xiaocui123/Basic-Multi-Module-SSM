package com.mtiming.manage.service;

import java.util.List;

import com.mtiming.manage.pojo.DeptUserTreeVO;
import com.mtiming.manage.pojo.SysDeptInfo;

/**
 * Created by cui on 2017/5/27.
 */
public interface SysDeptInfoService {

    int add(SysDeptInfo sysDeptInfo);

    int update(SysDeptInfo sysDeptInfo);

    int delete(String deptId);

    /**
     * 查询系统内部门人员树
     * @return
     */
    List<DeptUserTreeVO> queryDeptUser();

}
