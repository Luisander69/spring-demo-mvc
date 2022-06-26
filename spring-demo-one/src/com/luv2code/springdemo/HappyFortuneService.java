package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	private String[] fortunes = {"You will be rich","You willmeet your destiny","You will get your dreamjob"};
	

	@Override
	public String getFortune() {
		
		return "Today is your lucky day";
	}

	@Override
	public String randomFortune() {
		
		return fortunes[new Random().nextInt(3)];
	}

}
