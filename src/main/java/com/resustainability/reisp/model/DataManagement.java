package com.resustainability.reisp.model;

public class DataManagement {

	private String id, total_materials, total_recylable, total_bags,status, total_glass, total_cardboard,site_name,
			quality_measure_materials, quality_measure_recylable, quality_measure_plastics, quality_measure_bags,
			quality_measure_glass, quality_measure_cardboard, site, comments, date, created_by, modified_date,
			created_date, modified_by, total_waste, total_incieration, total_autoclave, quantity_measure_waste,
			quantity_measure_incieration,quantity_measure_rdf_outflow,quantity_measure_compost_outflow,quantity_measure_recyclables_outflow,quantity_measure_inerts_outflow, quantity_measure_autoclave, sbu_code, quantity, quantity_measure, role,
			department_code, department_name, rdf, compost, recyclables, inserts, vendor_name_rdf, vendor_name_compost,
			vendor_name_recyclables, vendor_name_inserts, vendor_name_rdf_outflow, vendor_name_compost_outflow,
			vendor_name_recylables_outflow, vendor_name_inserts_outflow, total_rdf, total_compost, total_inerts,total_plastic,
			total_recylables, quantity_measure_rdf, quantity_measure_compost, quantity_measure_inerts,
			quantity_measure_recylabels, disposal_total_waste, disposal_dlf, disposal_lat, disposal_incineration,
			disposal_total_waste_measure, disposal_dlf_measure, disposal_lat_measure, disposal_incineration_measure,
			stock_total_waste, stock_dlf, stock_lat, stock_incineration, stock_afrf, stock_total_waste_measure,
			stock_dlf_measure, stock_lat_measure,mergedValue, stock_incineration_measure,disposal_afrf_measure,disposal_afrf, stock_afrf_measure,from_date,to_date,isMobile,rdf_receipt,rdf_combusted,ash_generated,steam_generation,power_produced,power_export,auxiliary_consumption,quantity_measure_rdf_receipt,quantity_measure_rdf_combusted
			,plant_load_factor,quantity_measure_ash_generated,recyclable_to_recycle_unit,plant_generation_capacity,bottom_ash,fly_ash,quantity_measure_steam_generation,quantity_measure_power_produced,quantity_measure_power_export,quantity_measure_auxiliary_consumption
,rdf_to_WTE  ,closing_stock_total_waste
,closing_stock_dlf
,closing_stock_lat
,closing_stock_incineration
,closing_stock_afrf,

receipt_total_waste
,receipt_dlf
,receipt_lat
,receipt_incineration
,receipt_afrf
,incineration_to_afrf


,recycling_qty_inc
,recycling_qty_afrf
,recycling_qty_total

,opening_stock_total_waste
,opening_stock_dlf
,opening_stock_lat
,opening_stock_incineration
,opening_stock_afrf;

	private double quantity_sum,total_materials_sum, total_recylable_sum, total_bags_sum,total_glass_sum,total_cardboard_sum,
	total_waste_sum,total_incieration_sum,total_autoclave_sum,total_plastic_sum,rdf_sum,compost_sum,recyclables_sum,inserts_sum,total_rdf_sum,total_compost_sum,total_inerts_sum,total_recylables_sum,rdf_receipt_sum ,rdf_combusted_sum
    ,ash_generated_sum
    ,steam_generation_sum
    ,power_produced_sum
    ,power_export_sum
    ,auxiliary_consumption_sum,
    disposal_total_waste_sum
    ,disposal_dlf_sum
    ,disposal_lat_sum
    ,disposal_afrf_sum
    ,disposal_incineration_sum 
    ,incineration_to_afrf_sum
    ,recycling_qty_inc_sum
    ,recycling_qty_afrf_sum
    ,recycling_qty_total_sum
    ,
    stock_total_waste_sum
    ,stock_dlf_sum
    ,stock_lat_sum
    ,stock_incineration_sum
    ,stock_afrf_sum,plant_generation_capacity_sum,bottom_ash_sum,fly_ash_sum,plant_load_factor_sum,rdf_to_WTE_sum
    
    ,closing_stock_total_waste_sum
    ,closing_stock_dlf_sum
    ,closing_stock_lat_sum
    ,closing_stock_incineration_sum
    ,closing_stock_afrf_sum,
    
    
    receipt_total_waste_sum
    ,receipt_dlf_sum
    ,receipt_lat_sum
    ,receipt_incineration_sum
    ,receipt_afrf_sum
    
    
    ,opening_stock_total_waste_sum
    ,opening_stock_dlf_sum
    ,opening_stock_lat_sum
    ,opening_stock_incineration_sum
    ,opening_stock_afrf_sum;

public String getReceipt_total_waste() {
		return receipt_total_waste;
	}

	public void setReceipt_total_waste(String receipt_total_waste) {
		this.receipt_total_waste = receipt_total_waste;
	}

	public String getReceipt_dlf() {
		return receipt_dlf;
	}

	public void setReceipt_dlf(String receipt_dlf) {
		this.receipt_dlf = receipt_dlf;
	}

	public String getReceipt_lat() {
		return receipt_lat;
	}

