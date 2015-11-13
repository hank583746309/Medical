package com.hoo.company.medical.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="userinfoo")
public class UserInfoo {
	@Id
	private String id;
	@Column(name="username")
	private String userName;
	@Column(name="userpwd")
	private String userPwd;
	@Column(name="usercode")
	private String userCode;
	
	
	public String getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
	
	
}
