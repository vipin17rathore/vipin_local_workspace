package java8;

interface B{
	
	void run(/*int a , int b*/);
}
public class Lambda1 {

	public static void main(String[] args) {
		B b = ()-> {
			System.out.println("inside run");
		};
		b.run(/*10, 11*/);
	}

}
