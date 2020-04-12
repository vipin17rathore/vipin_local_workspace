package com.udemy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		System.out.println(coach.getDailyStepsCount());
	}

}
