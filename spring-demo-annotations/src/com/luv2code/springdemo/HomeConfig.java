package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class HomeConfig {
	@Bean
	public FortuneService homeFortune() {
		return new HomeFortune();
	}
	@Bean
	public Coach homeCoach() {
		return new HomeCoach(homeFortune());
	}

}
