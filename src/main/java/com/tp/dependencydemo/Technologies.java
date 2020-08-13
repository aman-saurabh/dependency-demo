package com.tp.dependencydemo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void getTechnologies(){
		System.out.println("Technologies class getTechnologies method called");
	}
}
