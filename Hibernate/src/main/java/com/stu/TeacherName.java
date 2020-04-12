package com.stu;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TeacherName {
	@Id
	private String name;
	private String role;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
