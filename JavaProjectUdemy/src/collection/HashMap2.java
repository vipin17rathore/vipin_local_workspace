package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap2 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(1, "abc");
		hm.put(3, "abce");
		hm.put(2, "abcd");
		hm.put(6, "abcd");
		
		//System.out.println(hm.get(2));
		
		for(Entry<Integer, String> m : hm.entrySet()){
			System.out.println("out:"+m.getKey());
		}
		
	}

}
