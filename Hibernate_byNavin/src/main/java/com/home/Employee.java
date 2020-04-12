package com.home;

import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Employee {
	
	@Id
	private int empID;
	private String name;
	@OneToOne
	private Laptop laptop;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
}
