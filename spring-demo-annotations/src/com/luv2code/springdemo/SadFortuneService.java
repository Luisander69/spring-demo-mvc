package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() throws FileNotFoundException, IOException {
		
		return "Today is a sad day";
	}

}
