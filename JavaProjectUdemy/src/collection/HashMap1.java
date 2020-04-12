package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "abhishek");
		hm.put(2, "rahul");
		hm.put(3, "vippipn");
		
		for(Map.Entry m : hm.entrySet()){
			System.out.println("key:"+m.getKey()+" value:"+m.getValue());
		}
		
		System.out.println(hm.size());
		hm.put(4, "sharma");
		hm.remove(4);
		
		System.out.println(hm.size());
	}

}
