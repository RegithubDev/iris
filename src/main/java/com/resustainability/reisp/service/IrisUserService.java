package com.resustainability.reisp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resustainability.reisp.dao.IrisUserDao;
import com.resustainability.reisp.model.User;


@Service
public class IrisUserService {

	@Autowired
	IrisUserDao dao;

	public int getTotalRecords(User obj, String searchParameter) throws Exception {
		return dao.getTotalRecords(obj,searchParameter);
	}

	public List<User> getUserList(User obj, int startIndex, int offset, String searchParameter) throws Exception {
		return dao.getUserList(obj,searchParameter,offset,searchParameter);
	}

	public boolean addUserIris(User obj) throws Exception {
		return dao.addUserIris(obj);
	}

	public User getUserDetails(User user)throws Exception {
		return dao.getUserDetails(user);
	}

	public boolean updateUserIris(User obj) throws Exception {
		return dao.updateUserIris(obj);
	}
}
