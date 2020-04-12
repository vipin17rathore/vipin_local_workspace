package spring.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Employee {

	private String name;
	private int id;
	private Address address;
	private List<String>answer;
	private Map<String,String>map;
	
	
	
	public Employee(int id, String name,Address address,List<String>answer,Map<String,String>map) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;
	    this.answer=answer;
	    this.map=map;
	} 
	

	void show() {
		System.out.println("id"+id+"name"+name);
		System.out.println("address"+address);
		Iterator<String>itr = answer.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println("key and value"+m);
		}
	}
}
