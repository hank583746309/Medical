package com.hoo.company.medical.commodity.service;

import java.util.List;

import com.hoo.company.medical.commodity.model.CommodityModel;

public interface ICommodityService {
	
	public List<CommodityModel> queryLt(CommodityModel model);
}
