package com.hoo.company.medical.contact.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hoo.company.medical.contact.dao.IContactsDao;
import com.hoo.company.medical.contact.entity.Contacts;
import com.hoo.company.medical.contact.service.IContactsService;

@Service("contactsService")
public class ContactsServiceImpl implements IContactsService {
	
	@Resource
	IContactsDao contactsDao;
	
	public List<Contacts> queryLt(){
		return contactsDao.queryLt();
	}

}
