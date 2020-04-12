package com.UdemyAnnotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortune = {"Today is monday","Today is tuesday","Today is wednesday","Today is thusday"};
	private Random random = new Random();
	
	@Override
	public String getDailyFortune() {
		int index = random.nextInt(fortune.length);
		String fortuneStr = fortune[index];
		return fortuneStr;
	}

}
