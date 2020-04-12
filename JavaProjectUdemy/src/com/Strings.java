package com;

public class Strings {

	public static void main(String[] args) {
		String name = "I am an software engineer";
		System.out.println("first char:"+name.charAt(0));
		System.out.println("first char:"+name.charAt(name.length()-1));
		System.out.println("first char:"+name.charAt(0));
		
		for (int i=0;i<=name.length()-1;i++){
			System.out.print(name.charAt(i));
		}
		
		String[] splitdata = name.split(" ");
		for (int j=0;j<=splitdata.length-1;j++){
			System.out.println(splitdata[j]);
		}
	}

}
