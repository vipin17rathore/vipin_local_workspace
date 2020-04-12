package programs;

public class Factorial {

	public static void main(String[] args) {
	
	 int n=5;
     int tot=1;
	 
	 for(int i=n;i>=1;i--) {
		 tot = tot * i;
	 }
		System.out.println("Total::"+tot);
	}
}
