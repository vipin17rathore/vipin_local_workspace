package com.crud;

public class Employee {

	private int Emid;
	private String name;
	private float salary;
	private String designation;
	public int getId() {
		return Emid;
	}
	public void setId(int Emid) {
		this.Emid = Emid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
