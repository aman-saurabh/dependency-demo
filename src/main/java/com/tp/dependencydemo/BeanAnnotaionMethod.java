package com.tp.dependencydemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanAnnotaionMethod {
	@Bean(name= {"getMyBeanObject","myBeanObject"})
	public BeanObject getBeanObject() {
		return new BeanObject();
	}
}
