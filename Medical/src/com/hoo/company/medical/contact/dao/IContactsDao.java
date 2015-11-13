package com.hoo.company.medical.contact.dao;

import java.util.List;

import com.hoo.company.medical.contact.entity.Contacts;

public interface IContactsDao {
	
	/**
	 * 遍历联系人
	 * @return
	 */
	public List<Contacts> queryLt();
}
