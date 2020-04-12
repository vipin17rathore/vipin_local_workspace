package object;

public class Main_interface {

	public static void main(String args[]){
		
		Inf_Class in = new Inf_Class();
		int abc = in.sum(10, 10);
		System.out.println("abc :"+abc);
		
		String abcd = in.div(10, 10);
		System.out.println("abcd"+abcd);
	}
}
