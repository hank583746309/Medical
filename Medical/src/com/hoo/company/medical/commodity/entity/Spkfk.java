package com.hoo.company.medical.commodity.entity;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 商品资料表
 * @author hank
 */
@Table(name="spkfk")
public class Spkfk {
	@Column(name="spid")
	private String spid;	//商品内码
	@Column(name="spbh")
	private String spbh;	//商品编号
	@Column(name="spmch")
	private String spmch;	//商品名称
	@Column(name="shpgg")
	private String shpgg;	//商品规格
	@Column(name="shpchd")
	private String shpchd;	//商品产地
	@Column(name="pizhwh")
	private String pizhwh;	//批准文号
	@Column(name="jixing")
	private String jixing;	//剂型
	
	public String getSpid() {
		return spid;
	}
	public String getSpbh() {
		return spbh;
	}
	public String getSpmch() {
		return spmch;
	}
	public String getShpgg() {
		return shpgg;
	}
	public String getShpchd() {
		return shpchd;
	}
	public String getPizhwh() {
		return pizhwh;
	}
	public String getJixing() {
		return jixing;
	}
	public void setSpid(String spid) {
		this.spid = spid;
	}
	public void setSpbh(String spbh) {
		this.spbh = spbh;
	}
	public void setSpmch(String spmch) {
		this.spmch = spmch;
	}
	public void setShpgg(String shpgg) {
		this.shpgg = shpgg;
	}
	public void setShpchd(String shpchd) {
		this.shpchd = shpchd;
	}
	public void setPizhwh(String pizhwh) {
		this.pizhwh = pizhwh;
	}
	public void setJixing(String jixing) {
		this.jixing = jixing;
	}
	
}
