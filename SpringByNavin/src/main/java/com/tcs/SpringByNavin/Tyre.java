package com.tcs.SpringByNavin;

public class Tyre {
	private String brand;
	private int size;
	
/*	public Tyre(String brand) { //set value using constructor injection
		super();
		this.brand = brand;
	}
*/
	
	public String getBrand() {
		return brand;
	}

	public Tyre(String brand, int size) {
	super();
	this.brand = brand;
	this.size = size;
}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + ", size=" + size + "]";
	}

	
	/*@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	*/
	
}
