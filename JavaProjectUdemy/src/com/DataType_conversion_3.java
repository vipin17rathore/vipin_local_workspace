package com;

public class DataType_conversion_3 {

	public static void main(String[] args) {
		
		//convert dataType to String 
		int age = 25;
		double salary = 25000.67;
		boolean res = true;
		String name ="Vipin";
		
		String st_age = String.valueOf(age);
		String st_sal = String.valueOf(salary);
		String st_re = String.valueOf(res);
		
		// convert to integer
		
		int in_name = Integer.parseInt(name);
		int in_salary = (int) salary;

		// convert to double
		
		double du_name = Double.parseDouble(name);
		double du_salary = (double)  age;

		
	}

}
