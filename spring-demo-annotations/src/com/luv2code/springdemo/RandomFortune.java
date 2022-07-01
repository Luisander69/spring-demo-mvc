package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements FortuneService {

	@Override
	public String getFortune() throws FileNotFoundException, IOException {
		 String fileName = "src/com/luv2code/springdemo/app.log";

	     String[] fortunes = new String[3];
	     int counter = 0;
	        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                fortunes[counter] = line;
	                counter++;
	            }
	        }
	        
		return fortunes[getRandom(fortunes.length)];
	}
	private int getRandom(int length) {
		Random myRandom = new Random();
		int index = myRandom.nextInt(length);
		return index;
	}

}
