package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Kick the ball up 25 times";
	}

	@Override
	public String getDailyFortune() throws FileNotFoundException, IOException {
	
		return null;
	}

}
