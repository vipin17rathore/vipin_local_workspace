package com.study.dao;

import java.util.ArrayList;
import java.util.Date;
import javax.validation.constraints.Size;

public class Student {
	@Size(min=2,max=10,message="Date range between {min} and {max}")
	private String name;
	@Size(min=2,max=10,message="Date range between {min} and {max}")
	private String stream;
	private long mobile;
	private Date dob;
	private ArrayList <String>skills;
	private Address stuAddress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public ArrayList<String> getSkills() {
		return skills;
	}
	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}
	public Address getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(Address stuAddress) {
		this.stuAddress = stuAddress;
	}
	
	
}
