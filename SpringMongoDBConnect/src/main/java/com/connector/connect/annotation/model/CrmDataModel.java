package com.connector.connect.annotation.model;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CustomerCRMCollectionTbl")
public class CrmDataModel {
	private String cust_name;

	private String[] added_date;

	@Id
	private String id;

	@Override
	public String toString() {
		return "MyPojo [cust_name=" + cust_name + ", added_date="
				+ Arrays.toString(added_date) + ", id=" + id
				+ ", process_status=" + process_status + ", cust_location="
				+ cust_location + ", RESULTSTW=" + Arrays.toString(RESULTSTW)
				+ ", cust_keywords=" + cust_keywords + ", RESULTSLI="
				+ Arrays.toString(RESULTSLI) + ", getRESULTSTW()="
				+ Arrays.toString(getRESULTSTW()) + ", getRESULTSLI()="
				+ Arrays.toString(getRESULTSLI()) + "]";
	}

	private String process_status;

	private String cust_location;

	private RESULTSTW[] RESULTSTW;

	private String cust_keywords;

	private RESULTSLI[] RESULTSLI;

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String[] getAdded_date() {
		return added_date;
	}

	public void setAdded_date(String[] added_date) {
		this.added_date = added_date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProcess_status() {
		return process_status;
	}

	public void setProcess_status(String process_status) {
		this.process_status = process_status;
	}

	public String getCust_location() {
		return cust_location;
	}

	public void setCust_location(String cust_location) {
		this.cust_location = cust_location;
	}

	public RESULTSTW[] getRESULTSTW() {
		return RESULTSTW;
	}

	public void setRESULTSTW(RESULTSTW[] RESULTSTW) {
		this.RESULTSTW = RESULTSTW;
	}

	public String getCust_keywords() {
		return cust_keywords;
	}

	public void setCust_keywords(String cust_keywords) {
		this.cust_keywords = cust_keywords;
	}

	public RESULTSLI[] getRESULTSLI() {
		return RESULTSLI;
	}

	public void setRESULTSLI(RESULTSLI[] RESULTSLI) {
		this.RESULTSLI = RESULTSLI;
	}
}