package com.UdemyAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Coach coach = context.getBean("cricketComponent",Coach.class);
		//	Coach coach1 = context.getBean("cricketComponent",Coach.class);
			
		//	System.out.println(coach);
	   //	System.out.println(coach1);
			
		    System.out.println(coach.getDailyWorkOut());	
			System.out.println(coach.getDailyFortune());
			context.close();
			
	}

}
