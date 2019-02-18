package com.mtiming.timing.service;

import java.util.List;

import com.mtiming.manage.pojo.RunnerInfo;
import com.mtiming.manage.pojo.RunnerInfoExample;

/**
 * @author cui
 * @version RunnerService, v0.1 2018/12/24 11:43
 */
public interface RunnerService {

    List<RunnerInfo> queryRunners(RunnerInfoExample example);

}
