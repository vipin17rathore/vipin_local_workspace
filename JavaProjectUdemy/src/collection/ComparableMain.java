package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {
		
		List<Student1> ar = new ArrayList<Student1>();
		ar.add(new Student1(10, 55)) ;
		ar.add(new Student1(10, 67)) ;
		ar.add(new Student1(10, 96)) ;
		
	//	Collections.sort(ar);
	}
}
	
	class Student1{
		int rollNo;
		int marks;
		
		public Student1(int rollNo, int marks) {
			super();
			this.rollNo = rollNo;
			this.marks = marks;
		}
		
		@Override
		public String toString() {
			return "Student1 [rollNo=" + rollNo + ", marks=" + marks + "]";
		}

		public int compareTo(Student1 o) {
			
			return this.marks>o.marks?-1:this.marks<o.marks?1:0;
		}
		
		
		
	}
