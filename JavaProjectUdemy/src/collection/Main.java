package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> ar = new ArrayList<Integer>();
		ar.add(238);
		ar.add(436);
		ar.add(339);
		ar.add(133);
		
		/*Comparator1 com = new Comparator1();
		Collections.sort(ar, com);
		*/
		/*		Comparator<Integer>ar1= new Comparator<Integer>() {

		public int compare(Integer o1, Integer o2) {
			if(o1%10>o2%10){
				return 1;
				
			}
			return -1;
		}
		};
		*/
		Comparator<Integer>ar1= (o1,o2)-> {
				if(o1% 10>o2%10){                 //lemda expression java 8
					return 1;
					
				}
				return -1;
			};
			
		Collections.sort(ar, ar1);
		for(Integer a : ar){
			System.out.println("val :"+a);
		}
		
	}

}
