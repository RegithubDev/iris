package com.resustainability.reisp.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.util.StringUtils;

import com.resustainability.reisp.common.EncryptDecrypt;
import com.resustainability.reisp.model.Site;

@Repository
public class IrisSiteDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	DataSource dataSource;

	@Autowired
	DataSourceTransactionManager transactionManager;

	public int getTotalRecords(Site obj, String searchParameter) throws Exception {
		int totalRecords = 0;
		try {
			int arrSize = 0;
			String qry = "select count(DISTINCT um.site_name) as total_records FROM [site] um "
			+ " where um.site_name <> '' ";
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				qry = qry + " and  um.sbu_code = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getState())) {
				qry = qry + " and um.state = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCity())) {
				qry = qry + " and um.city = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(searchParameter)) {
				qry = qry + " and (um.user_name like ? or um.city like ?"
						+ " or um.email_id like ? or um.sbu_code like ? or um.categories like ? or um.state like ? "
						+ "or um.status like ? )";
				arrSize++;
				arrSize++;
				arrSize++;
				arrSize++;
				arrSize++;
				arrSize++;
				arrSize++;
			}	
			
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				pValues[i++] = obj.getSbu_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getState())) {
				pValues[i++] = obj.getState();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCity())) {
				pValues[i++] = obj.getCity();
			}
			if(!StringUtils.isEmpty(searchParameter)) {
				pValues[i++] = "%"+searchParameter+"%";
				pValues[i++] = "%"+searchParameter+"%";
				pValues[i++] = "%"+searchParameter+"%";
				pValues[i++] = "%"+searchParameter+"%";
				pValues[i++] = "%"+searchParameter+"%";
				pValues[i++] = "%"+searchParameter+"%";
				pValues[i++] = "%"+searchParameter+"%";
			}
			
			totalRecords = jdbcTemplate.queryForObject( qry,pValues,Integer.class);
		}catch(Exception e){ 
			e.printStackTrace();
			throw new Exception(e);
		}
		return totalRecords;
	}

	public List<Site> getSiteList(Site obj, int startIndex, int offset, String searchParameter) throws Exception {
		List<Site> objsList = null;
		try {
			int arrSize = 0;
			jdbcTemplate = new JdbcTemplate(dataSource);
			String qry = "SELECT s.[id]"
					+ "        ,s.[state]"
					+ "      ,s.[city]"
					+ "      ,s.[sbu_code]"
					+ "      ,[sbu_name],latlon"
					+ "      ,s.[site_name]"
					+ "      ,s.[status]"
					+ "      ,um.user_name as [created_by]"
					+ "      ,FORMAT (um.created_date, 'dd-MMM-yy') as[created_date]"
					+ "      ,um1.user_name as [modified_by]"
					+ "      ,FORMAT (um.modified_date, 'dd-MMM-yy') as[modified_date] FROM [site] s  "
					+ " left join user_management um on s.created_by = um.id   "
					+ " left join sbu sb on s.sbu_code = sb.sbu_code   "
					+ " left join user_management um1 on s.modified_by = um1.id  "
					+ "where um.id is not null  ";
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				qry = qry + " and  s.sbu_code = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getState())) {
				qry = qry + " and s.state = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCity())) {
				qry = qry + " and s.city = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(searchParameter)) {
				qry = qry + " and (s.state like ? or s.city like ?"
						+ " or s.sbu_code like ? or s.sbu_code like ? or s.categories like ? or s.state like ? "
						+ "or s.status like ? )";
				arrSize++;
				arrSize++;
				arrSize++;
				arrSize++;
				arrSize++;
				arrSize++;
				arrSize++;
			}	
			if(!StringUtils.isEmpty(startIndex) && !StringUtils.isEmpty(offset)) {
				qry = qry + " ORDER BY um.user_name asc offset ? rows  fetch next ? rows only";	
				arrSize++;
				arrSize++;
			}
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				pValues[i++] = obj.getSbu_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getState())) {
				pValues[i++] = obj.getState();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCity())) {
				pValues[i++] = obj.getCity();
			}
			if(!StringUtils.isEmpty(searchParameter)) {
				pValues[i++] = "%"+searchParameter+"%";
				pValues[i++] = "%"+searchParameter+"%";
				pValues[i++] = "%"+searchParameter+"%";
				pValues[i++] = "%"+searchParameter+"%";
				pValues[i++] = "%"+searchParameter+"%";
				pValues[i++] = "%"+searchParameter+"%";
				pValues[i++] = "%"+searchParameter+"%";
			}
			if(!StringUtils.isEmpty(startIndex) && !StringUtils.isEmpty(offset)) {
				pValues[i++] = startIndex;
				pValues[i++] = offset;
			}
			objsList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<Site>(Site.class));	
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public boolean addSiteIris(Site obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "INSERT INTO [site] "
					+ "		( state"
					+ "      ,city"
					+ "      ,sbu_code"
					+ "      ,site_name,latlon"
					+ "      ,status,created_by,created_date) "
					+ "		VALUES "
					+ "		( :state"
					+ "      ,:city"
					+ "      ,:sbu_code"
					+ "      ,:site_name,:latlon"
					+ "      ,:status,:created_by,getdate())";
			BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(obj);		 
		    count = namedParamJdbcTemplate.update(insertQry, paramSource);
			if(count > 0) {
				flag = true;
			}
			transactionManager.commit(status);
		}catch (Exception e) {
			transactionManager.rollback(status);
			e.printStackTrace();
			throw new Exception(e);
		}
		return flag;
	}

	public Site getSiteDetails(Site user) throws Exception {
		Site obj = null;
		try {
			String qry = "SELECT s.[id]"
					+ "        ,s.[state]"
					+ "      ,s.[city]"
					+ "      ,s.[sbu_code]"
					+ "      ,[sbu_name],latlon"
					+ "      ,s.[site_name]"
					+ "      ,s.[status]"
					+ "      ,um.user_name as [created_by]"
					+ "      ,FORMAT (um.created_date, 'dd-MMM-yy') as[created_date]"
					+ "      ,um1.user_name as [modified_by]"
					+ "      ,FORMAT (um.modified_date, 'dd-MMM-yy') as[modified_date] FROM [site] s  "
					+ " left join user_management um on s.created_by = um.id   "
					+ " left join sbu sb on s.sbu_code = sb.sbu_code   "
					+ " left join user_management um1 on s.modified_by = um1.id  "
					+ "where um.id is not null  ";
			int arrSize = 0;
			if(!StringUtils.isEmpty(user) && !StringUtils.isEmpty(user.getId())) {
				qry = qry + " and um.id = ? ";
				arrSize++;
			}
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(user) && !StringUtils.isEmpty(user.getId())) {
				pValues[i++] = user.getId();
			}
			obj = (Site)jdbcTemplate.queryForObject(qry, pValues, new BeanPropertyRowMapper<Site>(Site.class));

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return obj;
	}

	public boolean updateSiteIris(Site obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "UPDATE [site] set "
					+ "		state= :state"
					+ "      ,city= :city,latlon= :latlon"
					+ "      ,sbu_code= :sbu_code"
					+ "      ,site_name= :site_name"
					+ "      ,status= :status,modified_date= getdate(),modified_by= :modified_by"
					+ " where id =  '"+obj.getId()+"'";
			BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(obj);		 
		    count = namedParamJdbcTemplate.update(insertQry, paramSource);
			if(count > 0) {
				flag = true;
			}
			transactionManager.commit(status);
		}catch (Exception e) {
			transactionManager.rollback(status);
			e.printStackTrace();
			throw new Exception(e);
		}
		return flag;
	}

	public List<Site> getSBUFilterListForSite(Site obj) throws Exception {
		List<Site> objsList = null;
		try {
			int arrSize = 0;
			jdbcTemplate = new JdbcTemplate(dataSource);
			String qry = "SELECT s.[sbu_code],sbu_name from [site] um "
					+ "left join sbu s on um.sbu_code = s.sbu_code where s.sbu_code is not null ";
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				qry = qry + " and  um.sbu_code = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getState())) {
				qry = qry + " and um.state = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCity())) {
				qry = qry + " and um.city = ? ";
				arrSize++;
			}
			qry = qry + " order by um.sbu_code asc";
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				pValues[i++] = obj.getSbu_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getState())) {
				pValues[i++] = obj.getState();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCity())) {
				pValues[i++] = obj.getCity();
			}
			objsList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<Site>(Site.class));	
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public List<Site> getStateFilterListForSite(Site obj) throws Exception {
		List<Site> objsList = null;
		try {
			int arrSize = 0;
			jdbcTemplate = new JdbcTemplate(dataSource);
			String qry = "SELECT state from [site] um where state is not null ";
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				qry = qry + " and  um.sbu_code = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getState())) {
				qry = qry + " and um.state = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCity())) {
				qry = qry + " and um.city = ? ";
				arrSize++;
			}
			qry = qry + " order by um.state asc";
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				pValues[i++] = obj.getSbu_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getState())) {
				pValues[i++] = obj.getState();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCity())) {
				pValues[i++] = obj.getCity();
			}
			objsList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<Site>(Site.class));	
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public List<Site> getCityFilterListForSite(Site obj) throws Exception {
		List<Site> objsList = null;
		try {
			int arrSize = 0;
			jdbcTemplate = new JdbcTemplate(dataSource);
			String qry = "SELECT city from [site] um where city is not null ";
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				qry = qry + " and  um.sbu_code = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getState())) {
				qry = qry + " and um.state = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCity())) {
				qry = qry + " and um.city = ? ";
				arrSize++;
			}
			qry = qry + " order by um.city asc";
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				pValues[i++] = obj.getSbu_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getState())) {
				pValues[i++] = obj.getState();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCity())) {
				pValues[i++] = obj.getCity();
			}
			objsList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<Site>(Site.class));	
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}
	
	
	
	
}