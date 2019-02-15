package com.mtiming.manage.service.impl;


import com.mtiming.manage.mapper.SysUserMapper;
import com.mtiming.manage.pojo.SysUser;
import com.mtiming.manage.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Resource
	private SysUserMapper sysUserMapper;


	@Override
	public SysUser getById(Long id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}
}
