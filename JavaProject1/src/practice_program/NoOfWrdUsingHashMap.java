package practice_program;

import java.util.HashMap;

public class NoOfWrdUsingHashMap {

	public static void main(String[] args) {
		String str = "My Name Name is vipin vipin";
		String [] ar = str.split(" ");
		HashMap<String, Integer>hm = new HashMap<>();
		for(int i =0;i<ar.length;i++) {
		
			if(hm.containsKey(ar[i])) {
				int count = hm.get(ar[i]);
				hm.put(ar[i],count+1 );
			}
			else {
				hm.put(ar[i],1);
			}
			
		
		}
		System.out.println(hm);
	}

}
