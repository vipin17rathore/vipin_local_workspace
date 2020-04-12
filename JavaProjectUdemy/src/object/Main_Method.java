package object;

public class Main_Method extends Abstract1{

	static  {
		System.out.println("inside static");
	}
	public static void main(String[] args) {
		Constructor_1 cn = new Constructor_1("vipin",1000.90,"M");
		
		Student_inheritance st = new Student_inheritance();
		st.Id="50";
		st.setRoll_no(100);
		st.setStudent_subject("Maths");
		
		st.run();
		System.out.println("id:"+st.Id+" student subject:"+st.getStudent_subject());
		abc ab = new abc();
		ab.run();
		
		Count_Obj ob = new Count_Obj();
		ob.run();
		

		Count_Obj ob1 = new Count_Obj();
		ob1.run();
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}
	
}
class abc extends Abstract1{

	@Override
	void run() {
	System.out.println();	
	}}