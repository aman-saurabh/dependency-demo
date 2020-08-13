package com.tp.dependencydemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class BeanObject {
	BeanObject(){
		System.out.println("BeanObject class object created");
	}
	
	@Override
	public String toString() {
		return "BeanObject Created : "+this.hashCode();
	}
}
