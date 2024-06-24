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
import com.resustainability.reisp.model.Transaction;
import com.resustainability.reisp.model.User;

@Repository
public class IrisTransactionsDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	DataSource dataSource;

	@Autowired
	DataSourceTransactionManager transactionManager;

	public boolean uploadCollectData(Transaction obj) throws Exception{
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			if(StringUtils.isEmpty(obj.getQuantity_measure())) {
				obj.setQuantity_measure("MT");
			}
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "INSERT INTO [collect_table] (sbu_code,quantity,quantity_measure,date,site,comments,created_by,created_date) "
					+ "VALUES "
					+ "(:sbu_code,:quantity,:quantity_measure,:date,:site,:comments,:created_by,getdate())";
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

	public boolean uploadBMWProcessingData(Transaction obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			if(StringUtils.isEmpty(obj.getQuantity_measure_waste())) {
				obj.setQuantity_measure_waste("MT");
			}
			if(StringUtils.isEmpty(obj.getQuantity_measure_incieration())) {
				obj.setQuantity_measure_incieration("MT");
			}
			if(StringUtils.isEmpty(obj.getQuantity_measure_autoclave())) {
				obj.setQuantity_measure_autoclave("MT");
			}
			
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "INSERT INTO [bmw_processing_table] (sbu_code,date,total_waste,total_incieration,total_autoclave,quantity_measure_waste,quantity_measure_incieration,"
					+ "quantity_measure_autoclave,site,comments,created_by,created_date) "
					+ "VALUES "
					+ "(:sbu_code,:date,:total_waste,:total_incieration,:total_autoclave,:quantity_measure_waste,:quantity_measure_incieration,"
					+ "	:quantity_measure_autoclave,:site,:comments,:created_by,getdate())";
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

	public boolean uploadBMWDistributeData(Transaction obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			if(StringUtils.isEmpty(obj.getQuality_measure_materials())) {
				obj.setQuality_measure_materials("MT");
			}
			if(StringUtils.isEmpty(obj.getQuality_measure_recylable())) {
				obj.setQuality_measure_recylable("MT");
			}
			if(StringUtils.isEmpty(obj.getQuality_measure_plastics())) {
				obj.setQuality_measure_plastics("MT");
			}
			if(StringUtils.isEmpty(obj.getQuality_measure_bags())) {
				obj.setQuality_measure_bags("MT");
			}
			if(StringUtils.isEmpty(obj.getQuality_measure_glass())) {
				obj.setQuality_measure_glass("MT");
			}
			if(StringUtils.isEmpty(obj.getQuality_measure_cardboard())) {
				obj.setQuality_measure_cardboard("MT");
			}
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "INSERT INTO [bmw_distribute_table] (sbu_code,total_materials,total_plastic,total_recylable,total_bags,total_glass,total_cardboard,quality_measure_materials,"
					+ "quality_measure_recylable,quality_measure_plastics,quality_measure_bags,quality_measure_glass,quality_measure_cardboard,site,comments,date,"
					+ "created_by,created_date) "
					+ "VALUES "
					+ "(:sbu_code,:total_materials,:total_plastic,:total_recylable,:total_bags,:total_glass,:total_cardboard,:quality_measure_materials,"
					+ ":quality_measure_recylable,:quality_measure_plastics,:quality_measure_bags,:quality_measure_glass,:quality_measure_cardboard,:site,:comments,:date,"
					+ ":created_by,getdate())";
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

	public boolean uploadMSWDistributeData(Transaction obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
		
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "INSERT INTO[msw_distribute_table] ( "
	                + "sbu_code, rdf, compost, recyclables, inserts, vendor_name_rdf, vendor_name_compost "
	                + ",vendor_name_recyclables, vendor_name_inserts, quantity_measure_rdf_outflow, quantity_measure_compost_outflow "
	                + ",quantity_measure_recyclables_outflow, quantity_measure_inerts_outflow, date, site, comments, created_by "
	                + ", created_date, rdf_to_WTE, recyclable_to_recycle_unit, total_waste, total_rdf "
	                + ",total_compost, total_inerts, total_recylables, quantity_measure_waste, quantity_measure_rdf, quantity_measure_compost "
	                + ",quantity_measure_inerts, quantity_measure_recylabels) "
					+ "VALUES "
				       + "(:sbu_code,  :rdf,  :compost,  :recyclables,  :inserts,  :vendor_name_rdf,  :vendor_name_compost "
		                + ", :vendor_name_recyclables,  :vendor_name_inserts,  :quantity_measure_rdf_outflow,  :quantity_measure_compost_outflow "
		                + ", :quantity_measure_recyclables_outflow,  :quantity_measure_inerts_outflow,  :date,  :site,  :comments,  :created_by "
		                + ", getdate(),  :rdf_to_WTE,  :recyclable_to_recycle_unit,  :total_waste,  :total_rdf "
		                + ", :total_compost,  :total_inerts,  :total_recylables,  :quantity_measure_waste,  :quantity_measure_rdf,  :quantity_measure_compost "
		                + ", :quantity_measure_inerts,  :quantity_measure_recylabels) ";
			BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(obj);		 
		    count = namedParamJdbcTemplate.update(insertQry, paramSource);
			if(count > 0) {
				flag = true;
			}
		    String insertQry2 = "INSERT INTO msw_processing_table ( "
	                + "sbu_code, total_waste, total_rdf, total_compost, total_inerts, total_recylables, "
	                + "quantity_measure_waste, quantity_measure_rdf, quantity_measure_compost, quantity_measure_inerts, "
	                + "quantity_measure_recylabels, date, site, comments, created_by, created_date, "
	                + " rdf_to_WTE, rdf, compost, recyclable_to_recycle_unit, recyclables, inserts, "
	                + "vendor_name_rdf, vendor_name_compost, vendor_name_recyclables, vendor_name_inserts, "
	                + "quantity_measure_rdf_outflow, quantity_measure_compost_outflow, quantity_measure_recyclables_outflow, "
	                + "quantity_measure_inerts_outflow) "
					+ "VALUES "
				    + "(:sbu_code,  :total_waste,  :total_rdf,  :total_compost,  :total_inerts,  :total_recylables,  "
	                + ":quantity_measure_waste,  :quantity_measure_rdf,  :quantity_measure_compost,  :quantity_measure_inerts,  "
	                + ":quantity_measure_recylabels,  :date,  :site,  :comments,  :created_by,  getdate(),  "
	                + " :rdf_to_WTE,  :rdf,  :compost,  :recyclable_to_recycle_unit,  :recyclables,  :inserts,  "
	                + ":vendor_name_rdf,  :vendor_name_compost,  :vendor_name_recyclables,  :vendor_name_inserts,  "
	                + ":quantity_measure_rdf_outflow,  :quantity_measure_compost_outflow,  :quantity_measure_recyclables_outflow,  "
	                + ":quantity_measure_inerts_outflow) ";
	    
			paramSource = new BeanPropertySqlParameterSource(obj);		 
		    count = namedParamJdbcTemplate.update(insertQry2, paramSource);
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

	public boolean uploadMSWProcessingData(Transaction obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "INSERT INTO [msw_wte_table] (plant_load_factor,plant_generation_capacity,bottom_ash,fly_ash,sbu_code,rdf_receipt,rdf_combusted,ash_generated,steam_generation,power_produced,power_export,auxiliary_consumption,quantity_measure_rdf_receipt,quantity_measure_rdf_combusted "
					+ "			,quantity_measure_ash_generated,quantity_measure_steam_generation,quantity_measure_power_produced,quantity_measure_power_export,quantity_measure_auxiliary_consumption,date,site,comments,created_by,created_date) "
					+ "VALUES "
					+ "(:plant_load_factor,:plant_generation_capacity,:bottom_ash,:fly_ash,:sbu_code,:rdf_receipt,:rdf_combusted,:ash_generated,:steam_generation,:power_produced,:power_export,:auxiliary_consumption,:quantity_measure_rdf_receipt,:quantity_measure_rdf_combusted "
					+ "			,:quantity_measure_ash_generated,:quantity_measure_steam_generation,:quantity_measure_power_produced,:quantity_measure_power_export,:quantity_measure_auxiliary_consumption,:date,:site,:comments,:created_by,getdate())";
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

	public boolean uploadIWMDisposalData(Transaction obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "INSERT INTO [iwm_disposal_table] (sbu_code "
					+ "      ,disposal_total_waste "
					+ "      ,disposal_dlf "
					+ "      ,disposal_lat "
					+ "      ,disposal_incineration "
					+ "      ,disposal_afrf "
					+ "      ,incineration_to_afrf "
					+ "      ,recycling_qty_inc "
					+ "      ,recycling_qty_afrf "
					+ "      ,recycling_qty_total "
					+ "      ,site "
					+ "      ,date "
					+ "      ,comments "
					+ "      ,created_by "
					+ "      ,created_date) "
					+ "VALUES "
					+ "(:sbu_code "
					+ "      ,:disposal_total_waste "
					+ "      ,:disposal_dlf "
					+ "      ,:disposal_lat "
					+ "      ,:disposal_incineration "
					+ "      ,:disposal_afrf "
					+ "      ,:incineration_to_afrf "
					+ "      ,:recycling_qty_inc "
					+ "      ,:recycling_qty_afrf "
					+ "      ,:recycling_qty_total "
					+ "      ,:site "
					+ "      ,:date "
					+ "      ,:comments "
					+ "      ,:created_by "
					+ "      ,getdate() )";
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

	public boolean uploadIWMLeftoverstockData(Transaction obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "INSERT INTO [iwm_receipt] (sbu_code,receipt_total_waste "
					+ "      ,receipt_dlf "
					+ "      ,receipt_lat "
					+ "      ,receipt_incineration "
					+ "      ,receipt_afrf "
					+ "      ,incineration_to_afrf "
					+ "      ,site "
					+ "      ,date "
					+ "      ,comments "
					+ "      ,created_by "
					+ "      ,created_date) "
					+ "VALUES "
					+ "(:sbu_code,:receipt_total_waste "
					+ "      ,:receipt_dlf "
					+ "      ,:receipt_lat "
					+ "      ,:receipt_incineration "
					+ "      ,:receipt_afrf "
					+ "      ,:incineration_to_afrf "
					+ "      ,:site "
					+ "      ,:date "
					+ "      ,:comments "
					+ "      ,:created_by "
					+ "      ,getdate())";
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

	public boolean uploadIWMOpenData(Transaction obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "INSERT INTO [iwm_opening_stock_table] (sbu_code,opening_stock_total_waste "
					+ "      ,opening_stock_dlf "
					+ "      ,opening_stock_lat "
					+ "      ,opening_stock_incineration "
					+ "      ,opening_stock_afrf "
					+ "      ,site "
					+ "      ,date "
					+ "      ,comments "
					+ "      ,created_by "
					+ "      ,created_date) "
					+ "VALUES "
					+ "(:sbu_code,:opening_stock_total_waste "
					+ "      ,:opening_stock_dlf "
					+ "      ,:opening_stock_lat "
					+ "      ,:opening_stock_incineration "
					+ "      ,:opening_stock_afrf "
					+ "      ,:site "
					+ "      ,:date "
					+ "      ,:comments "
					+ "      ,:created_by "
					+ "      ,getdate())";
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

	public boolean uploadIWMCloseData(Transaction obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "INSERT INTO [iwm_closing_stock_table] (sbu_code "
					+ "      ,closing_stock_total_waste "
					+ "      ,closing_stock_dlf "
					+ "      ,closing_stock_lat "
					+ "      ,closing_stock_incineration "
					+ "      ,closing_stock_afrf "
					+ "      ,site "
					+ "      ,date "
					+ "      ,comments "
					+ "      ,created_by "
					+ "      ,created_date ) "
					+ "VALUES "
					+ "(:sbu_code "
					+ "      ,:closing_stock_total_waste "
					+ "      ,:closing_stock_dlf "
					+ "      ,:closing_stock_lat "
					+ "      ,:closing_stock_incineration "
					+ "      ,:closing_stock_afrf "
					+ "      ,:site "
					+ "      ,:date "
					+ "      ,:comments "
					+ "      ,:created_by "
					+ "      ,getdate() )";
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
