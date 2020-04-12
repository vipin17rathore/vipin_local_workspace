package com.UdemyAnnotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return " have a nice day..!!!";
	}

}