	public void setReceipt_lat(String receipt_lat) {
		this.receipt_lat = receipt_lat;
	}

	public String getReceipt_incineration() {
		return receipt_incineration;
	}

	public void setReceipt_incineration(String receipt_incineration) {
		this.receipt_incineration = receipt_incineration;
	}

	public String getReceipt_afrf() {
		return receipt_afrf;
	}

	public void setReceipt_afrf(String receipt_afrf) {
		this.receipt_afrf = receipt_afrf;
	}

	public String getIncineration_to_afrf() {
		return incineration_to_afrf;
	}

	public void setIncineration_to_afrf(String incineration_to_afrf) {
		this.incineration_to_afrf = incineration_to_afrf;
	}

	public String getRecycling_qty_inc() {
		return recycling_qty_inc;
	}

	public void setRecycling_qty_inc(String recycling_qty_inc) {
		this.recycling_qty_inc = recycling_qty_inc;
	}

	public String getRecycling_qty_afrf() {
		return recycling_qty_afrf;
	}

	public void setRecycling_qty_afrf(String recycling_qty_afrf) {
		this.recycling_qty_afrf = recycling_qty_afrf;
	}

	public String getRecycling_qty_total() {
		return recycling_qty_total;
	}

	public void setRecycling_qty_total(String recycling_qty_total) {
		this.recycling_qty_total = recycling_qty_total;
	}

	public String getOpening_stock_total_waste() {
		return opening_stock_total_waste;
	}

	public void setOpening_stock_total_waste(String opening_stock_total_waste) {
		this.opening_stock_total_waste = opening_stock_total_waste;
	}

	public String getOpening_stock_dlf() {
		return opening_stock_dlf;
	}

	public void setOpening_stock_dlf(String opening_stock_dlf) {
		this.opening_stock_dlf = opening_stock_dlf;
	}

	public String getOpening_stock_lat() {
		return opening_stock_lat;
	}

	public void setOpening_stock_lat(String opening_stock_lat) {
		this.opening_stock_lat = opening_stock_lat;
	}

	public String getOpening_stock_incineration() {
		return opening_stock_incineration;
	}

	public void setOpening_stock_incineration(String opening_stock_incineration) {
		this.opening_stock_incineration = opening_stock_incineration;
	}

	public String getOpening_stock_afrf() {
		return opening_stock_afrf;
	}

	public void setOpening_stock_afrf(String opening_stock_afrf) {
		this.opening_stock_afrf = opening_stock_afrf;
	}

	public double getReceipt_total_waste_sum() {
		return receipt_total_waste_sum;
	}

	public void setReceipt_total_waste_sum(double receipt_total_waste_sum) {
		this.receipt_total_waste_sum = receipt_total_waste_sum;
	}

	public double getReceipt_dlf_sum() {
		return receipt_dlf_sum;
	}

	public void setReceipt_dlf_sum(double receipt_dlf_sum) {
		this.receipt_dlf_sum = receipt_dlf_sum;
	}

	public double getReceipt_lat_sum() {
		return receipt_lat_sum;
	}

	public void setReceipt_lat_sum(double receipt_lat_sum) {
		this.receipt_lat_sum = receipt_lat_sum;
	}

	public double getReceipt_incineration_sum() {
		return receipt_incineration_sum;
	}

	public void setReceipt_incineration_sum(double receipt_incineration_sum) {
		this.receipt_incineration_sum = receipt_incineration_sum;
	}

	public double getReceipt_afrf_sum() {
		return receipt_afrf_sum;
	}

	public void setReceipt_afrf_sum(double receipt_afrf_sum) {
		this.receipt_afrf_sum = receipt_afrf_sum;
	}

	public double getIncineration_to_afrf_sum() {
		return incineration_to_afrf_sum;
	}

	public void setIncineration_to_afrf_sum(double incineration_to_afrf_sum) {
		this.incineration_to_afrf_sum = incineration_to_afrf_sum;
	}

	public double getRecycling_qty_inc_sum() {
		return recycling_qty_inc_sum;
	}

	public void setRecycling_qty_inc_sum(double recycling_qty_inc_sum) {
		this.recycling_qty_inc_sum = recycling_qty_inc_sum;
	}

	public double getRecycling_qty_afrf_sum() {
		return recycling_qty_afrf_sum;
	}

	public void setRecycling_qty_afrf_sum(double recycling_qty_afrf_sum) {
		this.recycling_qty_afrf_sum = recycling_qty_afrf_sum;
	}

	public double getRecycling_qty_total_sum() {
		return recycling_qty_total_sum;
	}

	public void setRecycling_qty_total_sum(double recycling_qty_total_sum) {
		this.recycling_qty_total_sum = recycling_qty_total_sum;
	}

	public double getOpening_stock_total_waste_sum() {
		return opening_stock_total_waste_sum;
	}

	public void setOpening_stock_total_waste_sum(double opening_stock_total_waste_sum) {
		this.opening_stock_total_waste_sum = opening_stock_total_waste_sum;
	}

	public double getOpening_stock_dlf_sum() {
		return opening_stock_dlf_sum;
	}

