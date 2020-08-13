package com.tp.dependencydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Dependent {
	@Autowired
	@Qualifier("myBeanObject")
	BeanObject beanObj;
	
	@GetMapping("/")
	public String getDependency() {
		return beanObj.toString();
	}
	
}
