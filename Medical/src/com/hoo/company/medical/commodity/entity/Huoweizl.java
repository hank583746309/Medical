package com.hoo.company.medical.commodity.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 货位资料表[id估计在 ucd的时候会问题]
 * @author hank
 *
 */
@Table(name = "huoweizl")
public class Huoweizl {
	@Id
	private String hw;		//货位内码
	@Column(name="hwbh")
	private String hwbh;	//货位编号
	@Column(name="huowname")
	private String huowname;//货位名称
	@Column(name="duifbsh")
	private String duifbsh; //对方标识
	
	public String getHw() {
		return hw;
	}
	public String getHwbh() {
		return hwbh;
	}
	public String getHuowname() {
		return huowname;
	}
	public String getDuifbsh() {
		return duifbsh;
	}
	public void setHw(String hw) {
		this.hw = hw;
	}
	public void setHwbh(String hwbh) {
		this.hwbh = hwbh;
	}
	public void setHuowname(String huowname) {
		this.huowname = huowname;
	}
	public void setDuifbsh(String duifbsh) {
		this.duifbsh = duifbsh;
	}
	
	
}
