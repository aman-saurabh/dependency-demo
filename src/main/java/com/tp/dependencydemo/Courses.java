package com.tp.dependencydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Courses {
	private int id;
	private String name;
	@Autowired
	private Technologies techDetails;	
	public Technologies getTechDetails() {
		return techDetails;
	}
	public void setTechDetails(Technologies techDetails) {
		this.techDetails = techDetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Courses class display method called");
		techDetails.getTechnologies();
	}
}
