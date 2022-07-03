package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HomeCoach implements Coach {
	private FortuneService fortuneService;
	

	public HomeCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Stay home as long as you can";
	}

	@Override
	public String getDailyFortune() throws FileNotFoundException, IOException {
	
		return fortuneService.getFortune();
	}

}
