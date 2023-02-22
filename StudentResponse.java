package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class StudentResponse {

	private long id;
	
	
	private String firstName;
	
	@JsonIgnore
	private String lastName;
	
	public StudentResponse(long id,String firstName,String lastName)
	{
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
