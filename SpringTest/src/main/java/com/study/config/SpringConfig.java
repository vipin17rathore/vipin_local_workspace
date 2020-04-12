package com.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({ "com.study.SpringTest" })
public class SpringConfig {
@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver vw = new InternalResourceViewResolver();
		vw.setPrefix("/");
		vw.setSuffix(".jsp");
		return vw;
	}
	
}