	public void setOpening_stock_dlf_sum(double opening_stock_dlf_sum) {
		this.opening_stock_dlf_sum = opening_stock_dlf_sum;
	}

	public double getOpening_stock_lat_sum() {
		return opening_stock_lat_sum;
	}

	public void setOpening_stock_lat_sum(double opening_stock_lat_sum) {
		this.opening_stock_lat_sum = opening_stock_lat_sum;
	}

	public double getOpening_stock_incineration_sum() {
		return opening_stock_incineration_sum;
	}

	public void setOpening_stock_incineration_sum(double opening_stock_incineration_sum) {
		this.opening_stock_incineration_sum = opening_stock_incineration_sum;
	}

	public double getOpening_stock_afrf_sum() {
		return opening_stock_afrf_sum;
	}

	public void setOpening_stock_afrf_sum(double opening_stock_afrf_sum) {
		this.opening_stock_afrf_sum = opening_stock_afrf_sum;
	}

public String getClosing_stock_total_waste() {
		return closing_stock_total_waste;
	}

	public void setClosing_stock_total_waste(String closing_stock_total_waste) {
		this.closing_stock_total_waste = closing_stock_total_waste;
	}

	public String getClosing_stock_dlf() {
		return closing_stock_dlf;
	}

	public void setClosing_stock_dlf(String closing_stock_dlf) {
		this.closing_stock_dlf = closing_stock_dlf;
	}

	public String getClosing_stock_lat() {
		return closing_stock_lat;
	}

	public void setClosing_stock_lat(String closing_stock_lat) {
		this.closing_stock_lat = closing_stock_lat;
	}

	public String getClosing_stock_incineration() {
		return closing_stock_incineration;
	}

	public void setClosing_stock_incineration(String closing_stock_incineration) {
		this.closing_stock_incineration = closing_stock_incineration;
	}

	public String getClosing_stock_afrf() {
		return closing_stock_afrf;
	}

	public void setClosing_stock_afrf(String closing_stock_afrf) {
		this.closing_stock_afrf = closing_stock_afrf;
	}

	public double getClosing_stock_total_waste_sum() {
		return closing_stock_total_waste_sum;
	}

	public void setClosing_stock_total_waste_sum(double closing_stock_total_waste_sum) {
		this.closing_stock_total_waste_sum = closing_stock_total_waste_sum;
	}

	public double getClosing_stock_dlf_sum() {
		return closing_stock_dlf_sum;
	}

	public void setClosing_stock_dlf_sum(double closing_stock_dlf_sum) {
		this.closing_stock_dlf_sum = closing_stock_dlf_sum;
	}

	public double getClosing_stock_lat_sum() {
		return closing_stock_lat_sum;
	}

	public void setClosing_stock_lat_sum(double closing_stock_lat_sum) {
		this.closing_stock_lat_sum = closing_stock_lat_sum;
	}

	public double getClosing_stock_incineration_sum() {
		return closing_stock_incineration_sum;
	}

	public void setClosing_stock_incineration_sum(double closing_stock_incineration_sum) {
		this.closing_stock_incineration_sum = closing_stock_incineration_sum;
	}

	public double getClosing_stock_afrf_sum() {
		return closing_stock_afrf_sum;
	}

	public void setClosing_stock_afrf_sum(double closing_stock_afrf_sum) {
		this.closing_stock_afrf_sum = closing_stock_afrf_sum;
	}

public String getRecyclable_to_recycle_unit() {
		return recyclable_to_recycle_unit;
	}

	public void setRecyclable_to_recycle_unit(String recyclable_to_recycle_unit) {
		this.recyclable_to_recycle_unit = recyclable_to_recycle_unit;
	}

public String getRdf_to_WTE() {
		return rdf_to_WTE;
	}

	public void setRdf_to_WTE(String rdf_to_WTE) {
		this.rdf_to_WTE = rdf_to_WTE;
	}

	public double getRdf_to_WTE_sum() {
		return rdf_to_WTE_sum;
	}

	public void setRdf_to_WTE_sum(double rdf_to_WTE_sum) {
		this.rdf_to_WTE_sum = rdf_to_WTE_sum;
	}

public String getPlant_load_factor() {
		return plant_load_factor;
	}

	public void setPlant_load_factor(String plant_load_factor) {
		this.plant_load_factor = plant_load_factor;
	}

	public double getPlant_load_factor_sum() {
		return plant_load_factor_sum;
	}

	public void setPlant_load_factor_sum(double plant_load_factor_sum) {
		this.plant_load_factor_sum = plant_load_factor_sum;
	}

public String getPlant_generation_capacity() {
		return plant_generation_capacity;
	}

	public void setPlant_generation_capacity(String plant_generation_capacity) {
		this.plant_generation_capacity = plant_generation_capacity;
	}

	public String getBottom_ash() {
		return bottom_ash;
	}

	public void setBottom_ash(String bottom_ash) {
		this.bottom_ash = bottom_ash;
	}

	public String getFly_ash() {
		return fly_ash;
	}

	public void setFly_ash(String fly_ash) {
		this.fly_ash = fly_ash;
	}

