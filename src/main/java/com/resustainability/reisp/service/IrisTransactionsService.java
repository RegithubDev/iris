package com.resustainability.reisp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resustainability.reisp.dao.IrisTransactionsDao;
import com.resustainability.reisp.dao.IrisUserDao;
import com.resustainability.reisp.model.Transaction;
import com.resustainability.reisp.model.User;


@Service
public class IrisTransactionsService {

	@Autowired
	IrisTransactionsDao dao;

	public boolean uploadCollectData(Transaction obj) throws Exception{
		return dao.uploadCollectData(obj);
	}


}
