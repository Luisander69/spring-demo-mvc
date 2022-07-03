package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		boolean result = (theCoach == alphaCoach);
		System.out.println("\n The same object?: "+result);
		System.out.println("\n theCoach memory location: "+theCoach);
		System.out.println("\n alphaCoach memory location: "+alphaCoach+"\n");
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
