package com.luv2code.springdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyAppTest {

	@Test
	void testGetWorkout() {
		assertEquals("Run a hard 5k ",MyApp.getWorkout());
	}

}
