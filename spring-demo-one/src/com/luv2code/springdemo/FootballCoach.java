package com.luv2code.springdemo;

public class FootballCoach implements Coach {

private FortuneService fortuneService;
	
	public FootballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Hop the ball 20 times in a row";
	}

	@Override
	public String getDailyFortune() {
		return "You have it! " + fortuneService.getFortune();
	}
	
	public String getRandomFortune() {
		return "Your luck is: " + fortuneService.randomFortune();
	}

}
