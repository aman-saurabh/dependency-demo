package com.tp.dependencydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tp.dependencydemo","com.tp.otherpackagebean"})
public class DependencyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyDemoApplication.class, args);
//To get ConfigurableApplicationContext object so that we can use that with following functionalities.
//		ConfigurableApplicationContext context = SpringApplication.run(DependencyDemoApplication.class, args);
		
//To check how different types of dependency injection works and their priority level.		
//		DependencyInjectionTypesDemo d = context.getBean(DependencyInjectionTypesDemo.class, args);
		
//To check how we can get object from ApplicationContext's object getBean() method
//		Courses c =context.getBean(Courses.class);
//		c.display();
		
//To check how @Component and @Bean annotation works and how to work with custom naming with them.
//		BeanObject b = context.getBean(BeanObject.class);
//		System.out.println(b);			
//		BeanObject b1 = (BeanObject) context.getBean("getMyBeanObject");
//		System.out.println(b1);		
//		BeanObject b2 = (BeanObject) context.getBean("myBeanObject");
//		System.out.println(b2);
		
//To check Scopes of Spring beans specially Singleton and Prototype scope.
//		context.getBean(BeanObject.class);
//		context.getBean(BeanObject.class);
//		context.getBean(BeanObject.class);
//		context.getBean(BeanObject.class);
//		context.getBean(BeanObject.class);
	}

}
