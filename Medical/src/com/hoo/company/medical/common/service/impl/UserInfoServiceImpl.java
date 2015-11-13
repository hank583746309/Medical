package com.hoo.company.medical.common.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hoo.company.medical.common.dao.IUserInfoDao;
import com.hoo.company.medical.common.entity.UserInfoo;
import com.hoo.company.medical.common.service.IUserInfoService;

@Service("userInfoService")
public class UserInfoServiceImpl implements IUserInfoService {

	@Resource
	IUserInfoDao userDao;

	public List<UserInfoo> queryLt(UserInfoo user) {
		return userDao.queryLt(user);
	}

}
