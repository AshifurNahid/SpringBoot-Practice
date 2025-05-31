package com.practice.springboot.SpringBoot_Practice;

import com.practice.springboot.SpringBoot_Practice.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBootPracticeApplication implements CommandLineRunner {
	private final StudentService studentService;

	// Constructor injection
	public SpringBootPracticeApplication(StudentService studentService) {
		this.studentService = studentService;
	}


	public static void main(String[] args) {
		// Run the application ONCE and get the context
		ApplicationContext context = SpringApplication.run(SpringBootPracticeApplication.class, args);


	}
	@Override
	public void run(String... args) throws Exception {
		// This will execute when the application starts
		//studentService.saveStudent();
		//System.out.println("Student saved successfully!");
		//studentService.getStudentByName("John Doe");
		//studentService.getStudentByNameLike("John%");
		//studentService.updateStudent("John Doe2", "ashifurnahid32@gmail.com");
		studentService.getStudentByEmailNative("ashifurnahid32@gmail.com");

	}
}