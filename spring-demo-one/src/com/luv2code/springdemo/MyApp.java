package com.luv2code.springdemo;

import java.util.Random;

public class MyApp {

	public static void main(String[] args) {
		//Coach theCoach = new TrackCoach();
		//System.out.println(theCoach.getDailyWorkout());
		
		//System.out.println(new Random().nextInt(3));

	}
	public static String getWorkout() {
		Coach theCoach = new TrackCoach();
		
		return theCoach.getDailyWorkout();
	}

}
