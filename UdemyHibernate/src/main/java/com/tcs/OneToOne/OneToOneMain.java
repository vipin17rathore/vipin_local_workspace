package com.tcs.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tcs.UdemyHibernate.Student;

public class OneToOneMain {
	
		public static void main(String args[]) {
		
			SessionFactory sf = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();

				Session session = sf.getCurrentSession();
				Instructor inst = new  Instructor("vipin", "ragmailthore", "v@.com");
				InstructorDetail instDeatil = new InstructorDetail("tvf.com", "Cricket");
				inst.setInstructorDetail(instDeatil);
				session.beginTransaction();
				session.save(inst);
				session.getTransaction().commit();
				
				Session session1 = sf.getCurrentSession();
				session1.beginTransaction();
				InstructorDetail ind = session1.get(InstructorDetail.class,27);
				session1.beginTransaction();
				session1.save(ind);
				session1.getTransaction().commit();
				System.out.println("ind"+ind);
				
				
				//deleting the instructor
				/*Session session1 = sf.getCurrentSession();
				session1.beginTransaction();
				Instructor inst1 = session1.get(Instructor.class,24);
				session1.delete(inst1);
				session1.getTransaction().commit();
			*/
						
		}
			}