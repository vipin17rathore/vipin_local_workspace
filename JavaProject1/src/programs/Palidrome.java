package programs;

public class Palidrome {

	public static void main(String[] args) {
		int n= 120;
		int temp=n;
		int r;
		int sum=0;
		
		while(n>0) {
			r= n%10;
			sum = (sum*10)+r;
			n = n/10;
		}
		if(temp==sum) {
			System.out.println("Palidrome");
		}
		else
			System.out.println("Not");
	}

}
