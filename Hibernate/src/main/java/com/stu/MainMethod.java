package com.stu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod {

	public static void main(String[] args) {
		
		TeacherName th = new TeacherName();
		th.setName("abc");
		th.setRole("tech");
				
		
		StudentName stName=  new StudentName();
		stName.setFname("vipin");
		stName.setMname("kumar");
		stName.setLname("rathore");
		
		Student st = new Student();
		
		st.setRollNO(109);
		st.setSection("CSE");  // used to insert the data into database
		st.setName(stName);
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(TeacherName.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(st);
		session.save(th);
		tr.commit();
		
		Student st1 = (Student) session.get(Student.class,109);
		System.out.println("student::"+st1);
		
	}

}
