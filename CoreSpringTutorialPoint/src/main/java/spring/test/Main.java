package spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("myCoach",Coach.class);
		Coach coach1 = context.getBean("myCoach",Coach.class);
		
		System.out.println(coach==coach1);
		System.out.println(coach.getDailyFortue());
		System.out.println(coach.dailyWorkOut());
		
		context.close();
	}

}
