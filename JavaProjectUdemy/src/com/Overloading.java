package com;


public class Overloading {
	int global = 10;  //global variable
	
	int sum(int i, int j) {
		int access = global;
		return i + j;
	}

	int sum(int i, int j, int k) {
		return i + j + k;
	}

	public static void main(String[] args) {

		int out = new Overloading().sum(10, 11);
		System.out.println(out);

		int outP = new Overloading().sum(10, 10, 10);
		System.out.println(outP);
	}
}
