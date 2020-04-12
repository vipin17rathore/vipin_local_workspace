package com.home;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		/*  Save obejct into database
		 * Random ran = new Random(9999);
		int id = ran.nextInt();
		Student st = new Student(2222,"Vipin","BZXPR54");
		
		Configuration cf = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		tx.commit();*/
		
		/* get data from database
		Student st = new Student();
		Configuration cf = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		st = (Student) session.get(Student.class, 10);
		tx.commit();
		
		System.out.println(st);  */
		
		/*save the data using embdable*/
		
		
		
		Configuration cf = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		
		/*for(int i=0;i<10;i++) {
			Student st = new Student();
			st.setId(i);
			st.setName("Vipin");
			st.setPAN("PAN");
			session.save(st);
			
		}
		*/
		Transaction tx = session.beginTransaction();
		Query q = session.createQuery("from Student where name='Vipin'");
		List<Student> li = q.list();
		
		for(Student a : li) {
		System.out.println(a);
		}
		
		
		tx.commit();
		
	}

}  
 