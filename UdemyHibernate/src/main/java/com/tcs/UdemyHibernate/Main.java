package com.tcs.UdemyHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(Student.class)
							.buildSessionFactory();
		
		///insert
		Session session = sf.getCurrentSession();
		Student st = new Student("Abhishek","hatwar");
		session.beginTransaction();
		session.save(st);
		session.getTransaction().commit();
		
	    //update
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		session2.createQuery("update Student set first_name='Rahul' where first_name='vipin'").executeUpdate();
		//session2.createQuery("delete from Student where id=7").executeUpdate();
		session2.getTransaction().commit();
		
		//get
		Session session1 = sf.getCurrentSession();
		session1.beginTransaction();
		Student st1 = session1.get(Student.class,st.getId());
		List<Student>list = session1.createQuery("from Student").list();
		System.out.println(list);
		session1.save(st1);
		session1.getTransaction().commit();
		System.out.println("Done...!!!"+st1);

		Session session3 = sf.getCurrentSession();
		session3.beginTransaction();
		Student st2 = session3.get(Student.class,16);
		session3.delete(st2);
		session3.save(st2);
		session3.getTransaction().commit();
		
		
		sf.close();
		session1.close();
		session2.close();
		session3.close();
		session.close();
		

	}

}
