package com.hoo.company.medical.commodity.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hoo.company.medical.commodity.model.CommodityModel;

public interface ICommodityDao {
	public List<CommodityModel> queryLt(@Param("commodity")CommodityModel commodity);
}
