package object;

public class Student_inheritance extends Colleger_Inheritance {
	
	private String student_subject;
	private int roll_no;
	
	public String getStudent_subject() {
		return student_subject;
	}
	public void setStudent_subject(String student_subject) {
		this.student_subject = student_subject;
	}	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	
	public void owner(){
		super.run();
	}
		
	public void run(){
		//method overriding
		System.out.println("inside student class");
		
	}
	
}
