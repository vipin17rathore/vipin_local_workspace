package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
	
		LinkedList<String>ar =  new LinkedList<String>();
		ar.add("rahul");
		ar.add("Vipin");
		ar.add("abhishek");
		
		System.out.println(ar.get(2));
		for(String v: ar){
			System.out.println(v );
		}
/*		Iterator<String>itr= ar.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
*/	}

}