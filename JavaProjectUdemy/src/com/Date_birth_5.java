package com;

import java.util.Calendar;
import java.util.Scanner;

public class Date_birth_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter birth year");
		int year = sc.nextInt();
		int curYear = Calendar.getInstance().get(Calendar.YEAR);
		int age = curYear-year;
		System.out.println("age:"+age);
		//int age= 
	}

}
