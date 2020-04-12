package com;

import java.util.Scanner;

public class Inputs_2_scanner {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String name = "Vipin";
		int age = 25;
		double salary = 25000.35;
		char gender = 'M';
		float per = 3f;
		
		Overloading ov = new Overloading();
		int a = ov.global;
		System.out.println(a);
		

		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("salary:" + salary);
		System.out.println("gender:" + gender);
		System.out.println("per:" + per);
		

	}

}
