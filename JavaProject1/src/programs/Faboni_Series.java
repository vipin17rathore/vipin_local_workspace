package programs;

public class Faboni_Series {
	
	public static void main(String args[]) {
	  int a=0;
	  int b=1;
	  int c=0;
	
	for (int i=0;i<=8;i++) {
		c=a+b;
		System.out.println(a);
		a=b;
		b=c;
		
	}
}
}