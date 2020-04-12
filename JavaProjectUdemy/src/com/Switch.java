package com;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num){
		 case 1: System.out.println("1");
		break; 
		 case 2: System.out.println("2");
		break;
		 default:
			 System.out.println("default val");
		}
	}

}
