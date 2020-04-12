package com.tcs.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		//Samsung smg = new Samsung();
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung smg = ac.getBean(Samsung.class);
		smg.config();
	}

}
