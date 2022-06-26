package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach() {
		super();
	}

	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k ";
	}

	@Override
	public String getDailyFortune() {
		return "You can do it!" + fortuneService.getFortune();
	}
	
	public void doMyStartStuff() {
		System.out.println("TrackCoach: initializing");
	}
	public void doMyDestroyStuff() {
		System.out.println("TrackCoach: destroying");
	}
	

}
