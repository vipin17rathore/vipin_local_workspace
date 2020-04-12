package com.home;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main1 {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		Laptop l = new Laptop();
		l.setId(1);
		l.setSerialNo(3434354);
		
		e.setEmpID(100);
		e.setName("HP");
		e.setLaptop(l);
		
		Configuration cf = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(l);
		session.save(e);
		
		tx.commit();
		
	}

}
