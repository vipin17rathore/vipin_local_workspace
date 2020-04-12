package comparable_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.System;

class Student{
	int num;
	String name;
	
	Student(int num){
		this.num= num;
	}
	
}

public class Main {

	public static final void main(String[] args) {
		
		Student st = new Student(10);
	//	Student st1 = new Student(10);
		Student st1 = st;
		
		System.out.println(st==st1);
		
		/*ArrayList<Comparable_Class>ar = new ArrayList<>();
		ar.add(new Comparable_Class(19, "vipin"));
		ar.add(new Comparable_Class(17, "sahil"));
		ar.add(new Comparable_Class(18, "rahul"));
		
		Collections.sort(ar);
		for(Comparable_Class ab : ar) {
			System.out.println(ab.age);
		}
	
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	*/}

}
