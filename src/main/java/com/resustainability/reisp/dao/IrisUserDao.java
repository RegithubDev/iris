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
import com.resustainability.reisp.model.User;

@Repository
public class IrisUserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	DataSource dataSource;

	@Autowired
	DataSourceTransactionManager transactionManager;

	public int getTotalRecords(User obj, String searchParameter) throws Exception {
		int totalRecords = 0;
		try {
			int arrSize = 0;
			String qry = "select count(DISTINCT um.email_id) as total_records FROM [user_management] um "
			+ " where um.email_id <> '' ";
			
			
			Object[] pValues = new Object[arrSize];
			int i = 0;
			
			totalRecords = jdbcTemplate.queryForObject( qry,pValues,Integer.class);
		}catch(Exception e){ 
			e.printStackTrace();
			throw new Exception(e);
		}
		return totalRecords;
	}

	public List<User> getUserList(User obj, String searchParameter, int offset, String searchParameter2) throws Exception {
		List<User> objsList = null;
		try {
			int arrSize = 0;
			jdbcTemplate = new JdbcTemplate(dataSource);
			String qry = "SELECT [id]"
					+ "      ,[user_name]"
					+ "      ,[email_id]"
					+ "      ,[password]"
					+ "      ,[mobile_number]"
					+ "      ,[sbu]"
					+ "      ,[categories]"
					+ "      ,[roles]"
					+ "      ,[site_name]"
					+ "      ,[notfilled_datadates]"
					+ "      ,[status]"
					+ "      ,[created_by]"
					+ "      ,[created_date]"
					+ "      ,[modified_by]"
					+ "      ,[modified_date] from [user_management] um ";
			
			qry = qry + " order by um.user_name asc";
			Object[] pValues = new Object[arrSize];
			int i = 0;
		
			objsList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<User>(User.class));	
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public boolean addUserIris(User obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "INSERT INTO [user_management] "
					+ "		( user_name"
					+ "      ,email_id"
					+ "      ,mobile_number"
					+ "      ,sbu"
					+ "      ,categories"
					+ "      ,roles"
					+ "      ,site_name"
					+ "      ,notfilled_datadates"
					+ "      ,status,created_by,created_by) "
					+ "		VALUES "
					+ "		( :user_name"
					+ "      ,:email_id"
					+ "      ,:mobile_number"
					+ "      ,:sbu"
					+ "      ,:categories"
					+ "      ,:roles"
					+ "      ,:site_name"
					+ "      ,:notfilled_datadates"
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

	public User getUserDetails(User user) throws Exception {
		User obj = null;
		try {
			String qry = "SELECT [id]"
					+ "      ,[user_name]"
					+ "      ,[email_id]"
					+ "      ,[password]"
					+ "      ,[mobile_number]"
					+ "      ,[sbu]"
					+ "      ,[categories]"
					+ "      ,[roles]"
					+ "      ,[city]"
					+ "      ,[site_name]"
					+ "      ,[notfilled_datadates]"
					+ "      ,[status]"
					+ "      ,[created_by]"
					+ "      ,FORMAT (um.created_date, 'dd-MMM-yy') as[created_date]"
					+ "      ,[modified_by]"
					+ "      ,FORMAT (um.modified_date, 'dd-MMM-yy') as[modified_date] FROM [user_management] um  ";
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
			obj = (User)jdbcTemplate.queryForObject(qry, pValues, new BeanPropertyRowMapper<User>(User.class));

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return obj;
	}

	public boolean updateUserIris(User obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "UPDATE [user_management] set "
					+ "		user_name= :user_name"
					+ "      ,email_id= :email_id"
					+ "      ,mobile_number= :mobile_number"
					+ "      ,sbu= :sbu"
					+ "      ,categories= :categories"
					+ "      ,roles= :roles"
					+ "      ,site_name= :site_name"
					+ "      ,notfilled_datadates= :notfilled_datadates"
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
	
	
	
	
}