	public double getPlant_generation_capacity_sum() {
		return plant_generation_capacity_sum;
	}

	public void setPlant_generation_capacity_sum(double plant_generation_capacity_sum) {
		this.plant_generation_capacity_sum = plant_generation_capacity_sum;
	}

	public double getBottom_ash_sum() {
		return bottom_ash_sum;
	}

	public void setBottom_ash_sum(double bottom_ash_sum) {
		this.bottom_ash_sum = bottom_ash_sum;
	}

	public double getFly_ash_sum() {
		return fly_ash_sum;
	}

	public void setFly_ash_sum(double fly_ash_sum) {
		this.fly_ash_sum = fly_ash_sum;
	}

public double getDisposal_total_waste_sum() {
		return disposal_total_waste_sum;
	}

	public void setDisposal_total_waste_sum(double disposal_total_waste_sum) {
		this.disposal_total_waste_sum = disposal_total_waste_sum;
	}

	public double getDisposal_dlf_sum() {
		return disposal_dlf_sum;
	}

	public void setDisposal_dlf_sum(double disposal_dlf_sum) {
		this.disposal_dlf_sum = disposal_dlf_sum;
	}

	public double getDisposal_lat_sum() {
		return disposal_lat_sum;
	}

	public void setDisposal_lat_sum(double disposal_lat_sum) {
		this.disposal_lat_sum = disposal_lat_sum;
	}

	public double getDisposal_afrf_sum() {
		return disposal_afrf_sum;
	}

	public void setDisposal_afrf_sum(double disposal_afrf_sum) {
		this.disposal_afrf_sum = disposal_afrf_sum;
	}

	public double getDisposal_incineration_sum() {
		return disposal_incineration_sum;
	}

	public void setDisposal_incineration_sum(double disposal_incineration_sum) {
		this.disposal_incineration_sum = disposal_incineration_sum;
	}

	public double getStock_total_waste_sum() {
		return stock_total_waste_sum;
	}

	public void setStock_total_waste_sum(double stock_total_waste_sum) {
		this.stock_total_waste_sum = stock_total_waste_sum;
	}

	public double getStock_dlf_sum() {
		return stock_dlf_sum;
	}

	public void setStock_dlf_sum(double stock_dlf_sum) {
		this.stock_dlf_sum = stock_dlf_sum;
	}

	public double getStock_lat_sum() {
		return stock_lat_sum;
	}

	public void setStock_lat_sum(double stock_lat_sum) {
		this.stock_lat_sum = stock_lat_sum;
	}

	public double getStock_incineration_sum() {
		return stock_incineration_sum;
	}

	public void setStock_incineration_sum(double stock_incineration_sum) {
		this.stock_incineration_sum = stock_incineration_sum;
	}

	public double getStock_afrf_sum() {
		return stock_afrf_sum;
	}

	public void setStock_afrf_sum(double stock_afrf_sum) {
		this.stock_afrf_sum = stock_afrf_sum;
	}

public double getRdf_sum() {
		return rdf_sum;
	}

	public void setRdf_sum(double rdf_sum) {
		this.rdf_sum = rdf_sum;
	}

	public double getCompost_sum() {
		return compost_sum;
	}

	public void setCompost_sum(double compost_sum) {
		this.compost_sum = compost_sum;
	}

	public double getRecyclables_sum() {
		return recyclables_sum;
	}

	public void setRecyclables_sum(double recyclables_sum) {
		this.recyclables_sum = recyclables_sum;
	}

	public double getInserts_sum() {
		return inserts_sum;
	}

	public void setInserts_sum(double inserts_sum) {
		this.inserts_sum = inserts_sum;
	}

	public double getTotal_rdf_sum() {
		return total_rdf_sum;
	}

	public void setTotal_rdf_sum(double total_rdf_sum) {
		this.total_rdf_sum = total_rdf_sum;
	}

	public double getTotal_compost_sum() {
		return total_compost_sum;
	}

	public void setTotal_compost_sum(double total_compost_sum) {
		this.total_compost_sum = total_compost_sum;
	}

	public double getTotal_inerts_sum() {
		return total_inerts_sum;
	}

	public void setTotal_inerts_sum(double total_inerts_sum) {
		this.total_inerts_sum = total_inerts_sum;
	}

	public double getTotal_recylables_sum() {
		return total_recylables_sum;
	}

	public void setTotal_recylables_sum(double total_recylables_sum) {
		this.total_recylables_sum = total_recylables_sum;
	}

	public double getRdf_receipt_sum() {
		return rdf_receipt_sum;
	}

	public void setRdf_receipt_sum(double rdf_receipt_sum) {
		this.rdf_receipt_sum = rdf_receipt_sum;
	}

	public double getRdf_combusted_sum() {
		return rdf_combusted_sum;
	}

	public void setRdf_combusted_sum(double rdf_combusted_sum) {
		this.rdf_combusted_sum = rdf_combusted_sum;
	}

	public double getAsh_generated_sum() {
		return ash_generated_sum;
	}

	public void setAsh_generated_sum(double ash_generated_sum) {
		this.ash_generated_sum = ash_generated_sum;
	}

