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
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu())) {
				qry = qry + " and  um.sbu = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite_name())) {
				qry = qry + " and um.site_name = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getRoles())) {
				qry = qry + " and um.roles = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(searchParameter)) {
				qry = qry + " and (um.user_name like ? or um.roles like ?"
						+ " or um.email_id like ? or um.sbu like ? or um.categories like ? or um.site_name like ? "
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
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu())) {
				pValues[i++] = obj.getSbu();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite_name())) {
				pValues[i++] = obj.getSite_name();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getRoles())) {
				pValues[i++] = obj.getRoles();
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

	public List<User> getUserList(User obj, int startIndex, int offset, String searchParameter) throws Exception {
		List<User> objsList = null;
		try {
			int arrSize = 0;
			jdbcTemplate = new JdbcTemplate(dataSource);
			String qry = "SELECT um.[id]"
					+ "      ,[user_name]"
					+ "      ,[email_id]"
					+ "      ,[mobile_number]"
					+ "      ,um.[sbu],sbu_name,st.site_name,c.category_name,r.role_name"
					+ "      ,[categories]"
					+ "      ,um.[roles]"
					+ "      ,[notfilled_datadates]"
					+ "      ,um.[status]"
					+ "      ,um.[created_by]"
					+ "      ,um.[created_date]"
					+ "      ,um.[modified_by]"
					+ "      ,um.[modified_date] from [user_management] um "
					+ " left join site st on um.site_name = st.id   "
					+ " left join category c on um.categories = c.category_code   "
					+ " left join roles r on um.roles = r.id   "
					+ " left join sbu sb on um.sbu = sb.sbu_code   "
					+ "where um.sbu is not null ";
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu())) {
				qry = qry + " and  um.sbu = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite_name())) {
				qry = qry + " and um.site_name = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getRoles())) {
				qry = qry + " and um.roles = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(searchParameter)) {
				qry = qry + " and (um.user_name like ? or um.roles like ?"
						+ " or um.email_id like ? or um.sbu like ? or um.categories like ? or um.site_name like ? "
						+ "or um.status like ? )";
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
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu())) {
				pValues[i++] = obj.getSbu();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite_name())) {
				pValues[i++] = obj.getSite_name();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getRoles())) {
				pValues[i++] = obj.getRoles();
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
					+ "      ,sbu,city"
					+ "      ,categories"
					+ "      ,roles"
					+ "      ,site_name"
					+ "      ,notfilled_datadates"
					+ "      ,status,created_by,created_date) "
					+ "		VALUES "
					+ "		( :user_name"
					+ "      ,:email_id"
					+ "      ,:mobile_number"
					+ "      ,:sbu,:city"
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
					+ "      ,[sbu],city"
					+ "      ,[categories]"
					+ "      ,[roles]"
					+ "      ,[city]"
					+ "      ,[site_name]"
					+ "      ,[notfilled_datadates]"
					+ "      ,[status]"
					+ "      ,[created_by]"
					+ "      ,FORMAT (um.created_date, 'dd-MMM-yy') as[created_date]"
					+ "      ,[modified_by]"
					+ "      ,FORMAT (um.modified_date, 'dd-MMM-yy') as[modified_date] FROM [user_management] um  where um.id is not null ";
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
					+ "      ,sbu= :sbu,city= :city"
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

	public List<User> getDepartmentFilterListForUser(User obj) throws Exception {
		List<User> objsList = null;
		try {
			int arrSize = 0;
			jdbcTemplate = new JdbcTemplate(dataSource);
			String qry = "SELECT [sbu],sbu_name from [user_management] um "
					+ "left join sbu s on um.sbu = s.sbu_code where sbu is not null ";
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu())) {
				qry = qry + " and  um.sbu = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite_name())) {
				qry = qry + " and um.site_name = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getRoles())) {
				qry = qry + " and um.roles = ? ";
				arrSize++;
			}
			qry = qry + " group by [sbu],sbu_name order by um.sbu asc";
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu())) {
				pValues[i++] = obj.getSbu();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite_name())) {
				pValues[i++] = obj.getSite_name();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getRoles())) {
				pValues[i++] = obj.getRoles();
			}
			objsList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<User>(User.class));	
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public List<User> getSiteFilterListForUser(User obj) throws Exception {
		List<User> objsList = null;
		try {
			int arrSize = 0;
			jdbcTemplate = new JdbcTemplate(dataSource);
			String qry = "SELECT site_name from [user_management] um where site_name is not null ";
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu())) {
				qry = qry + " and  um.sbu = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite_name())) {
				qry = qry + " and um.site_name = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getRoles())) {
				qry = qry + " and um.roles = ? ";
				arrSize++;
			}
			qry = qry + "group by site_name order by um.site_name asc";
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu())) {
				pValues[i++] = obj.getSbu();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite_name())) {
				pValues[i++] = obj.getSite_name();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getRoles())) {
				pValues[i++] = obj.getRoles();
			}
			objsList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<User>(User.class));	
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public List<User> getRoleFilterListForUser(User obj) throws Exception {
		List<User> objsList = null;
		try {
			int arrSize = 0;
			jdbcTemplate = new JdbcTemplate(dataSource);
			String qry = "SELECT roles from [user_management] um where roles is not null ";
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu())) {
				qry = qry + " and  um.sbu = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite_name())) {
				qry = qry + " and um.site_name = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getRoles())) {
				qry = qry + " and um.roles = ? ";
				arrSize++;
			}
			qry = qry + " group by roles order by um.roles asc";
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu())) {
				pValues[i++] = obj.getSbu();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite_name())) {
				pValues[i++] = obj.getSite_name();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getRoles())) {
				pValues[i++] = obj.getRoles();
			}
			objsList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<User>(User.class));	
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public boolean updateUserSelfIris(User obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "UPDATE [user_management] set "
					+ "		user_name= :user_name"
					+ "      ,mobile_number= :mobile_number,modified_date= getdate(),modified_by= :modified_by"
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
