package com.hoo.company.medical.rpc.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gilight.commons.EncryptionUtils;

import com.hoo.company.medical.common.entity.UserInfoo;
import com.hoo.company.medical.common.service.IUserInfoService;
import com.hoo.company.medical.rpc.ICommonRpc;

@Service("commonRpc")
public class CommonRpcImpl implements ICommonRpc {
	
	@Resource
	IUserInfoService userService;
	
	public boolean login(String username, String password) throws Exception {
		UserInfoo info = new UserInfoo();
		info.setUserName(username);
		List<UserInfoo> list = userService.queryLt(info);
		if(null == list || list.size() == 0){ throw new Exception("该用户不存在."); }
		info = list.get(0);
		if(EncryptionUtils.toMD5(password).equals(info.getUserPwd())){
			return true;
		}else{
			throw new Exception("密码错误.");
		}
	}

}