	public double getSteam_generation_sum() {
		return steam_generation_sum;
	}

	public void setSteam_generation_sum(double steam_generation_sum) {
		this.steam_generation_sum = steam_generation_sum;
	}

	public double getPower_produced_sum() {
		return power_produced_sum;
	}

	public void setPower_produced_sum(double power_produced_sum) {
		this.power_produced_sum = power_produced_sum;
	}

	public double getPower_export_sum() {
		return power_export_sum;
	}

	public void setPower_export_sum(double power_export_sum) {
		this.power_export_sum = power_export_sum;
	}

	public double getAuxiliary_consumption_sum() {
		return auxiliary_consumption_sum;
	}

	public void setAuxiliary_consumption_sum(double auxiliary_consumption_sum) {
		this.auxiliary_consumption_sum = auxiliary_consumption_sum;
	}

public String getRdf_receipt() {
		return rdf_receipt;
	}

	public void setRdf_receipt(String rdf_receipt) {
		this.rdf_receipt = rdf_receipt;
	}

	public String getRdf_combusted() {
		return rdf_combusted;
	}

	public void setRdf_combusted(String rdf_combusted) {
		this.rdf_combusted = rdf_combusted;
	}

	public String getAsh_generated() {
		return ash_generated;
	}

	public void setAsh_generated(String ash_generated) {
		this.ash_generated = ash_generated;
	}

	public String getSteam_generation() {
		return steam_generation;
	}

	public void setSteam_generation(String steam_generation) {
		this.steam_generation = steam_generation;
	}

	public String getPower_produced() {
		return power_produced;
	}

	public void setPower_produced(String power_produced) {
		this.power_produced = power_produced;
	}

	public String getPower_export() {
		return power_export;
	}

	public void setPower_export(String power_export) {
		this.power_export = power_export;
	}

	public String getAuxiliary_consumption() {
		return auxiliary_consumption;
	}

	public void setAuxiliary_consumption(String auxiliary_consumption) {
		this.auxiliary_consumption = auxiliary_consumption;
	}

	public String getQuantity_measure_rdf_receipt() {
		return quantity_measure_rdf_receipt;
	}

	public void setQuantity_measure_rdf_receipt(String quantity_measure_rdf_receipt) {
		this.quantity_measure_rdf_receipt = quantity_measure_rdf_receipt;
	}

	public String getQuantity_measure_rdf_combusted() {
		return quantity_measure_rdf_combusted;
	}

	public void setQuantity_measure_rdf_combusted(String quantity_measure_rdf_combusted) {
		this.quantity_measure_rdf_combusted = quantity_measure_rdf_combusted;
	}

	public String getQuantity_measure_ash_generated() {
		return quantity_measure_ash_generated;
	}

	public void setQuantity_measure_ash_generated(String quantity_measure_ash_generated) {
		this.quantity_measure_ash_generated = quantity_measure_ash_generated;
	}

	public String getQuantity_measure_steam_generation() {
		return quantity_measure_steam_generation;
	}

	public void setQuantity_measure_steam_generation(String quantity_measure_steam_generation) {
		this.quantity_measure_steam_generation = quantity_measure_steam_generation;
	}

	public String getQuantity_measure_power_produced() {
		return quantity_measure_power_produced;
	}

	public void setQuantity_measure_power_produced(String quantity_measure_power_produced) {
		this.quantity_measure_power_produced = quantity_measure_power_produced;
	}

	public String getQuantity_measure_power_export() {
		return quantity_measure_power_export;
	}

	public void setQuantity_measure_power_export(String quantity_measure_power_export) {
		this.quantity_measure_power_export = quantity_measure_power_export;
	}

	public String getQuantity_measure_auxiliary_consumption() {
		return quantity_measure_auxiliary_consumption;
	}

	public void setQuantity_measure_auxiliary_consumption(String quantity_measure_auxiliary_consumption) {
		this.quantity_measure_auxiliary_consumption = quantity_measure_auxiliary_consumption;
	}

public double getTotal_plastic_sum() {
		return total_plastic_sum;
	}

	public void setTotal_plastic_sum(double total_plastic_sum) {
		this.total_plastic_sum = total_plastic_sum;
	}

public String getMergedValue() {
		return mergedValue;
	}

	public double getQuantity_sum() {
		return quantity_sum;
	}

	public double getTotal_materials_sum() {
		return total_materials_sum;
	}

	public double getTotal_recylable_sum() {
		return total_recylable_sum;
	}

	public double getTotal_bags_sum() {
		return total_bags_sum;
	}

	public double getTotal_glass_sum() {
		return total_glass_sum;
	}

	public double getTotal_cardboard_sum() {
		return total_cardboard_sum;
	}

	public double getTotal_waste_sum() {
		return total_waste_sum;
	}

	public double getTotal_incieration_sum() {
		return total_incieration_sum;
	}

	public double getTotal_autoclave_sum() {
		return total_autoclave_sum;
	}

	public void setMergedValue(String mergedValue) {
		this.mergedValue = mergedValue;
	}

