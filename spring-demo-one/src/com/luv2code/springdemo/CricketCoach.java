package com.luv2code.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	public CricketCoach() {
		//System.out.println("Cricket Coach: Inside no-args constructor");
	}
	

	public void setFortuneService(FortuneService fortuneService) {
		//System.out.println("Cricket Coach:Inside a setter method");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return "Here is your Cricket Coach speaking: "
		+ fortuneService.getFortune() ;
	}

}
