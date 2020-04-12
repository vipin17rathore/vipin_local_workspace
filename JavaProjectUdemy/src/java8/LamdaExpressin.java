package java8;

interface A{
	void show(int a);
}

public class LamdaExpressin {

	public static void main(String[] args) {
		A obj;
		obj = (i)-> {
				 System.out.println("inside show");
			 };
		obj.show(20); 
		
	}

}
