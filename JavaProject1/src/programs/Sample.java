package programs;

class Parent{
	
	void draw () {
		
	}
}

class child extends Parent {
	void abc() throws Exception{
		
	}
	
}

public class Sample {
	public static void main(String args[]) {
	child c = new child();
	try {
		c.abc();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
