package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicateValue {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("vipin");
		ar.add("abhis");
		ar.add("rahul");
		ar.add("vipin");
	
		Set<String>set =new HashSet<>();
		
		for(String s : ar){
			if(set.add(s)==false){
			System.out.println(s);
			}
		}
	}
}
