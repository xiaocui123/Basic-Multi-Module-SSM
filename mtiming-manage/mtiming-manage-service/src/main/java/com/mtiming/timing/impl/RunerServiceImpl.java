/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package com.mtiming.timing.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtiming.manage.mapper.RunnerInfoMapper;
import com.mtiming.manage.pojo.RunnerInfo;
import com.mtiming.manage.pojo.RunnerInfoExample;
import com.mtiming.timing.RunnerService;

/**
 * @author cui
 * @version RunerServiceImpl, v0.1 2018/12/24 11:44
 */
@Service
public class RunerServiceImpl implements RunnerService {

    @Autowired
    private RunnerInfoMapper runnerInfoMapper;

    @Override
    public List<RunnerInfo> queryRunners(RunnerInfoExample example) {
        List<RunnerInfo> lstRunner = runnerInfoMapper.selectByExample(example);
        return lstRunner;
    }
}