	public void setQuantity_sum(double quantity_sum) {
		this.quantity_sum = quantity_sum;
	}

	public void setTotal_materials_sum(double total_materials_sum) {
		this.total_materials_sum = total_materials_sum;
	}

	public void setTotal_recylable_sum(double total_recylable_sum) {
		this.total_recylable_sum = total_recylable_sum;
	}

	public void setTotal_bags_sum(double total_bags_sum) {
		this.total_bags_sum = total_bags_sum;
	}

	public void setTotal_glass_sum(double total_glass_sum) {
		this.total_glass_sum = total_glass_sum;
	}

	public void setTotal_cardboard_sum(double total_cardboard_sum) {
		this.total_cardboard_sum = total_cardboard_sum;
	}

	public void setTotal_waste_sum(double total_waste_sum) {
		this.total_waste_sum = total_waste_sum;
	}

	public void setTotal_incieration_sum(double total_incieration_sum) {
		this.total_incieration_sum = total_incieration_sum;
	}

	public void setTotal_autoclave_sum(double total_autoclave_sum) {
		this.total_autoclave_sum = total_autoclave_sum;
	}

public String getIsMobile() {
		return isMobile;
	}

	public void setIsMobile(String isMobile) {
		this.isMobile = isMobile;
	}

public String getQuantity_measure_rdf_outflow() {
		return quantity_measure_rdf_outflow;
	}

	public void setQuantity_measure_rdf_outflow(String quantity_measure_rdf_outflow) {
		this.quantity_measure_rdf_outflow = quantity_measure_rdf_outflow;
	}

	public String getQuantity_measure_compost_outflow() {
		return quantity_measure_compost_outflow;
	}

	public void setQuantity_measure_compost_outflow(String quantity_measure_compost_outflow) {
		this.quantity_measure_compost_outflow = quantity_measure_compost_outflow;
	}

	public String getQuantity_measure_recyclables_outflow() {
		return quantity_measure_recyclables_outflow;
	}

	public void setQuantity_measure_recyclables_outflow(String quantity_measure_recyclables_outflow) {
		this.quantity_measure_recyclables_outflow = quantity_measure_recyclables_outflow;
	}

	public String getQuantity_measure_inerts_outflow() {
		return quantity_measure_inerts_outflow;
	}

	public void setQuantity_measure_inerts_outflow(String quantity_measure_inerts_outflow) {
		this.quantity_measure_inerts_outflow = quantity_measure_inerts_outflow;
	}

private int startIndex,offset;

	public int getStartIndex() {
	return startIndex;
}

public int getOffset() {
	return offset;
}

public void setStartIndex(int startIndex) {
	this.startIndex = startIndex;
}

public String getTotal_plastic() {
	return total_plastic;
}

public void setTotal_plastic(String total_plastic) {
	this.total_plastic = total_plastic;
}

public void setOffset(int offset) {
	this.offset = offset;
}

	public String getDisposal_afrf() {
		return disposal_afrf;
	}

	public void setDisposal_afrf(String disposal_afrf) {
		this.disposal_afrf = disposal_afrf;
	}

	public String getDisposal_afrf_measure() {
		return disposal_afrf_measure;
	}

