package com.UdemyAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cricketComponent")
/*@Scope("prototype") */
public class CricketCoach implements Coach{
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneservice;
	
	
	
	/*@Autowired
	public CricketCoach(FortuneService thefortuneservice){
		fortuneservice = thefortuneservice;
	}*/
	
	/*@Autowired   // setter injection
	public void setFortuneservice(FortuneService fortuneservice) {
		System.out.println("setFortuneservice");
		this.fortuneservice = fortuneservice;
	}
	*/
	
	/*
	@Autowired  // any method injection
	public void crazyStuff(FortuneService fortuneservice) {
		System.out.println("crazyStuff");
		this.fortuneservice = fortuneservice;
	}

*/
	@PostConstruct
	public void postConstructMethod() {
		System.out.println("post construct mehod");
	}

	@PreDestroy
	public void destroyMethod() {
		System.out.println("Destroy mehod");
	}
	
	@Override
	public String getDailyWorkOut() {
		return "daily 5K run";
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getDailyFortune();
	}
	
}
