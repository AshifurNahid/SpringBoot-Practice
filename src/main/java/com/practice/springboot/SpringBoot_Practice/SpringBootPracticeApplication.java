package com.practice.springboot.SpringBoot_Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBootPracticeApplication {

	public static void main(String[] args) {
		// Run the application ONCE and get the context
		ApplicationContext context = SpringApplication.run(SpringBootPracticeApplication.class, args);

		System.out.println("SpringBootPracticeApplication");

		// Log beans (optional)
		String[] beanNames = context.getBeanDefinitionNames();
		System.out.println("Beans provided by Spring Boot:");
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
		System.out.println("Spring Boot Application Started Successfully!");
	}
}