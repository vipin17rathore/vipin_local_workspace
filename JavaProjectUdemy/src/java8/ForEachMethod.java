package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachMethod {

	public static void main(String[] args) {
		List<Integer>ar = Arrays.asList(1,2,3,4);
		List<String>ar1 = new ArrayList();
		
		ar1.add("vip");
		ar1.add("nit");
		ar1.add("prv");
		/*for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}*/
	
		/*for(Integer ab : ar){
			System.out.println(ab);
		}*/
	
		ar1.forEach(i ->System.out.println(i));  //java 1.8 for Each method
		
		
		Map<Integer ,String>map = new HashMap<>();
		map.put(3, "vippin");
		map.put(4, "abhi");
		map.put(5, "subham");

		map.forEach((k,v)->System.out.println("k"+k));
		
	}

}
