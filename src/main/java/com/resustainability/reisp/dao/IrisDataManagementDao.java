package com.resustainability.reisp.dao;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

import com.resustainability.reisp.model.DataManagement;
import com.resustainability.reisp.model.DateModel;
import com.resustainability.reisp.model.DataManagement;

@Repository
public class IrisDataManagementDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	DataSource dataSource;

	@Autowired
	DataSourceTransactionManager transactionManager;

	public List<DataManagement> getSBUFilterListForDM(DataManagement obj) throws Exception {
		List<DataManagement> objsList = null;
		try {
			int arrSize = 0;
			jdbcTemplate = new JdbcTemplate(dataSource);
			String qry = "SELECT um.sbu_code from [datamanagement_master] um "
					+ "left join site s on um.sbu_code =s.sbu_code "
					+ "left join sbu sb on um.sbu_code =sb.sbu_code "
					+ " where um.sbu_code is not null and um.status <> 'Inactive' ";
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				qry = qry + " and  um.sbu_code = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDepartment_code())) {
				qry = qry + " and  um.department_code = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite())) {
				qry = qry + " and s.id = ? ";
				arrSize++;
			}
			qry = qry + " group by um.sbu_code ";
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				pValues[i++] = obj.getSbu_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDepartment_code())) {
				pValues[i++] = obj.getDepartment_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite())) {
				pValues[i++] = obj.getSite();
			}
			objsList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public List<DataManagement> getDeptFilterListForDM(DataManagement obj) throws Exception {
		List<DataManagement> objsList = null;
		try {
			int arrSize = 0;
			jdbcTemplate = new JdbcTemplate(dataSource);
			String qry = "SELECT department_code,department_name from [datamanagement_master] um "
					+ "left join site s on um.sbu_code =s.sbu_code "
					+ "left join sbu sb on um.sbu_code =sb.sbu_code "
					+ " where um.sbu_code is not null ";
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				qry = qry + " and  um.sbu_code = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDepartment_code())) {
				qry = qry + " and  um.department_code = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite())) {
				qry = qry + " and s.id = ? ";
				arrSize++;
			}
			qry = qry + " group by department_code,department_name order by department_name ";
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				pValues[i++] = obj.getSbu_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDepartment_code())) {
				pValues[i++] = obj.getDepartment_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite())) {
				pValues[i++] = obj.getSite();
			}
			objsList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public List<DataManagement> getSiteFilterListForDM(DataManagement obj) throws Exception {
		List<DataManagement> objsList = null;
		try {
			int arrSize = 0;
			jdbcTemplate = new JdbcTemplate(dataSource);
			String qry = "SELECT um.id,site_name from site um "
					+ "left join datamanagement_master s on s.sbu_code = um.sbu_code "
					+ "left join sbu sb on s.sbu_code =sb.sbu_code "
					+ " where site_name is not null ";
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				qry = qry + " and  s.sbu_code = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDepartment_code())) {
				qry = qry + " and  s.department_code = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite())) {
				qry = qry + " and s.id = ? ";
				arrSize++;
			}
			qry = qry + " group by um.id,site_name ";
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				pValues[i++] = obj.getSbu_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDepartment_code())) {
				pValues[i++] = obj.getDepartment_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite())) {
				pValues[i++] = obj.getSite();
			}
			objsList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;	}

	public List<DataManagement> getDataManagementList(DataManagement obj, int startIndex, int offset,
			String searchParameter) throws Exception {
		List<DataManagement> objsList = null;
		try {
			int arrSize = 0;
			jdbcTemplate = new JdbcTemplate(dataSource);
			String qry = "";
			if(obj.getSbu_code().equals("BMW")) {
				if(obj.getDepartment_code().contains("CNT")){
					qry = qry + "select s.[id]"
							+ "      ,s.[sbu_code]"
							+ "      ,[quantity]"
							+ "      ,[quantity_measure]"
							+ "      ,[date],sss.site_name"
							+ "      ,[site]"
							+ "      ,[comments]"
							+ "      ,s.[created_by]"
							+ "      ,s.[modified_date]"
							+ "      ,s.[created_date]"
							+ "      ,s.[modified_by]"
							+ "  FROM [IRIS].[dbo].[collect_table] s  "
							+ "left join sbu ss on s.sbu_code = ss.sbu_code "
							+ " left join user_management um on s.created_by = um.id   "
							+ " left join site sss on s.site = sss.id   "
							+ " left join user_management um1 on s.modified_by = um1.id  "
							+ "where s.id is not null  ";
				}else if(obj.getDepartment_code().contains("process")) {
					
					qry = qry + "select s.[id]"
							+ "      ,[total_waste],s.sbu_code"
							+ "      ,[total_incieration]"
							+ "      ,[total_autoclave]"
							+ "      ,[quantity_measure_waste]"
							+ "      ,[quantity_measure_incieration]"
							+ "      ,[quantity_measure_autoclave]"
							+ "      ,[site]"+ "      ,[date],sss.site_name"
							+ "      ,[comments]"
							+ "      ,s.[created_by]"
							+ "      ,s.[modified_date]"
							+ "      ,s.[created_date]"
							+ "      ,s.[modified_by]"
							+ "  FROM [IRIS].[dbo].[bmw_processing_table] s  "
							+ "left join sbu ss on s.sbu_code = ss.sbu_code "
							+ " left join site sss on s.site = sss.id   "
							+ " left join user_management um on s.created_by = um.id   "
							+ " left join user_management um1 on s.modified_by = um1.id  "
							+ "where s.id is not null  ";
					
				}else if(obj.getDepartment_code().contains("Dist")) {
					
					qry = qry + "select s.[id]"
							+ "      ,s.[sbu_code]"
							+ "      ,[total_materials]"
							+ "      ,[total_recylable]"
							+ "      ,[total_bags]"
							+ "      ,[total_glass],[total_plastic]"
							+ "      ,[total_cardboard]"
							+ "      ,[quality_measure_materials]"
							+ "      ,[quality_measure_recylable]"
							+ "      ,[quality_measure_plastics]"
							+ "      ,[quality_measure_bags]"
							+ "      ,[quality_measure_glass]"
							+ "      ,[quality_measure_cardboard]"
							+ "      ,[site]"
							+ "      ,[comments]"
							+ "      ,[date],sss.site_name"
							+ "      ,s.[created_by]"
							+ "      ,s.[modified_date]"
							+ "      ,s.[created_date]"
							+ "      ,s.[modified_by]"
							+ "  FROM [IRIS].[dbo].[bmw_distribute_table] s  "
							+ "left join sbu ss on s.sbu_code = ss.sbu_code "
							+ " left join site sss on s.site = sss.id   "
							+ " left join user_management um on s.created_by = um.id   "
							+ " left join user_management um1 on s.modified_by = um1.id  "
							+ "where s.id is not null  ";
					
				}
			}else if(obj.getSbu_code().equals("IWM")) {
				if(obj.getDepartment_code().contains("receipt")){
					qry = qry + "select s.[id],s.sbu_code"
							+ "     ,[receipt_total_waste] "
							+ "      ,[receipt_dlf] "
							+ "      ,[receipt_lat] "
							+ "      ,[receipt_incineration] "
							+ "      ,[receipt_afrf] "
							+ "      ,[incineration_to_afrf]"
							+ "      ,[date],sss.site_name"
							+ "      ,[site]"
							+ "      ,[comments]"
							+ "      ,s.[created_by]"
							+ "      ,s.[modified_date]"
							+ "      ,s.[created_date]"
							+ "      ,s.[modified_by]"
							+ "  FROM [IRIS].[dbo].[iwm_receipt] s  "
							+ "left join sbu ss on s.sbu_code = ss.sbu_code "
							+ " left join site sss on s.site = sss.id   "
							+ " left join user_management um on s.created_by = um.id   "
							+ " left join user_management um1 on s.modified_by = um1.id  "
							+ "where s.id is not null  ";
				}else if(obj.getDepartment_code().contains("Disp")) {
					
					qry = qry + "select s.[id] "
							+ "      ,s.[sbu_code] "
							+ "      ,[disposal_total_waste] "
							+ "      ,[disposal_dlf] "
							+ "      ,[disposal_lat] "
							+ "      ,[disposal_incineration] "
							+ "      ,[disposal_afrf] "
							+ "      ,[incineration_to_afrf] "
							+ "      ,[recycling_qty_inc] "
							+ "      ,[recycling_qty_afrf] "
							+ "      ,[recycling_qty_total]"
							+ "      ,s.[site] "
							+ "      ,[date],sss.site_name"
							+ "      ,[comments] "
							+ "      ,s.[created_by] "
							+ "      ,s.[modified_date] "
							+ "      ,s.[created_date] "
							+ "      ,s.[modified_by] "
							+ "  FROM [IRIS].[dbo].[iwm_disposal_table] s  "
							+ "left join sbu ss on s.sbu_code = ss.sbu_code "
							+ " left join site sss on s.site = sss.id   "
							+ " left join user_management um on s.created_by = um.id   "
							+ " left join user_management um1 on s.modified_by = um1.id  "
							+ "where s.id is not null  ";
					
				}else if(obj.getDepartment_code().contains("open")) {
					
					qry = qry + "select s.[id]"
							+ "      ,s.sbu_code"
							+ "      ,[opening_stock_total_waste] "
							+ "      ,[opening_stock_dlf] "
							+ "      ,[opening_stock_lat] "
							+ "      ,[opening_stock_incineration] "
							+ "      ,[opening_stock_afrf]"
							+ "      ,[site]"
							+ "      ,[date],sss.site_name"
							+ "      ,[comments]"
							+ "      ,s.[created_by]"
							+ "      ,s.[modified_date]"
							+ "      ,s.[created_date]"
							+ "      ,s.[modified_by]"
							+ "  FROM [IRIS].[dbo].[iwm_opening_stock_table] s  "
							+ "left join sbu ss on s.sbu_code = ss.sbu_code "
							+ " left join site sss on s.site = sss.id   "
							+ " left join user_management um on s.created_by = um.id   "
							+ " left join user_management um1 on s.modified_by = um1.id  "
							+ "where s.id is not null  ";
				}else if(obj.getDepartment_code().contains("close")) {
					
					qry = qry + "select s.[id]"
							+ "      ,s.sbu_code"
							+ "      ,[closing_stock_total_waste]"
							+ "      ,[closing_stock_dlf]"
							+ "      ,[closing_stock_lat]"
							+ "      ,[closing_stock_incineration]"
							+ "      ,[closing_stock_afrf]"
							+ "      ,[site]"
							+ "      ,[date],sss.site_name"
							+ "      ,[comments]"
							+ "      ,s.[created_by]"
							+ "      ,s.[modified_date]"
							+ "      ,s.[created_date]"
							+ "      ,s.[modified_by]"
							+ "  FROM [IRIS].[dbo].[iwm_closing_stock_table] s  "
							+ "left join sbu ss on s.sbu_code = ss.sbu_code "
							+ " left join site sss on s.site = sss.id   "
							+ " left join user_management um on s.created_by = um.id   "
							+ " left join user_management um1 on s.modified_by = um1.id  "
							+ "where s.id is not null  ";
				}
			}else if(obj.getSbu_code().equals("MSW")) {
				if(obj.getDepartment_code().contains("CNT")){
					qry = qry + "select s.[id]"
							+ "      ,s.[sbu_code]"
							+ "      ,[quantity]"
							+ "      ,[quantity_measure]"
							+ "      ,[date],sss.site_name"
							+ "      ,[site]"
							+ "      ,[comments]"
							+ "      ,s.[created_by]"
							+ "      ,s.[modified_date]"
							+ "      ,s.[created_date]"
							+ "      ,s.[modified_by]"
							+ "  FROM [IRIS].[dbo].[collect_table] s  "
							+ "left join sbu ss on s.sbu_code = ss.sbu_code "
							+ " left join site sss on s.site = sss.id   "
							+ " left join user_management um on s.created_by = um.id   "
							+ " left join user_management um1 on s.modified_by = um1.id  "
							+ "where s.id is not null  ";
				}else if(obj.getDepartment_code().contains("process")) {
					
					qry = qry + " select s.[id]"
							+ "      ,s.[sbu_code]"
							+ "      ,[total_waste]"
							+ "      ,[total_rdf]"
							+ "      ,[total_compost]"
							+ "      ,[total_inerts]"
							+ "      ,[total_recylables]"
							+ "      ,[quantity_measure_waste]"
							+ "      ,[quantity_measure_rdf]"
							+ "      ,[quantity_measure_compost]"
							+ "      ,[quantity_measure_inerts]"
							+ "      ,[quantity_measure_recylabels]"
							+ "      ,[date],sss.site_name,rdf_to_WTE,rdf,compost"
							+ "      ,[site]"
							+ "      ,[comments]"
							+ "      ,s.[created_by]"
							+ "      ,s.[modified_date]"
							+ "      ,s.[created_date]"
							+ "      ,s.[modified_by]"
							+ " ,[rdf_to_WTE] "
							+ "      ,[rdf] "
							+ "      ,[compost] "
							+ "      ,[recyclable_to_recycle_unit] "
							+ "      ,[recyclables] "
							+ "      ,[inserts] "
							+ "      ,[vendor_name_rdf] "
							+ "      ,[vendor_name_compost] "
							+ "      ,[vendor_name_recyclables] "
							+ "      ,[vendor_name_inserts] "
							+ "      ,[quantity_measure_rdf_outflow] "
							+ "      ,[quantity_measure_compost_outflow] "
							+ "      ,[quantity_measure_recyclables_outflow] "
							+ "      ,[quantity_measure_inerts_outflow]"
							+ "  FROM [IRIS].[dbo].[msw_processing_table] s  "
							+ "left join sbu ss on s.sbu_code = ss.sbu_code "
							+ " left join site sss on s.site = sss.id   "
							+ " left join user_management um on s.created_by = um.id   "
							+ " left join user_management um1 on s.modified_by = um1.id  "
							+ "where s.id is not null  ";
					
				}else if(obj.getDepartment_code().contains("Dist")) {
					
					qry = qry + "select s.[id]"
							+ "      ,s.[sbu_code]"
							+ "      ,[rdf]"
							+ "      ,[compost]"
							+ "      ,[recyclables]"
							+ "      ,[inserts]"
							+ "      ,[vendor_name_rdf]"
							+ "      ,[vendor_name_compost]"
							+ "      ,[vendor_name_recyclables]"
							+ "      ,[vendor_name_inserts]"
							+ "      ,[quantity_measure_rdf_outflow]"
							+ "      ,[quantity_measure_compost_outflow]"
							+ "      ,[quantity_measure_recyclables_outflow]"
							+ "      ,[quantity_measure_inerts_outflow]"
							+ "      ,[date],sss.site_name"
							+ "      ,[site]"
							+ "      ,[comments]"
							+ "      ,s.[created_by]"
							+ "      ,s.[modified_date]"
							+ "      ,s.[created_date]"
							+ "      ,s.[modified_by]"
							+ "		 ,[rdf_to_WTE] "
							+ "      ,[recyclable_to_recycle_unit] "
							+ "      ,[total_waste] "
							+ "      ,[total_rdf] "
							+ "      ,[total_compost] "
							+ "      ,[total_inerts] "
							+ "      ,[total_recylables] "
							+ "      ,[quantity_measure_waste] "
							+ "      ,[quantity_measure_rdf] "
							+ "      ,[quantity_measure_compost] "
							+ "      ,[quantity_measure_inerts] "
							+ "      ,[quantity_measure_recylabels]"
							+ "  FROM [IRIS].[dbo].[msw_distribute_table] s  "
							+ "left join sbu ss on s.sbu_code = ss.sbu_code "
							+ " left join site sss on s.site = sss.id   "
							+ " left join user_management um on s.created_by = um.id   "
							+ " left join user_management um1 on s.modified_by = um1.id  "
							+ "where s.id is not null  ";
				}else if(obj.getDepartment_code().contains("Wte")) {
					
					qry = qry + "select s.[id]"
							+ "      ,s.[sbu_code],"
							+ "     [rdf_receipt] "
							+ "      ,[rdf_combusted] "
							+ "      ,[ash_generated] "
							+ "      ,[steam_generation] "
							+ "      ,[power_produced] "
							+ "      ,[power_export] "
							+ "      ,[auxiliary_consumption] "
							+ "      ,[quantity_measure_rdf_receipt] "
							+ "      ,[quantity_measure_rdf_combusted] "
							+ "      ,[quantity_measure_ash_generated] "
							+ "      ,[quantity_measure_steam_generation] "
							+ "      ,[quantity_measure_power_produced] "
							+ "      ,[quantity_measure_power_export] "
							+ "      ,[quantity_measure_auxiliary_consumption]"
							+ "      ,[date],sss.site_name"
							+ "      ,[site]"
							+ "      ,[comments]"
							+ "      ,s.[created_by]"
							+ "      ,s.[modified_date]"
							+ "      ,s.[created_date]"
							+ "      ,s.[modified_by],plant_generation_capacity,bottom_ash,fly_ash,plant_load_factor  "
							+ "  FROM [IRIS].[dbo].[msw_wte_table] s  "
							+ "left join sbu ss on s.sbu_code = ss.sbu_code "
							+ " left join site sss on s.site = sss.id   "
							+ " left join user_management um on s.created_by = um.id   "
							+ " left join user_management um1 on s.modified_by = um1.id  "
							+ "where s.id is not null  ";
				}
				
				
			}else if(obj.getSbu_code().equals("RECYCLE-PLASTIC")) {
				if(obj.getDepartment_code().contains("CNT")){
					qry = qry + "select s.[id]"
							+ "      ,s.[sbu_code]"
							+ "      ,[quantity]"
							+ "      ,[quantity_measure]"
							+ "      ,[date],sss.site_name"
							+ "      ,[site]"
							+ "      ,[comments]"
							+ "      ,s.[created_by]"
							+ "      ,s.[modified_date]"
							+ "      ,s.[created_date]"
							+ "      ,s.[modified_by]"
							+ "  FROM [IRIS].[dbo].[collect_table] s  "
							+ "left join sbu ss on s.sbu_code = ss.sbu_code "
							+ " left join site sss on s.site = sss.id   "
							+ " left join user_management um on s.created_by = um.id   "
							+ " left join user_management um1 on s.modified_by = um1.id  "
							+ "where s.id is not null  ";
				}
				
				
			}else if(obj.getSbu_code().equals("RECYCLE-CND")) {
				
				if(obj.getDepartment_code().contains("CNT")){
					qry = qry + "select s.[id]"
							+ "      ,s.[sbu_code]"
							+ "      ,[quantity]"
							+ "      ,[quantity_measure]"
							+ "      ,[date],sss.site_name"
							+ "      ,[site]"
							+ "      ,[comments]"
							+ "      ,s.[created_by]"
							+ "      ,s.[modified_date]"
							+ "      ,s.[created_date]"
							+ "      ,s.[modified_by]"
							+ "  FROM [IRIS].[dbo].[collect_table] s  "
							+ "left join sbu ss on s.sbu_code = ss.sbu_code "
							+ " left join site sss on s.site = sss.id   "
							+ " left join user_management um on s.created_by = um.id   "
							+ " left join user_management um1 on s.modified_by = um1.id  "
							+ "where s.id is not null  ";
				}
				
			}else if(obj.getSbu_code().equals("RECYCLE-CRM")) {
				if(obj.getDepartment_code().contains("CNT")){
					qry = qry + "select s.[id]"
							+ "      ,s.[sbu_code]"
							+ "      ,[quantity]"
							+ "      ,[quantity_measure]"
							+ "      ,[date],sss.site_name"
							+ "      ,[site]"
							+ "      ,[comments]"
							+ "      ,s.[created_by]"
							+ "      ,s.[modified_date]"
							+ "      ,s.[created_date]"
							+ "      ,s.[modified_by]"
							+ "  FROM [IRIS].[dbo].[collect_table] s  "
							+ "left join sbu ss on s.sbu_code = ss.sbu_code "
							+ " left join site sss on s.site = sss.id   "
							+ " left join user_management um on s.created_by = um.id   "
							+ " left join user_management um1 on s.modified_by = um1.id  "
							+ "where s.id is not null  ";
				}
				
				
			}
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				qry = qry + " and  s.sbu_code like '%"+obj.getSbu_code()+"%' ";
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getFrom_date()) && !StringUtils.isEmpty(obj.getTo_date())) {
				qry = qry + " and  s.date between ? and ? ";
				arrSize++;arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite())) {
				qry = qry + " and sss.id = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getIsMobile()) && StringUtils.isEmpty(obj.getFrom_date()) && StringUtils.isEmpty(obj.getTo_date())) {
				qry = qry + " AND CAST(s.date AS DATE) >= DATEADD(DAY, -7, CAST(GETDATE() AS DATE)) ";	
			}
			
			if(!StringUtils.isEmpty(startIndex) && !StringUtils.isEmpty(offset)) {
				qry = qry + " ORDER BY s.date asc offset ? rows  fetch next ? rows only";	
				arrSize++;
				arrSize++;
			}
			
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				//pValues[i++] = obj.getSbu_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getFrom_date()) && !StringUtils.isEmpty(obj.getTo_date())) {
				pValues[i++] = obj.getFrom_date().trim();
				pValues[i++] = obj.getTo_date().trim();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSite())) {
				pValues[i++] = obj.getSite();
			}
			if(!StringUtils.isEmpty(startIndex) && !StringUtils.isEmpty(offset)) {
				pValues[i++] = startIndex;
				pValues[i++] = offset;
			}
			objsList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));
			
		    	if(obj.getSbu_code().equals("BMW")) {
					if(obj.getDepartment_code().contains("CNT")){
						double sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getQuantity());
			                sum += value;
			            }
			            double sum2 = sum;
						objsList.forEach(obj1 -> obj1.setQuantity_sum(obj1.getQuantity_sum() +sum2));
					}else if(obj.getDepartment_code().contains("process")) {
						double sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getTotal_waste());
			                sum += value;
			            }
			            double sum3 = sum;
						objsList.forEach(obj1 -> obj1.setTotal_waste_sum(obj1.getTotal_waste_sum() +sum3));
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getTotal_incieration());
			                sum += value;
			            }
			            double sum4 = sum;
						objsList.forEach(obj1 -> obj1.setTotal_incieration_sum(obj1.getTotal_incieration_sum() +sum4));
					
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getTotal_autoclave());
			                sum += value;
			            }
			            double sum5 = sum;
						objsList.forEach(obj1 -> obj1.setTotal_autoclave_sum(obj1.getTotal_autoclave_sum() +sum5));
					
					}else if(obj.getDepartment_code().contains("Dist")) {
						double sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getTotal_materials());
			                sum += value;
			            }
			            double sum3 = sum;
						objsList.forEach(obj1 -> obj1.setTotal_materials_sum(obj1.getTotal_materials_sum() +sum3));
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getTotal_recylable());
			                sum += value;
			            }
			            double sum4 = sum;
						objsList.forEach(obj1 -> obj1.setTotal_recylable_sum(obj1.getTotal_recylable_sum() +sum4));
					
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getTotal_plastic());
			                sum += value;
			            }
			            double sum5 = sum;
						objsList.forEach(obj1 -> obj1.setTotal_plastic_sum(obj1.getTotal_plastic_sum() +sum5));
					
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getTotal_bags());
			                sum += value;
			            }
			            double sum6 = sum;
						objsList.forEach(obj1 -> obj1.setTotal_bags_sum(obj1.getTotal_bags_sum() +sum6));
					
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getTotal_glass());
			                sum += value;
			            }
			            double sum7 = sum;
						objsList.forEach(obj1 -> obj1.setTotal_glass_sum(obj1.getTotal_glass_sum() +sum7));
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getTotal_cardboard());
			                sum += value;
			            }
			            double sum8 = sum;
						objsList.forEach(obj1 -> obj1.setTotal_cardboard_sum(obj1.getTotal_cardboard_sum() +sum8));
					}
				}else if(obj.getSbu_code().equals("MSW")) {
					if(obj.getDepartment_code().contains("CNT")){
						double sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getQuantity());
			                sum += value;
			            }
			            double sum2 = sum;
						objsList.forEach(obj1 -> obj1.setQuantity_sum(obj1.getQuantity_sum() +sum2));
					}else if(obj.getDepartment_code().contains("Dist")) {
						double sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getRdf());
			                sum += value;
			            }
			            double sum3 = sum;
						objsList.forEach(obj1 -> obj1.setRdf_sum(obj1.getRdf_sum() +sum3));
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getCompost());
			                sum += value;
			            }
			            double sum4 = sum;
						objsList.forEach(obj1 -> obj1.setCompost_sum(obj1.getCompost_sum() +sum4));
					
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getRecyclables());
			                sum += value;
			            }
			            double sum6 = sum;
						objsList.forEach(obj1 -> obj1.setRecyclables_sum(obj1.getRecyclables_sum() +sum6));
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getInserts());
			                sum += value;
			            }
			            double sum7 = sum;
						objsList.forEach(obj1 -> obj1.setInserts_sum(obj1.getInserts_sum() +sum7));
						
					
					}else if(obj.getDepartment_code().contains("process")) {
						double sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getTotal_rdf());
			                sum += value;
			            }
			            double sum3 = sum;
						objsList.forEach(obj1 -> obj1.setTotal_rdf_sum(obj1.getTotal_rdf_sum() +sum3));
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getTotal_compost());
			                sum += value;
			            }
			            double sum4 = sum;
						objsList.forEach(obj1 -> obj1.setTotal_compost_sum(obj1.getTotal_compost_sum() +sum4));
					
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getTotal_inerts());
			                sum += value;
			            }
			            double sum5 = sum;
						objsList.forEach(obj1 -> obj1.setTotal_inerts_sum(obj1.getTotal_inerts_sum() +sum5));
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getTotal_recylables());
			                sum += value;
			            }
			            double sum6 = sum;
						objsList.forEach(obj1 -> obj1.setTotal_recylables_sum(obj1.getTotal_recylables_sum() +sum6));
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getTotal_waste());
			                sum += value;
			            }
			            double sum62 = sum;
						objsList.forEach(obj1 -> obj1.setTotal_waste_sum(obj1.getTotal_waste_sum() +sum62));
						
						
					}else if(obj.getDepartment_code().contains("Wte")) {
						double sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getRdf_receipt());
			                sum += value;
			            }
			            double sum7 = sum;
						objsList.forEach(obj1 -> obj1.setRdf_receipt_sum(obj1.getRdf_receipt_sum() +sum7));
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getRdf_combusted());
			                sum += value;
			            }
			            double sum8 = sum;
						objsList.forEach(obj1 -> obj1.setRdf_combusted_sum(obj1.getRdf_combusted_sum() +sum8));
					
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getAsh_generated());
			                sum += value;
			            }
			            double sum5 = sum;
						objsList.forEach(obj1 -> obj1.setAsh_generated_sum(obj1.getAsh_generated_sum() +sum5));
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getSteam_generation());
			                sum += value;
			            }
			            double sum6 = sum;
						objsList.forEach(obj1 -> obj1.setSteam_generation_sum(obj1.getSteam_generation_sum() +sum6));
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getPower_produced());
			                sum += value;
			            }
			            double sum71 = sum;
						objsList.forEach(obj1 -> obj1.setPower_produced_sum(obj1.getPower_produced_sum() +sum71));
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getPower_export());
			                sum += value;
			            }
			            double sum81 = sum;
						objsList.forEach(obj1 -> obj1.setPower_export_sum(obj1.getPower_export_sum() +sum81));
						
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getAuxiliary_consumption());
			                sum += value;
			            }
			            double sum811 = sum;
						objsList.forEach(obj1 -> obj1.setAuxiliary_consumption_sum(obj1.getAuxiliary_consumption_sum() +sum811));
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getAsh_generated());
			                sum += value;
			            }
			            double sum8111 = sum;
						objsList.forEach(obj1 -> obj1.setAsh_generated_sum(obj1.getAsh_generated_sum() +sum8111));
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getBottom_ash());
			                sum += value;
			            }
			            double sum81112 = sum;
						objsList.forEach(obj1 -> obj1.setBottom_ash_sum(obj1.getBottom_ash_sum() +sum81112));
						
						sum = 0.0;
			            for (DataManagement obj1 : objsList) {
			                double value = Double.parseDouble(obj1.getFly_ash());
			                sum += value;
			            }
			            double sum811125 = sum;
						objsList.forEach(obj1 -> obj1.setFly_ash_sum(obj1.getFly_ash_sum() +sum811125));
					}
					}else if(obj.getSbu_code().equals("IWM")) {
						if(obj.getDepartment_code().contains("Disp")){
							double sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getDisposal_total_waste());
				                sum += value;
				            }
				            double sum2 = sum;
							objsList.forEach(obj1 -> obj1.setDisposal_total_waste_sum(obj1.getDisposal_total_waste_sum() +sum2));
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getDisposal_dlf());
				                sum += value;
				            }
				            double sum12 = sum;
							objsList.forEach(obj1 -> obj1.setDisposal_dlf_sum(obj1.getDisposal_dlf_sum() +sum12));
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getDisposal_lat());
				                sum += value;
				            }
				            double sum22 = sum;
							objsList.forEach(obj1 -> obj1.setDisposal_lat_sum(obj1.getDisposal_lat_sum() +sum22));
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getDisposal_afrf());
				                sum += value;
				            }
				            double sum23 = sum;
							objsList.forEach(obj1 -> obj1.setDisposal_afrf_sum(obj1.getDisposal_afrf_sum() +sum23));
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getDisposal_incineration());
				                sum += value;
				            }
				            double sum42 = sum;
							objsList.forEach(obj1 -> obj1.setDisposal_incineration_sum(obj1.getDisposal_incineration_sum() +sum42));
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getIncineration_to_afrf());
				                sum += value;
				            }
				            double sum112 = sum;
							objsList.forEach(obj1 -> obj1.setIncineration_to_afrf_sum(obj1.getIncineration_to_afrf_sum() +sum112));
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getRecycling_qty_inc());
				                sum += value;
				            }
				            double sum1112 = sum;
							objsList.forEach(obj1 -> obj1.setRecycling_qty_inc_sum(obj1.getRecycling_qty_inc_sum() +sum1112));
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getRecycling_qty_afrf());
				                sum += value;
				            }
				            double sumq2 = sum;
							objsList.forEach(obj1 -> obj1.setRecycling_qty_afrf_sum(obj1.getRecycling_qty_afrf_sum() +sumq2));
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getRecycling_qty_total());
				                sum += value;
				            }
				            double sumz2 = sum;
							objsList.forEach(obj1 -> obj1.setRecycling_qty_total_sum(obj1.getRecycling_qty_total_sum() +sumz2));
							
						}else if(obj.getDepartment_code().contains("receipt")){
							double sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getReceipt_total_waste());
				                sum += value;
				            }
				            double sum2 = sum;
							objsList.forEach(obj1 -> obj1.setReceipt_total_waste_sum(obj1.getReceipt_total_waste_sum() +sum2));
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getReceipt_dlf());
				                sum += value;
				            }
				            double sum12 = sum;
							objsList.forEach(obj1 -> obj1.setReceipt_dlf_sum(obj1.getReceipt_dlf_sum() +sum12));
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getReceipt_lat());
				                sum += value;
				            }
				            double sum1s2 = sum;
							objsList.forEach(obj1 -> obj1.setReceipt_lat_sum(obj1.getReceipt_lat_sum() +sum1s2));
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getReceipt_incineration());
				                sum += value;
				            }
				            double sum1x2 = sum;
							objsList.forEach(obj1 -> obj1.setReceipt_incineration_sum(obj1.getReceipt_incineration_sum() +sum1x2));
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getReceipt_afrf());
				                sum += value;
				            }
				            double sum1xx2 = sum;
							objsList.forEach(obj1 -> obj1.setReceipt_afrf_sum(obj1.getReceipt_afrf_sum() +sum1xx2));
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getIncineration_to_afrf());
				                sum += value;
				            }
				            double sum1z2 = sum;
							objsList.forEach(obj1 -> obj1.setIncineration_to_afrf_sum(obj1.getIncineration_to_afrf_sum() +sum1z2));
							
						}else if(obj.getDepartment_code().contains("open")){
							double sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getOpening_stock_total_waste());
				                sum += value;
				            }
				            double sum2 = sum;
							objsList.forEach(obj1 -> obj1.setOpening_stock_total_waste_sum(obj1.getOpening_stock_total_waste_sum() +sum2));
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getOpening_stock_dlf());
				                sum += value;
				            }
				            double sum12 = sum;
							objsList.forEach(obj1 -> obj1.setOpening_stock_dlf_sum(obj1.getOpening_stock_dlf_sum() +sum12));
							
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getOpening_stock_lat());
				                sum += value;
				            }
				            double sum1z2 = sum;
							objsList.forEach(obj1 -> obj1.setOpening_stock_lat_sum(obj1.getOpening_stock_lat_sum() +sum1z2));
							
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getOpening_stock_incineration());
				                sum += value;
				            }
				            double sum1c2 = sum;
							objsList.forEach(obj1 -> obj1.setOpening_stock_incineration_sum(obj1.getOpening_stock_incineration_sum() +sum1c2));
							
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getOpening_stock_afrf());
				                sum += value;
				            }
				            double sum1v2 = sum;
							objsList.forEach(obj1 -> obj1.setOpening_stock_afrf_sum(obj1.getOpening_stock_afrf_sum() +sum1v2));
						}else if(obj.getDepartment_code().contains("close")){
							double sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getClosing_stock_total_waste());
				                sum += value;
				            }
				            double sum2 = sum;
							objsList.forEach(obj1 -> obj1.setClosing_stock_total_waste_sum(obj1.getClosing_stock_total_waste_sum() +sum2));
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getClosing_stock_dlf());
				                sum += value;
				            }
				            double sum12 = sum;
							objsList.forEach(obj1 -> obj1.setClosing_stock_dlf_sum(obj1.getClosing_stock_dlf_sum() +sum12));
							
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getClosing_stock_lat());
				                sum += value;
				            }
				            double sum1z2 = sum;
							objsList.forEach(obj1 -> obj1.setClosing_stock_lat_sum(obj1.getClosing_stock_lat_sum() +sum1z2));
							
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getClosing_stock_incineration());
				                sum += value;
				            }
				            double sum1c2 = sum;
							objsList.forEach(obj1 -> obj1.setClosing_stock_incineration_sum(obj1.getClosing_stock_incineration_sum() +sum1c2));
							
							
							sum = 0.0;
				            for (DataManagement obj1 : objsList) {
				                double value = Double.parseDouble(obj1.getClosing_stock_afrf());
				                sum += value;
				            }
				            double sum1v2 = sum;
							objsList.forEach(obj1 -> obj1.setClosing_stock_afrf_sum(obj1.getClosing_stock_afrf_sum() +sum1v2));
						}
				}
				
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public int getTotalRecords(DataManagement obj, String searchParameter) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean updateCollect(DataManagement obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "UPDATE [collect_table] set "
					+ "      quantity= :quantity"
					+ "      ,quantity_measure= :quantity_measure,modified_date= getdate(),modified_by= :modified_by"
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

	public boolean updateBmwdistributive(DataManagement obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "UPDATE [bmw_distribute_table] set "
					+ "      total_materials= :total_materials,total_recylable=:total_recylable,total_plastic=:total_plastic,total_bags=:total_bags,total_glass=:total_glass,total_cardboard=:total_cardboard"
					+ "      ,quality_measure_materials= :quality_measure_materials,quality_measure_recylable=:quality_measure_recylable"
					+ ",quality_measure_plastics=:quality_measure_plastics,quality_measure_bags=:quality_measure_bags,quality_measure_glass=:quality_measure_glass,quality_measure_cardboard=:quality_measure_cardboard"
					+ ",modified_date= getdate(),modified_by= :modified_by"
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

	public boolean updateBmwprocessing(DataManagement obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "UPDATE [bmw_processing_table] set "
					+ "      total_waste= :total_waste,total_incieration=:total_incieration,total_autoclave=:total_autoclave,quantity_measure_waste=:quantity_measure_waste,quantity_measure_incieration=:quantity_measure_incieration,quantity_measure_autoclave=:quantity_measure_autoclave"
					+ ",modified_date= getdate(),modified_by= :modified_by"
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

	public boolean updateIwmdisposal(DataManagement obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "UPDATE [iwm_disposal_table] set "
					+ "      disposal_total_waste= :disposal_total_waste,disposal_dlf=:disposal_dlf,disposal_lat=:disposal_lat,disposal_afrf=:disposal_afrf,disposal_incineration=:disposal_incineration,disposal_total_waste_measure=:disposal_total_waste_measure"
					+ "      ,disposal_dlf_measure= :disposal_dlf_measure,disposal_lat_measure=:disposal_lat_measure"
					+ ",disposal_afrf_measure=:disposal_afrf_measure,disposal_incineration_measure=:disposal_incineration_measure"
					+ ",modified_date= getdate(),modified_by= :modified_by"
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

	public boolean updateIwmleftoverstock(DataManagement obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "UPDATE [iwm_leftoverstock_table] set "
					+ "   stock_total_waste= :stock_total_waste,stock_dlf=:stock_dlf,stock_lat=:stock_lat,stock_incineration=:stock_incineration,stock_afrf=:stock_afrf,stock_total_waste_measure=:stock_total_waste_measure"
					+ " ,stock_dlf_measure= :stock_dlf_measure,stock_lat_measure=:stock_lat_measure"
					+ ",stock_incineration_measure=:stock_incineration_measure,stock_afrf_measure=:stock_afrf_measure"
					+ ",modified_date= getdate(),modified_by= :modified_by"
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

	public boolean updateMswprocessing(DataManagement obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "UPDATE [msw_processing_table] set "
					+ "total_waste= :total_waste, total_rdf=:total_rdf,total_compost=:total_compost"
					+ ",total_inerts= :total_inerts,total_recylables=:total_recylables,quantity_measure_waste=:quantity_measure_waste"
					+ ",quantity_measure_rdf= :quantity_measure_rdf,quantity_measure_compost=:quantity_measure_compost,quantity_measure_inerts=:quantity_measure_inerts,quantity_measure_recylabels=:quantity_measure_recylabels"
					+ ",modified_date= getdate(),modified_by= :modified_by"
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

	public boolean updateMswdistributive(DataManagement obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "UPDATE [msw_distribute_table] set "
					+ "rdf= :rdf,compost=:compost,recyclables=:recyclables"
					+ ",inserts=:inserts,vendor_name_rdf=:vendor_name_rdf,vendor_name_compost=:vendor_name_compost"
					+ ",vendor_name_recyclables=:vendor_name_recyclables,vendor_name_inserts=:vendor_name_inserts,quantity_measure_rdf_outflow=:quantity_measure_rdf_outflow,"
					+ "quantity_measure_compost_outflow=:quantity_measure_compost_outflow,quantity_measure_recyclables_outflow=:quantity_measure_recyclables_outflow,quantity_measure_inerts_outflow=:quantity_measure_inerts_outflow"
					+ ",modified_date= getdate(),modified_by= :modified_by"
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

	public List<DateModel> getDataHistoryList(DataManagement obj) throws Exception {
		List<DateModel> objsList = null;
		try {
			int arrSize = 0;
			jdbcTemplate = new JdbcTemplate(dataSource);
			String qry = "SELECT  convert(varchar, date, 101) as date  "
					+ "FROM (  ";
					if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code()) && obj.getSbu_code().equals("BMW")) {
						qry = qry + "    SELECT date,sbu_code FROM [IRIS].[dbo].[collect_table]  "
								+ "    UNION  "
								+ "    SELECT date,sbu_code FROM [IRIS].[dbo].[bmw_processing_table]  "
								+ "    UNION  "
								+ "    SELECT date,sbu_code FROM [IRIS].[dbo].[bmw_distribute_table]  "
								+ ""
								+ ") AS all_dates where date is not null  ";
						
					}else if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code()) && obj.getSbu_code().equals("MSW")) {
						qry = qry + "    SELECT date,sbu_code FROM [IRIS].[dbo].[collect_table]  "
								+ "    UNION  "
								+ "    SELECT date,sbu_code FROM [IRIS].[dbo].[msw_distribute_table]  "
								+ "    UNION  "
								+ "    SELECT date,sbu_code FROM [IRIS].[dbo].[msw_processing_table]  "
								+ "    UNION  "
								+ "    SELECT date,sbu_code FROM [IRIS].[dbo].[msw_wte_table]  "
								+ ""
								+ ") AS all_dates where date is not null  ";
					}else if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code()) && obj.getSbu_code().equals("IWM")) {
						qry = qry + "    SELECT date,sbu_code FROM [IRIS].[dbo].[iwm_disposal_table]  "
								+ "    UNION  "
								+ "    SELECT date,sbu_code FROM [IRIS].[dbo].[iwm_receipt]  "
								+ "    UNION  "
								+ "    SELECT date,sbu_code FROM [IRIS].[dbo].[iwm_opening_stock_table]  "
								+ "    UNION  "
								+ "    SELECT date,sbu_code FROM [IRIS].[dbo].[iwm_closing_stock_table]  "
								+ ""
								+ ") AS all_dates where date is not null  ";
					}
				
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				qry = qry + " and  sbu_code = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getFrom_date())) {
				qry = qry + " and date between  ? and  ? ";
				arrSize++;
				arrSize++;
			}
			qry = qry + " GROUP BY date order by date desc ";
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code())) {
				pValues[i++] = obj.getSbu_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getFrom_date())) {
				pValues[i++] = obj.getFrom_date();
				pValues[i++] = obj.getTo_date();
			}
			objsList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<DateModel>(DateModel.class));	
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public List<DataManagement> getDataFromDates(DataManagement obj) throws Exception {
		List<DataManagement> objsList1 = null;
		List<DataManagement> objsList2 = null;
		List<DataManagement> objsList3 = null;
		List<DataManagement> objsList4 = null;
		List<DataManagement> finalList = new ArrayList<>();
		 List<DataManagement> combinedList = new ArrayList<>();
		 List<DataManagement> LastList = new ArrayList<>();
		try {
			int arrSize = 0;
			jdbcTemplate = new JdbcTemplate(dataSource);
			String qry = "";
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code()) && obj.getSbu_code().equals("BMW")) {
				 qry = "SELECT sbu_code,quantity,quantity_measure from collect_table where sbu_code is not null  ";
				 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) { 
						qry = qry + " and date = ? ";
						arrSize++;
					}
				 qry = qry + " GROUP BY sbu_code,quantity,quantity_measure  ";
				 Object[] pValues = new Object[arrSize];
					int i = 0;
					if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
						pValues[i++] = obj.getDate();
					}
					objsList1 = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
					arrSize = 0;
					qry = "";
					 qry = "SELECT sbu_code"
					 		+ "      ,total_waste"
					 		+ "      ,total_incieration"
					 		+ "      ,total_autoclave"
					 		+ "      ,quantity_measure_waste"
					 		+ "      ,quantity_measure_incieration"
					 		+ "      ,quantity_measure_autoclave from bmw_processing_table where sbu_code is not null  ";
					 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							qry = qry + " and date = ? ";
							arrSize++;
						}
					 qry = qry + " GROUP BY sbu_code"
					 		+ ",total_waste"
					 		+ ",total_incieration"
					 		+ ",total_autoclave"
					 		+ ",quantity_measure_waste"
					 		+ ",quantity_measure_incieration"
					 		+ ",quantity_measure_autoclave ";
					 Object[] pValues1 = new Object[arrSize];
						int j = 0;
						if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							pValues1[j++] = obj.getDate();
						}
						objsList2 = jdbcTemplate.query( qry,pValues1, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
				
						arrSize = 0;
						qry = "";
						 qry = "SELECT [sbu_code]"
						 		+ "      ,[total_materials]"
						 		+ "      ,[total_recylable]"
						 		+ "      ,[total_plastic]"
						 		+ "      ,[total_bags]"
						 		+ "      ,[total_glass]"
						 		+ "      ,[total_cardboard]"
						 		+ "      ,[quality_measure_materials]"
						 		+ "      ,[quality_measure_recylable]"
						 		+ "      ,[quality_measure_plastics]"
						 		+ "      ,[quality_measure_bags]"
						 		+ "      ,[quality_measure_glass]"
						 		+ "      ,[quality_measure_cardboard] "
						 		+ "from bmw_distribute_table where sbu_code is not null  ";
						 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
								qry = qry + " and date = ? ";
								arrSize++;
							}
						 qry = qry + " GROUP BY "
						 		+ " [sbu_code]"
						 		+ "      ,[total_materials]"
						 		+ "      ,[total_recylable]"
						 		+ "      ,[total_plastic]"
						 		+ "      ,[total_bags]"
						 		+ "      ,[total_glass]"
						 		+ "      ,[total_cardboard]"
						 		+ "      ,[quality_measure_materials]"
						 		+ "      ,[quality_measure_recylable]"
						 		+ "      ,[quality_measure_plastics]"
						 		+ "      ,[quality_measure_bags]"
						 		+ "      ,[quality_measure_glass]"
						 		+ "      ,[quality_measure_cardboard] ";
						 Object[] pValues2 = new Object[arrSize];
							int k = 0;
							if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
								pValues2[k++] = obj.getDate();
							}
							objsList3 = jdbcTemplate.query( qry,pValues2, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
			
					        int maxSize = Math.max(objsList1.size(), objsList2.size());
					        
							
						        for (int l = 0; l < maxSize; l++) {
						            DataManagement obj1 = l < objsList1.size() ? objsList1.get(l) : null;
						            DataManagement obj2 = l < objsList2.size() ? objsList2.get(l) : null;
						            if(obj1 == null && obj2 == null) {
						            	 finalList.add(null);
						            }else if(obj1 == null) {
						            	 finalList.add(obj2);
						            }else if(obj2 == null) {
						            	 finalList.add(obj1);
						            }else  if(obj1 != null && obj2 != null) {
						            	 finalList.add(mergeObjects(obj1, obj2));
						            }
						        }
						        
						        int maxSize2 = Math.max(finalList.size(), objsList3.size());
						        for (int l = 0; l < maxSize2; l++) {
						            DataManagement obj1 = l < finalList.size() ? finalList.get(l) : null;
						            DataManagement obj2 = l < objsList3.size() ? objsList3.get(l) : null;
						            combinedList.add(mergeObjects(obj1, obj2));
						            if(obj1 == null && obj2 == null) {
						            	combinedList.add(null);
						            }else if(obj1 == null) {
						            	combinedList.add(obj2);
						            }else if(obj2 == null) {
						            	combinedList.add(obj1);
						            }else  if(obj1 != null && obj2 != null) {
						            	combinedList.add(mergeObjects(obj1, obj2));
						            }
						        }
			}else if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code()) && obj.getSbu_code().equals("IWM")) {
				
				if(obj.getDepartment_code().contains("Disp")) {
					 qry = "SELECT sbu_code "
					 		+ "      ,disposal_total_waste "
					 		+ "      ,disposal_dlf "
					 		+ "      ,disposal_lat "
					 		+ "      ,disposal_incineration "
					 		+ "      ,disposal_afrf "
					 		+ "      ,incineration_to_afrf "
					 		+ "      ,recycling_qty_inc "
					 		+ "      ,recycling_qty_afrf "
					 		+ "      ,recycling_qty_total "
					 		+ "      ,site from iwm_disposal_table where sbu_code is not null  ";
					 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) { 
							qry = qry + " and date = ? ";
							arrSize++;
						}
					 qry = qry + " GROUP BY sbu_code "
					 		+ "      ,disposal_total_waste "
					 		+ "      ,disposal_dlf "
					 		+ "      ,disposal_lat "
					 		+ "      ,disposal_incineration "
					 		+ "      ,disposal_afrf "
					 		+ "      ,incineration_to_afrf "
					 		+ "      ,recycling_qty_inc "
					 		+ "      ,recycling_qty_afrf "
					 		+ "      ,recycling_qty_total "
					 		+ "      ,site  ";
					 Object[] pValues = new Object[arrSize];
						int i = 0;
						if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							pValues[i++] = obj.getDate();
						}
					objsList1 = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
					return objsList1;
				}else if(obj.getDepartment_code().contains("reciept")) {
					arrSize = 0;
					qry = "";
					 qry = "SELECT sbu_code "
					 		+ "      ,receipt_total_waste "
					 		+ "      ,receipt_dlf "
					 		+ "      ,receipt_lat "
					 		+ "      ,receipt_incineration "
					 		+ "      ,receipt_afrf "
					 		+ "      ,incineration_to_afrf from iwm_receipt where sbu_code is not null  ";
					 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							qry = qry + " and date = ? ";
							arrSize++;
						}
					 qry = qry + " GROUP BY sbu_code "
					 		+ "      ,receipt_total_waste "
					 		+ "      ,receipt_dlf "
					 		+ "      ,receipt_lat "
					 		+ "      ,receipt_incineration "
					 		+ "      ,receipt_afrf "
					 		+ "      ,incineration_to_afrf ";
					 Object[] pValues1 = new Object[arrSize];
						int j = 0;
						if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							pValues1[j++] = obj.getDate();
						}
						objsList2 = jdbcTemplate.query( qry,pValues1, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
						return objsList2;
				}else if(obj.getDepartment_code().contains("open")) {
						arrSize = 0;
						qry = "";
						 qry = "SELECT sbu_code "
						 		+ "      ,opening_stock_total_waste "
						 		+ "      ,opening_stock_dlf "
						 		+ "      ,opening_stock_lat "
						 		+ "      ,opening_stock_incineration "
						 		+ "      ,opening_stock_afrf "
						 		+ "from iwm_opening_stock_table where sbu_code is not null  ";
						 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
								qry = qry + " and date = ? ";
								arrSize++;
							}
						 qry = qry + " GROUP BY "
						 		+ " sbu_code "
						 		+ "      ,opening_stock_total_waste "
						 		+ "      ,opening_stock_dlf "
						 		+ "      ,opening_stock_lat "
						 		+ "      ,opening_stock_incineration "
						 		+ "      ,opening_stock_afrf ";
						 Object[] pValues2 = new Object[arrSize];
							int k = 0;
							if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
								pValues2[k++] = obj.getDate();
							}
							objsList3 = jdbcTemplate.query( qry,pValues2, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
							return objsList3;
				}else if(obj.getDepartment_code().contains("close")) {
					arrSize = 0;
					qry = "";
					 qry = "SELECT sbu_code "
					 		+ "      ,closing_stock_total_waste "
					 		+ "      ,closing_stock_dlf "
					 		+ "      ,closing_stock_lat "
					 		+ "      ,closing_stock_incineration "
					 		+ "      ,closing_stock_afrf "
					 		+ "from iwm_closing_stock_table where sbu_code is not null  ";
					 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							qry = qry + " and date = ? ";
							arrSize++;
						}
					 qry = qry + " GROUP BY "
					 		+ " sbu_code "
					 		+ "      ,closing_stock_total_waste "
					 		+ "      ,closing_stock_dlf "
					 		+ "      ,closing_stock_lat "
					 		+ "      ,closing_stock_incineration "
					 		+ "      ,closing_stock_afrf ";
					 Object[] pValues2 = new Object[arrSize];
						int k = 0;
						if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							pValues2[k++] = obj.getDate();
						}
						objsList3 = jdbcTemplate.query( qry,pValues2, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
						return objsList3;
			}else {
				 qry = "SELECT sbu_code "
					 		+ "      ,disposal_total_waste "
					 		+ "      ,disposal_dlf "
					 		+ "      ,disposal_lat "
					 		+ "      ,disposal_incineration "
					 		+ "      ,disposal_afrf "
					 		+ "      ,incineration_to_afrf "
					 		+ "      ,recycling_qty_inc "
					 		+ "      ,recycling_qty_afrf "
					 		+ "      ,recycling_qty_total "
					 		+ "      ,site from iwm_disposal_table where sbu_code is not null  ";
					 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) { 
							qry = qry + " and date = ? ";
							arrSize++;
						}
					 qry = qry + " GROUP BY sbu_code "
					 		+ "      ,disposal_total_waste "
					 		+ "      ,disposal_dlf "
					 		+ "      ,disposal_lat "
					 		+ "      ,disposal_incineration "
					 		+ "      ,disposal_afrf "
					 		+ "      ,incineration_to_afrf "
					 		+ "      ,recycling_qty_inc "
					 		+ "      ,recycling_qty_afrf "
					 		+ "      ,recycling_qty_total "
					 		+ "      ,site  ";
					 Object[] pValues = new Object[arrSize];
						int i = 0;
						if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							pValues[i++] = obj.getDate();
						}
					objsList1 = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
					
					arrSize = 0;
					qry = "";
					 qry = "SELECT sbu_code "
					 		+ "      ,receipt_total_waste "
					 		+ "      ,receipt_dlf "
					 		+ "      ,receipt_lat "
					 		+ "      ,receipt_incineration "
					 		+ "      ,receipt_afrf "
					 		+ "      ,incineration_to_afrf from iwm_receipt where sbu_code is not null  ";
					 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							qry = qry + " and date = ? ";
							arrSize++;
						}
					 qry = qry + " GROUP BY sbu_code "
					 		+ "      ,receipt_total_waste "
					 		+ "      ,receipt_dlf "
					 		+ "      ,receipt_lat "
					 		+ "      ,receipt_incineration "
					 		+ "      ,receipt_afrf "
					 		+ "      ,incineration_to_afrf ";
					 Object[] pValues1 = new Object[arrSize];
						int j = 0;
						if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							pValues1[j++] = obj.getDate();
						}
						objsList2 = jdbcTemplate.query( qry,pValues1, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	

						arrSize = 0;
						qry = "";
						 qry = "SELECT sbu_code "
						 		+ "      ,opening_stock_total_waste "
						 		+ "      ,opening_stock_dlf "
						 		+ "      ,opening_stock_lat "
						 		+ "      ,opening_stock_incineration "
						 		+ "      ,opening_stock_afrf "
						 		+ "from iwm_opening_stock_table where sbu_code is not null  ";
						 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
								qry = qry + " and date = ? ";
								arrSize++;
							}
						 qry = qry + " GROUP BY "
						 		+ " sbu_code "
						 		+ "      ,opening_stock_total_waste "
						 		+ "      ,opening_stock_dlf "
						 		+ "      ,opening_stock_lat "
						 		+ "      ,opening_stock_incineration "
						 		+ "      ,opening_stock_afrf ";
						 Object[] pValues2 = new Object[arrSize];
							int k = 0;
							if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
								pValues2[k++] = obj.getDate();
							}
							objsList3 = jdbcTemplate.query( qry,pValues2, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	

							arrSize = 0;
					qry = "";
					 qry = "SELECT sbu_code "
					 		+ "      ,closing_stock_total_waste "
					 		+ "      ,closing_stock_dlf "
					 		+ "      ,closing_stock_lat "
					 		+ "      ,closing_stock_incineration "
					 		+ "      ,closing_stock_afrf "
					 		+ "from iwm_closing_stock_table where sbu_code is not null  ";
					 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							qry = qry + " and date = ? ";
							arrSize++;
						}
					 qry = qry + " GROUP BY "
					 		+ " sbu_code "
					 		+ "      ,closing_stock_total_waste "
					 		+ "      ,closing_stock_dlf "
					 		+ "      ,closing_stock_lat "
					 		+ "      ,closing_stock_incineration "
					 		+ "      ,closing_stock_afrf ";
					  pValues2 = new Object[arrSize];
						 k = 0;
						if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							pValues2[k++] = obj.getDate();
						}
						objsList4 = jdbcTemplate.query( qry,pValues2, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
						  int maxSize = Math.max(objsList1.size(), objsList2.size());
					        
							
					        for (int l = 0; l < maxSize; l++) {
					            DataManagement obj1 = l < objsList1.size() ? objsList1.get(l) : null;
					            DataManagement obj2 = l < objsList2.size() ? objsList2.get(l) : null;
					            if(obj1 == null && obj2 == null) {
					            	 finalList.add(null);
					            }else if(obj1 == null) {
					            	 finalList.add(obj2);
					            }else if(obj2 == null) {
					            	 finalList.add(obj1);
					            }else  if(obj1 != null && obj2 != null) {
					            	 finalList.add(mergeObjects(obj1, obj2));
					            }
					        }
					        
					        int maxSize2 = Math.max(finalList.size(), objsList3.size());
					        for (int l = 0; l < maxSize2; l++) {
					            DataManagement obj1 = l < finalList.size() ? finalList.get(l) : null;
					            DataManagement obj2 = l < objsList3.size() ? objsList3.get(l) : null;
					            combinedList.add(mergeObjects(obj1, obj2));
					            if(obj1 == null && obj2 == null) {
					            	combinedList.add(null);
					            }else if(obj1 == null) {
					            	combinedList.add(obj2);
					            }else if(obj2 == null) {
					            	combinedList.add(obj1);
					            }else  if(obj1 != null && obj2 != null) {
					            	combinedList.add(mergeObjects(obj1, obj2));
					            }
					        }
					        
					        int maxSize3 = Math.max(finalList.size(), objsList4.size());
					        for (int l = 0; l < maxSize3; l++) {
					            DataManagement obj1 = l < combinedList.size() ? combinedList.get(l) : null;
					            DataManagement obj2 = l < objsList4.size() ? objsList4.get(l) : null;
					            LastList.add(mergeObjects(obj1, obj2));
					            if(obj1 == null && obj2 == null) {
					            	LastList.add(null);
					            }else if(obj1 == null) {
					            	LastList.add(obj2);
					            }else if(obj2 == null) {
					            	LastList.add(obj1);
					            }else  if(obj1 != null && obj2 != null) {
					            	LastList.add(mergeObjects(obj1, obj2));
					            }
					        }
					        if(LastList.size() > 0) {
					        	LastList =	LastList.stream()
                                .findFirst()
                                .map(Collections::singletonList)
                                .orElse(Collections.emptyList());
					        	 return LastList;
					        }else {
					        	 return LastList;
					        }
					       
					        
			          }
			}else if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getSbu_code()) && obj.getSbu_code().equals("MSW")) {
				
				if(obj.getDepartment_code().contains("CNT")) {
					 qry = "SELECT sbu_code,quantity,quantity_measure from collect_table where sbu_code is not null  ";
					 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) { 
							qry = qry + " and date = ? ";
							arrSize++;
						}
					 qry = qry + " GROUP BY sbu_code,quantity,quantity_measure  ";
					 Object[] pValues = new Object[arrSize];
						int i = 0;
						if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							pValues[i++] = obj.getDate();
						}
						objsList1 = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
					return objsList1;
				}else if(obj.getDepartment_code().contains("process") || obj.getDepartment_code().contains("Dist")) {
					arrSize = 0;
					qry = "";
					 qry = "SELECT sbu_code "
					 		+ "      ,sbu_code "
					 		+ "      ,total_waste "
					 		+ "      ,total_rdf "
					 		+ "      ,total_compost "
					 		+ "      ,total_inerts"
					 		+ "		 ,[rdf] "
					 		+ "      ,[compost] "
					 		+ "      ,[recyclables] "
					 		+ "      ,[inserts] "
					 		+ "      ,[vendor_name_rdf] "
					 		+ "      ,[vendor_name_compost] "
					 		+ "      ,[vendor_name_recyclables] "
					 		+ "      ,[vendor_name_inserts] "
					 		+ "      ,total_recylables from msw_processing_table where sbu_code is not null  ";
					 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							qry = qry + " and date = ? ";
							arrSize++;
						}
					 qry = qry + " GROUP BY sbu_code "
					 		+ "      ,sbu_code "
					 		+ "      ,total_waste "
					 		+ "      ,total_rdf "
					 		+ "      ,total_compost "
					 		+ "      ,total_inerts "
					 		+ "		 ,[rdf] "
					 		+ "      ,[compost] "
					 		+ "      ,[recyclables] "
					 		+ "      ,[inserts] "
					 		+ "      ,[vendor_name_rdf] "
					 		+ "      ,[vendor_name_compost] "
					 		+ "      ,[vendor_name_recyclables] "
					 		+ "      ,[vendor_name_inserts] "
					 		+ "      ,total_recylables ";
					 Object[] pValues1 = new Object[arrSize];
						int j = 0;
						if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							pValues1[j++] = obj.getDate();
						}
						objsList2 = jdbcTemplate.query( qry,pValues1, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
						return objsList2;
				}else if(obj.getDepartment_code().contains("Wte")) {
						arrSize = 0;
						qry = "";
						 qry = "SELECT sbu_code "
							 		+ "      ,rdf_receipt "
							 		+ "      ,rdf_combusted "
							 		+ "      ,ash_generated "
							 		+ "      ,steam_generation "
							 		+ "      ,power_produced "
							 		+ "      ,power_export "
							 		+ "      ,auxiliary_consumption"
							 		+ ",[plant_generation_capacity] "
							 		+ "      ,[bottom_ash] "
							 		+ "      ,[fly_ash] "
							 		+ "      ,[plant_load_factor] "
							 		+ "from msw_wte_table where sbu_code is not null  ";
							 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
									qry = qry + " and date = ? ";
									arrSize++;
								}
							 qry = qry + " GROUP BY "
							 		+ " sbu_code "
							 		+ "     ,rdf_receipt "
							 		+ "      ,rdf_combusted "
							 		+ "      ,ash_generated "
							 		+ "      ,steam_generation "
							 		+ "      ,power_produced "
							 		+ "      ,power_export "
							 		+ "      ,auxiliary_consumption "
							 		+ ",[plant_generation_capacity] "
							 		+ "      ,[bottom_ash] "
							 		+ "      ,[fly_ash] "
							 		+ "      ,[plant_load_factor] ";
						 Object[] pValues2 = new Object[arrSize];
							int k = 0;
							if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
								pValues2[k++] = obj.getDate();
							}
							objsList3 = jdbcTemplate.query( qry,pValues2, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
							return objsList3;
				}else {
				 qry = "SELECT sbu_code,quantity,quantity_measure from collect_table where sbu_code is not null  ";
				 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) { 
						qry = qry + " and date = ? ";
						arrSize++;
					}
				 qry = qry + " GROUP BY sbu_code,quantity,quantity_measure  ";
				 Object[] pValues = new Object[arrSize];
					int i = 0;
					if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
						pValues[i++] = obj.getDate();
					}
					objsList1 = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
					
					arrSize = 0;
					qry = "";
					 qry = "SELECT sbu_code "
						 		+ "      ,sbu_code "
						 		+ "      ,total_waste "
						 		+ "      ,total_rdf "
						 		+ "      ,total_compost "
						 		+ "      ,total_inerts"
						 		+ "		 ,[rdf] "
						 		+ "      ,[compost] "
						 		+ "      ,[recyclables] "
						 		+ "      ,[inserts] "
						 		+ "      ,[vendor_name_rdf] "
						 		+ "      ,[vendor_name_compost] "
						 		+ "      ,[vendor_name_recyclables] "
						 		+ "      ,[vendor_name_inserts] "
						 		+ "      ,total_recylables from msw_processing_table where sbu_code is not null  ";
						 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
								qry = qry + " and date = ? ";
								arrSize++;
							}
						 qry = qry + " GROUP BY sbu_code "
						 		+ "      ,sbu_code "
						 		+ "      ,total_waste "
						 		+ "      ,total_rdf "
						 		+ "      ,total_compost "
						 		+ "      ,total_inerts "
						 		+ "		 ,[rdf] "
						 		+ "      ,[compost] "
						 		+ "      ,[recyclables] "
						 		+ "      ,[inserts] "
						 		+ "      ,[vendor_name_rdf] "
						 		+ "      ,[vendor_name_compost] "
						 		+ "      ,[vendor_name_recyclables] "
						 		+ "      ,[vendor_name_inserts] "
						 		+ "      ,total_recylables ";
					 Object[] pValues1 = new Object[arrSize];
						int j = 0;
						if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
							pValues1[j++] = obj.getDate();
						}
						objsList2 = jdbcTemplate.query( qry,pValues1, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	

						arrSize = 0;
						qry = "";
						 qry = "SELECT sbu_code "
						 		+ "      ,rdf_receipt "
						 		+ "      ,rdf_combusted "
						 		+ "      ,ash_generated "
						 		+ "      ,steam_generation "
						 		+ "      ,power_produced "
						 		+ "      ,power_export "
						 		+ "      ,auxiliary_consumption"
						 		+ ",[plant_generation_capacity] "
						 		+ "      ,[bottom_ash] "
						 		+ "      ,[fly_ash] "
						 		+ "      ,[plant_load_factor] "
						 		+ "from msw_wte_table where sbu_code is not null  ";
						 if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
								qry = qry + " and date = ? ";
								arrSize++;
							}
						 qry = qry + " GROUP BY "
						 		+ " sbu_code "
						 		+ "     ,rdf_receipt "
						 		+ "      ,rdf_combusted "
						 		+ "      ,ash_generated "
						 		+ "      ,steam_generation "
						 		+ "      ,power_produced "
						 		+ "      ,power_export "
						 		+ "      ,auxiliary_consumption "
						 		+ ",[plant_generation_capacity] "
						 		+ "      ,[bottom_ash] "
						 		+ "      ,[fly_ash] "
						 		+ "      ,[plant_load_factor] ";
						 Object[] pValues2 = new Object[arrSize];
							int k = 0;
							if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getDate())) {
								pValues2[k++] = obj.getDate();
							}
							objsList3 = jdbcTemplate.query( qry,pValues2, new BeanPropertyRowMapper<DataManagement>(DataManagement.class));	
						  int maxSize = Math.max(objsList1.size(), objsList2.size());
					        
							
					        for (int l = 0; l < maxSize; l++) {
					            DataManagement obj1 = l < objsList1.size() ? objsList1.get(l) : null;
					            DataManagement obj2 = l < objsList2.size() ? objsList2.get(l) : null;
					            if(obj1 == null && obj2 == null) {
					            	 finalList.add(null);
					            }else if(obj1 == null) {
					            	 finalList.add(obj2);
					            }else if(obj2 == null) {
					            	 finalList.add(obj1);
					            }else  if(obj1 != null && obj2 != null) {
					            	 finalList.add(mergeObjects(obj1, obj2));
					            }
					        }
					        
					        int maxSize2 = Math.max(finalList.size(), objsList3.size());
					        for (int l = 0; l < maxSize2; l++) {
					            DataManagement obj1 = l < finalList.size() ? finalList.get(l) : null;
					            DataManagement obj2 = l < objsList3.size() ? objsList3.get(l) : null;
					            combinedList.add(mergeObjects(obj1, obj2));
					            if(obj1 == null && obj2 == null) {
					            	combinedList.add(null);
					            }else if(obj1 == null) {
					            	combinedList.add(obj2);
					            }else if(obj2 == null) {
					            	combinedList.add(obj1);
					            }else  if(obj1 != null && obj2 != null) {
					            	combinedList.add(mergeObjects(obj1, obj2));
					            }
					        }
					
					        if(combinedList.size() > 0) {
					        	combinedList =	combinedList.stream()
                                .findFirst()
                                .map(Collections::singletonList)
                                .orElse(Collections.emptyList());
					        	 return combinedList;
					        }else {
					        	 return combinedList;
					        }
					       
					        
			          }
			
			}
			
			} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return combinedList;
	}
	
    public static <T> T mergeObjects(T obj1, T obj2) throws IllegalAccessException, InstantiationException {
        Class<?> clazz = obj1.getClass();
        T result = (T) clazz.newInstance();

        Field[] fields = clazz.getDeclaredFields();
        Arrays.stream(fields)
                .filter(field -> {
                    try {
                        // Allow access to private fields
                        field.setAccessible(true);
                        // Filter fields which are not null in obj1 or obj2
                        return field.get(obj1) != null || field.get(obj2) != null;
                    } catch (IllegalAccessException e) {
                        return false;
                    }
                })
                .forEach(field -> {
                    try {
                        // Take value from obj2 if not null, otherwise from obj1
                        Object value = field.get(obj2) != null ? field.get(obj2) : field.get(obj1);
                        field.set(result, value);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });

        return result;
    }
	
}
