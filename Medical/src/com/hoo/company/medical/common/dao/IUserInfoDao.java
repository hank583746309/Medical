package com.hoo.company.medical.common.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hoo.company.medical.common.entity.UserInfoo;

public interface IUserInfoDao {

	public List<UserInfoo> queryLt(@Param("user")UserInfoo user);
	
}
