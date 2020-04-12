package collection;

import collection.InnerClass.B;

public class MainInnerClass {

	public static void main(String[] args) {
		InnerClass a = new InnerClass();
		a.nameA=00;
		
		InnerClass.B i = new InnerClass.B();
		i.nameB=4;
	}

}
