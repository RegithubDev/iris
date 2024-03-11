package com.resustainability.reisp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resustainability.reisp.dao.IrisDataManagementDao;
import com.resustainability.reisp.model.DataManagement;


@Service
public class IrisDataManagementService {

	@Autowired
	IrisDataManagementDao dao;

	public List<DataManagement> getSBUFilterListForDM(DataManagement obj) throws Exception {
		return dao.getSBUFilterListForDM(obj);
	}

	public List<DataManagement> getDeptFilterListForDM(DataManagement obj)throws Exception {
		return dao.getDeptFilterListForDM(obj);
	}

	public List<DataManagement> getSiteFilterListForDM(DataManagement obj) throws Exception {
		return dao.getSiteFilterListForDM(obj);
	}

	public List<DataManagement> getDataManagementList(DataManagement obj, int startIndex, int offset,
			String searchParameter) throws Exception {
		return dao.getDataManagementList(obj,startIndex,offset,searchParameter);
	}

	public int getTotalRecords(DataManagement obj, String searchParameter) throws Exception {
		return dao.getTotalRecords(obj,searchParameter);
	}

	public boolean updateCollect(DataManagement obj) throws Exception {
		return dao.updateCollect(obj);
	}
	
}
