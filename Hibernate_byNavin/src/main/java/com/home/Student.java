package com.home;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	private int id;
	@Column(name="name")
	private String name;
	private String PAN;
	/*private Address address;
	*/
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPAN() {
		return PAN;
	}



	public void setPAN(String pAN) {
		PAN = pAN;
	}



/*	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}

*/

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", PAN=" + PAN + "]";
	}
	
	
	
	
}
