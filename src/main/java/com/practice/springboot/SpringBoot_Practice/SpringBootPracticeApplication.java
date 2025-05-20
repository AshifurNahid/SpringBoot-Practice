package com.practice.springboot.SpringBoot_Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBootPracticeApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootPracticeApplication.class, args);
		System.out.println("SpringBootPracticeApplication");
	}

}
