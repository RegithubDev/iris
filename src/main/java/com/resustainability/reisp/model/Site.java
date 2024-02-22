package com.resustainability.reisp.model;

public class Site {

private String id,state,city,sbu_code,site_name,created_by,latlon,modified_date,created_date,modified_by;

public String getLatlon() {
	return latlon;
}

public void setLatlon(String latlon) {
	this.latlon = latlon;
}

public String getId() {
	return id;
}

public String getState() {
	return state;
}

public String getCity() {
	return city;
}

public String getSbu_code() {
	return sbu_code;
}

public String getSite_name() {
	return site_name;
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

public void setId(String id) {
	this.id = id;
}

public void setState(String state) {
	this.state = state;
}

public void setCity(String city) {
	this.city = city;
}

public void setSbu_code(String sbu_code) {
	this.sbu_code = sbu_code;
}

public void setSite_name(String site_name) {
	this.site_name = site_name;
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


}
