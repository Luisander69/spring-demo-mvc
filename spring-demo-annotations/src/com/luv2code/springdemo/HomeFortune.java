package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HomeFortune implements FortuneService {

	@Override
	public String getFortune() throws FileNotFoundException, IOException {
		
		return "The best place with lots of luck is home";
	}

}
