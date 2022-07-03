package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortune")
	private FortuneService fortuneService;
	public TennisCoach() {
		//System.out.println(">>> Inside the default constructor");
	}
	
	/*
	 * public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println(">>> Inside the setter method"); this.fortuneService =
	 * fortuneService; }
	 */
	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() throws FileNotFoundException, IOException {

		return this.fortuneService.getFortune();
	}
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>>TennisCoach: inside of doMyStartupStuff()");
	}
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>>TennisCoach: inside of doMyCleanupStuff()");
	}

}
