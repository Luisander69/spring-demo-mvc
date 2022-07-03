package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeDemoApp {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(HomeConfig.class);
		HomeCoach hCoach = context.getBean("homeCoach", HomeCoach.class);
		System.out.println(hCoach.getDailyWorkout());
		System.out.println(hCoach.getDailyFortune());
		
		context.close();

	}

}
