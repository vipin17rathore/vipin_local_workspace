package object;

public class EnhancedForLoop {

	public static void main(String ... args) {
		int [] a = {10,11,34,55};
		 
		for (int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		//enahnaced for loopp
		for(int j : a){
			System.out.println("enhanced value"+j);
		}
 	}

}
