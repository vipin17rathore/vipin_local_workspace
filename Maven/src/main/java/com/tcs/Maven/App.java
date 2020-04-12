package com.tcs.Maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       // Vehicle v = new Bike();
       // v.drive();
    	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	Tyre obj = (Tyre) ac.getBean("tyre");
    	//obj.getBrand();
    	System.out.println(obj);
    }
}
