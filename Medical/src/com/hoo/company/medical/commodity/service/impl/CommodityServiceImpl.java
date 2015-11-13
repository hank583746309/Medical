package com.hoo.company.medical.commodity.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hoo.company.medical.commodity.dao.ICommodityDao;
import com.hoo.company.medical.commodity.model.CommodityModel;
import com.hoo.company.medical.commodity.service.ICommodityService;

@Service("commodityService")
public class CommodityServiceImpl implements ICommodityService {

	@Resource
	ICommodityDao commodityDao;
	
	public List<CommodityModel> queryLt(CommodityModel model) {
		return commodityDao.queryLt(model);
	}

}