	public void setDisposal_afrf_measure(String disposal_afrf_measure) {
		this.disposal_afrf_measure = disposal_afrf_measure;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFrom_date() {
		return from_date;
	}

	public String getTo_date() {
		return to_date;
	}

	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}

	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}

	public String getSite_name() {
		return site_name;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public String getId() {
		return id;
	}

	public String getTotal_materials() {
		return total_materials;
	}

	public String getTotal_recylable() {
		return total_recylable;
	}

	public String getTotal_bags() {
		return total_bags;
	}

	public String getTotal_glass() {
		return total_glass;
	}

	public String getTotal_cardboard() {
		return total_cardboard;
	}

	public String getQuality_measure_materials() {
		return quality_measure_materials;
	}

	public String getQuality_measure_recylable() {
		return quality_measure_recylable;
	}

	public String getQuality_measure_plastics() {
		return quality_measure_plastics;
	}

	public String getQuality_measure_bags() {
		return quality_measure_bags;
	}

	public String getQuality_measure_glass() {
		return quality_measure_glass;
	}

	public String getQuality_measure_cardboard() {
		return quality_measure_cardboard;
	}

	public String getSite() {
		return site;
	}

	public String getComments() {
		return comments;
	}

	public String getDate() {
		return date;
	}

	public String getCreated_by() {
		return created_by;
	}

	public String getModified_date() {
		return modified_date;
	}

	public String getCreated_date() {
		return created_date;
	}

	public String getModified_by() {
		return modified_by;
	}

	public String getTotal_waste() {
		return total_waste;
	}

	public String getTotal_incieration() {
		return total_incieration;
	}

	public String getTotal_autoclave() {
		return total_autoclave;
	}

	public String getQuantity_measure_waste() {
		return quantity_measure_waste;
	}

	public String getQuantity_measure_incieration() {
		return quantity_measure_incieration;
	}

	public String getQuantity_measure_autoclave() {
		return quantity_measure_autoclave;
	}

	public String getSbu_code() {
		return sbu_code;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getQuantity_measure() {
		return quantity_measure;
	}

	public String getRole() {
		return role;
	}

	public String getDepartment_code() {
		return department_code;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public String getRdf() {
		return rdf;
	}

	public String getCompost() {
		return compost;
	}

	public String getRecyclables() {
		return recyclables;
	}

	public String getInserts() {
		return inserts;
	}

	public String getVendor_name_rdf() {
		return vendor_name_rdf;
	}

	public String getVendor_name_compost() {
		return vendor_name_compost;
	}

	public String getVendor_name_recyclables() {
		return vendor_name_recyclables;
	}

	public String getVendor_name_inserts() {
		return vendor_name_inserts;
	}

	public String getVendor_name_rdf_outflow() {
		return vendor_name_rdf_outflow;
	}

	public String getVendor_name_compost_outflow() {
		return vendor_name_compost_outflow;
	}

	public String getVendor_name_recylables_outflow() {
		return vendor_name_recylables_outflow;
	}

	public String getVendor_name_inserts_outflow() {
		return vendor_name_inserts_outflow;
	}

	public String getTotal_rdf() {
		return total_rdf;
	}

	public String getTotal_compost() {
		return total_compost;
	}

	public String getTotal_inerts() {
		return total_inerts;
	}

	public String getTotal_recylables() {
		return total_recylables;
	}

	public String getQuantity_measure_rdf() {
		return quantity_measure_rdf;
	}

	public String getQuantity_measure_compost() {
		return quantity_measure_compost;
	}

	public String getQuantity_measure_inerts() {
		return quantity_measure_inerts;
	}

	public String getQuantity_measure_recylabels() {
		return quantity_measure_recylabels;
	}

	public String getDisposal_total_waste() {
		return disposal_total_waste;
	}

	public String getDisposal_dlf() {
		return disposal_dlf;
	}

	public String getDisposal_lat() {
		return disposal_lat;
	}

	public String getDisposal_incineration() {
		return disposal_incineration;
	}

	public String getDisposal_total_waste_measure() {
		return disposal_total_waste_measure;
	}

	public String getDisposal_dlf_measure() {
		return disposal_dlf_measure;
	}

	public String getDisposal_lat_measure() {
		return disposal_lat_measure;
	}

	public String getDisposal_incineration_measure() {
		return disposal_incineration_measure;
	}

	public String getStock_total_waste() {
		return stock_total_waste;
	}

	public String getStock_dlf() {
		return stock_dlf;
	}

	public String getStock_lat() {
		return stock_lat;
	}

	public String getStock_incineration() {
		return stock_incineration;
	}

	public String getStock_afrf() {
		return stock_afrf;
	}

	public String getStock_total_waste_measure() {
		return stock_total_waste_measure;
	}

	public String getStock_dlf_measure() {
		return stock_dlf_measure;
	}

	public String getStock_lat_measure() {
		return stock_lat_measure;
	}

	public String getStock_incineration_measure() {
		return stock_incineration_measure;
	}

	public String getStock_afrf_measure() {
		return stock_afrf_measure;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTotal_materials(String total_materials) {
		this.total_materials = total_materials;
	}

	public void setTotal_recylable(String total_recylable) {
		this.total_recylable = total_recylable;
	}

	public void setTotal_bags(String total_bags) {
		this.total_bags = total_bags;
	}

	public void setTotal_glass(String total_glass) {
		this.total_glass = total_glass;
	}

	public void setTotal_cardboard(String total_cardboard) {
		this.total_cardboard = total_cardboard;
	}

	public void setQuality_measure_materials(String quality_measure_materials) {
		this.quality_measure_materials = quality_measure_materials;
	}

	public void setQuality_measure_recylable(String quality_measure_recylable) {
		this.quality_measure_recylable = quality_measure_recylable;
	}

	public void setQuality_measure_plastics(String quality_measure_plastics) {
		this.quality_measure_plastics = quality_measure_plastics;
	}

	public void setQuality_measure_bags(String quality_measure_bags) {
		this.quality_measure_bags = quality_measure_bags;
	}

	public void setQuality_measure_glass(String quality_measure_glass) {
		this.quality_measure_glass = quality_measure_glass;
	}

	public void setQuality_measure_cardboard(String quality_measure_cardboard) {
		this.quality_measure_cardboard = quality_measure_cardboard;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public void setModified_date(String modified_date) {
		this.modified_date = modified_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public void setTotal_waste(String total_waste) {
		this.total_waste = total_waste;
	}

	public void setTotal_incieration(String total_incieration) {
		this.total_incieration = total_incieration;
	}

	public void setTotal_autoclave(String total_autoclave) {
		this.total_autoclave = total_autoclave;
	}

	public void setQuantity_measure_waste(String quantity_measure_waste) {
		this.quantity_measure_waste = quantity_measure_waste;
	}

	public void setQuantity_measure_incieration(String quantity_measure_incieration) {
		this.quantity_measure_incieration = quantity_measure_incieration;
	}

	public void setQuantity_measure_autoclave(String quantity_measure_autoclave) {
		this.quantity_measure_autoclave = quantity_measure_autoclave;
	}

	public void setSbu_code(String sbu_code) {
		this.sbu_code = sbu_code;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public void setQuantity_measure(String quantity_measure) {
		this.quantity_measure = quantity_measure;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setDepartment_code(String department_code) {
		this.department_code = department_code;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public void setRdf(String rdf) {
		this.rdf = rdf;
	}

	public void setCompost(String compost) {
		this.compost = compost;
	}

	public void setRecyclables(String recyclables) {
		this.recyclables = recyclables;
	}

	public void setInserts(String inserts) {
		this.inserts = inserts;
	}

	public void setVendor_name_rdf(String vendor_name_rdf) {
		this.vendor_name_rdf = vendor_name_rdf;
	}

	public void setVendor_name_compost(String vendor_name_compost) {
		this.vendor_name_compost = vendor_name_compost;
	}

	public void setVendor_name_recyclables(String vendor_name_recyclables) {
		this.vendor_name_recyclables = vendor_name_recyclables;
	}

	public void setVendor_name_inserts(String vendor_name_inserts) {
		this.vendor_name_inserts = vendor_name_inserts;
	}

	public void setVendor_name_rdf_outflow(String vendor_name_rdf_outflow) {
		this.vendor_name_rdf_outflow = vendor_name_rdf_outflow;
	}

	public void setVendor_name_compost_outflow(String vendor_name_compost_outflow) {
		this.vendor_name_compost_outflow = vendor_name_compost_outflow;
	}

	public void setVendor_name_recylables_outflow(String vendor_name_recylables_outflow) {
		this.vendor_name_recylables_outflow = vendor_name_recylables_outflow;
	}

	public void setVendor_name_inserts_outflow(String vendor_name_inserts_outflow) {
		this.vendor_name_inserts_outflow = vendor_name_inserts_outflow;
	}

	public void setTotal_rdf(String total_rdf) {
		this.total_rdf = total_rdf;
	}

	public void setTotal_compost(String total_compost) {
		this.total_compost = total_compost;
	}

	public void setTotal_inerts(String total_inerts) {
		this.total_inerts = total_inerts;
	}

	public void setTotal_recylables(String total_recylables) {
		this.total_recylables = total_recylables;
	}

	public void setQuantity_measure_rdf(String quantity_measure_rdf) {
		this.quantity_measure_rdf = quantity_measure_rdf;
	}

	public void setQuantity_measure_compost(String quantity_measure_compost) {
		this.quantity_measure_compost = quantity_measure_compost;
	}

	public void setQuantity_measure_inerts(String quantity_measure_inerts) {
		this.quantity_measure_inerts = quantity_measure_inerts;
	}

	public void setQuantity_measure_recylabels(String quantity_measure_recylabels) {
		this.quantity_measure_recylabels = quantity_measure_recylabels;
	}

	public void setDisposal_total_waste(String disposal_total_waste) {
		this.disposal_total_waste = disposal_total_waste;
	}

	public void setDisposal_dlf(String disposal_dlf) {
		this.disposal_dlf = disposal_dlf;
	}

	public void setDisposal_lat(String disposal_lat) {
		this.disposal_lat = disposal_lat;
	}

	public void setDisposal_incineration(String disposal_incineration) {
		this.disposal_incineration = disposal_incineration;
	}

	public void setDisposal_total_waste_measure(String disposal_total_waste_measure) {
		this.disposal_total_waste_measure = disposal_total_waste_measure;
	}

	public void setDisposal_dlf_measure(String disposal_dlf_measure) {
		this.disposal_dlf_measure = disposal_dlf_measure;
	}

	public void setDisposal_lat_measure(String disposal_lat_measure) {
		this.disposal_lat_measure = disposal_lat_measure;
	}

	public void setDisposal_incineration_measure(String disposal_incineration_measure) {
		this.disposal_incineration_measure = disposal_incineration_measure;
	}

	public void setStock_total_waste(String stock_total_waste) {
		this.stock_total_waste = stock_total_waste;
	}

	public void setStock_dlf(String stock_dlf) {
		this.stock_dlf = stock_dlf;
	}

	public void setStock_lat(String stock_lat) {
		this.stock_lat = stock_lat;
	}

	public void setStock_incineration(String stock_incineration) {
		this.stock_incineration = stock_incineration;
	}

	public void setStock_afrf(String stock_afrf) {
		this.stock_afrf = stock_afrf;
	}

	public void setStock_total_waste_measure(String stock_total_waste_measure) {
		this.stock_total_waste_measure = stock_total_waste_measure;
	}

	public void setStock_dlf_measure(String stock_dlf_measure) {
		this.stock_dlf_measure = stock_dlf_measure;
	}

	public void setStock_lat_measure(String stock_lat_measure) {
		this.stock_lat_measure = stock_lat_measure;
	}

	public void setStock_incineration_measure(String stock_incineration_measure) {
		this.stock_incineration_measure = stock_incineration_measure;
	}

	public void setStock_afrf_measure(String stock_afrf_measure) {
		this.stock_afrf_measure = stock_afrf_measure;
	}
	
	
	
}
