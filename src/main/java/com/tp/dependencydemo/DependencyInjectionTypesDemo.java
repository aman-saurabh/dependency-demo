package com.tp.dependencydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//To check how different types of dependency injection works and their priority level.
@Component
public class DependencyInjectionTypesDemo {
	//Field Injection
	@Autowired
	private Topping topping;
	@Autowired
	private Bread bread;
	
	//Constructor Injection
	public DependencyInjectionTypesDemo(Topping topping, Bread bread) {
		System.out.println("Constructor called");
		this.topping = topping;
		this.bread = bread;
	}
	
	//Setter Injection
	@Autowired
	public void setTopping(Topping topping) {
		System.out.println("Setter of topping called");
		this.topping = topping;
	}
	
	@Autowired
	public void setBread(Bread bread) {
		System.out.println("Setter of bread called");
		this.bread = bread;
	}
}

@Component
class Topping{
	public String color;
}

@Component
class Bread{
	public String type;
}