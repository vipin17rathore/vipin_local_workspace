package com.eng;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {


		Laptop lp = new Laptop();
		lp.setlId(11);
		lp.setlName("Lenovo");
		
		Engineer eng = new Engineer();
		eng.setRollNo(101);
		eng.setName("viipn");
		eng.setMarks(100);
		eng.getLaptop().add(lp);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Engineer.class).addAnnotatedClass(Laptop.class);
		@SuppressWarnings("deprecation")
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		//Engineer eng1 = (Engineer)session.get(Engineer.class, 101);
	//	Laptop lp2 = (Laptop)session.get(Laptop.class, 101);
		Transaction t = session.beginTransaction();
		session.save(lp);
		session.save(eng);
		t.commit();
		session.close();
		
		
		Session session1 = sf.openSession();
		Engineer eng1 = (Engineer)session1.get(Engineer.class, 101);
		Engineer eng2 = (Engineer)session1.get(Engineer.class, 102);
		Transaction tr1 = session1.beginTransaction();
		tr1.commit();
	}

}
