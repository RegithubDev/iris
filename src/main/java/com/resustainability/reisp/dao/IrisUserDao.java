package com.resustainability.reisp.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

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
	
	
	
	
}
