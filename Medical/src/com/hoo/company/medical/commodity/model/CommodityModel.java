package com.hoo.company.medical.commodity.model;

/**
 * 商品模型
 * 
 * @author hank
 * 
 */
public class CommodityModel {
	private String id;
	private String spbh;  //商品编号
	private String huowname; //货位名称
	private String spmch; //商品名称
	private String shpgg; //商品规格
	private String pizhwh;//批准文号
	private String jixing;//剂型
	private int hwshl;    //货位数量
	
	private String sptm;  //商品条码
	private String shpchd;//商品产地
	
	public String getId() {
		return id;
	}
	public String getSpbh() {
		return spbh;
	}
	public String getHuowname() {
		return huowname;
	}
	public String getSpmch() {
		return spmch;
	}
	public String getShpgg() {
		return shpgg;
	}
	public String getPizhwh() {
		return pizhwh;
	}
	public String getJixing() {
		return jixing;
	}
	public int getHwshl() {
		return hwshl;
	}
	public String getSptm() {
		return sptm;
	}
	public String getShpchd() {
		return shpchd;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setSpbh(String spbh) {
		this.spbh = spbh;
	}
	public void setHuowname(String huowname) {
		this.huowname = huowname;
	}
	public void setSpmch(String spmch) {
		this.spmch = spmch;
	}
	public void setShpgg(String shpgg) {
		this.shpgg = shpgg;
	}
	public void setPizhwh(String pizhwh) {
		this.pizhwh = pizhwh;
	}
	public void setJixing(String jixing) {
		this.jixing = jixing;
	}
	public void setHwshl(int hwshl) {
		this.hwshl = hwshl;
	}
	public void setSptm(String sptm) {
		this.sptm = sptm;
	}
	public void setShpchd(String shpchd) {
		this.shpchd = shpchd;
	}

}
