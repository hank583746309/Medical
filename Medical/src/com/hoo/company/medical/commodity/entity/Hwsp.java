package com.hoo.company.medical.commodity.entity;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 货位商品
 * @author hank
 *
 */
@Table(name="hwsp")
public class Hwsp {
	@Column(name="hw")
	private String hw;	//货位内码
	@Column(name="spid")
	private String spid;//商品内码
	@Column(name="hwshl")
	private int hwshl;  //货位数量
	
	public String getHw() {
		return hw;
	}
	public String getSpid() {
		return spid;
	}
	public int getHwshl() {
		return hwshl;
	}
	public void setHw(String hw) {
		this.hw = hw;
	}
	public void setSpid(String spid) {
		this.spid = spid;
	}
	public void setHwshl(int hwshl) {
		this.hwshl = hwshl;
	}
	
	
}
