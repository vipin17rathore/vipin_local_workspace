package com.study.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"thName","thId","thMobileNo","thAddress"})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"thId"})

public class Teacher {
	@JsonProperty("th_name")
	private String thName;
	private int thId;
	private long thMobileNo;
	private String thAddress;
	public String getThName() {
		return thName;
	}
	public void setThName(String thName) {
		this.thName = thName;
	}
	public int getThId() {
		return thId;
	}
	public void setThId(int thId) {
		this.thId = thId;
	}
	public long getThMobileNo() {
		return thMobileNo;
	}
	public void setThMobileNo(long thMobileNo) {
		this.thMobileNo = thMobileNo;
	}
	public String getThAddress() {
		return thAddress;
	}
	public void setThAddress(String thAddress) {
		this.thAddress = thAddress;
	}
	
}
