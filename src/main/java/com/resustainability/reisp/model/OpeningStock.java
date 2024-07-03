package com.resustainability.reisp.model;

public class OpeningStock {

	private String sbu_code
		      ,opening_stock_total_waste
		    	      ,opening_stock_dlf
		    	      ,opening_stock_lat
		    	      ,opening_stock_incineration
		    	      ,opening_stock_afrf
		    	      ,site
		    	      ,date;

	public String getSbu_code() {
		return sbu_code;
	}

	public void setSbu_code(String sbu_code) {
		this.sbu_code = sbu_code;
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

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
