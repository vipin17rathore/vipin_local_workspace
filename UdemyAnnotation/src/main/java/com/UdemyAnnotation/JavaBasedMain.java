package com.UdemyAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaBasedMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Coach coach = context.getBean("cricketComponent",Coach.class);

	    System.out.println(coach.getDailyWorkOut());	
		System.out.println(coach.getDailyFortune());
		context.close();
	}

}
