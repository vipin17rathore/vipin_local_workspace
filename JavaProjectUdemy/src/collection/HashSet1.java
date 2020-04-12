package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String>hs = new HashSet<String>();
		hs.add("vipin");
		hs.add("rauhl");
		hs.add("abhishek");
		hs.add("vipin");
		
		
		Iterator<String>itr= hs.iterator();
		while(itr.hasNext()){
			System.out.println("val"+itr.next());   //not print the duplicate value
		}
		
			
	}	

}
