package spring.test;

public class Student {
	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void stInfo() {
		System.out.println("student name is::"+studentName);
	}
}
