package com.tcs.SpringByNavin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {/*
    	Vehicle obj = new Bike();   by java interface
    	obj.drive();
        System.out.println( "Hello World!" );*/
    	
    	// by spring dependency in jection
    	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	/*Vehicle obj = (Vehicle) ac.getBean("bike");
    	obj.drive();*/
    
    	Tyre obj = (Tyre) ac.getBean("tyre");
    	System.out.println(obj);
    
    }
}
