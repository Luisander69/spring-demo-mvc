package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Null;
import javax.validation.constraints.Size;




public class Customer {

private String firstName;
	
	@Null(message="is required")
	@Size(min=1, message="is required")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
}
