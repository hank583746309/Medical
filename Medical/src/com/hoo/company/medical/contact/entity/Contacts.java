package com.hoo.company.medical.contact.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 联系人表
 * @author hank
 *
 */
@Table(name="contacts")
public class Contacts {
	@Id
	private String id;
	@Column(name = "name")
	private String name;	//姓名
	@Column(name="tel")
	private String tel;		//电话
	@Column(name="home_tel")
	private String homeTel;//家庭电话
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public String getHomeTel() {
		return homeTel;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}
	
}
