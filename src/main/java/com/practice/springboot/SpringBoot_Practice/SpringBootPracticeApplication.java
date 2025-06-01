package com.practice.springboot.SpringBoot_Practice;

import com.practice.springboot.SpringBoot_Practice.entity.Course;
import com.practice.springboot.SpringBoot_Practice.entity.CourseMaterial;
import com.practice.springboot.SpringBoot_Practice.repository.CourseMaterialRepository;
import com.practice.springboot.SpringBoot_Practice.repository.CourseRepository;
import com.practice.springboot.SpringBoot_Practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.List;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBootPracticeApplication implements CommandLineRunner {
	private final StudentService studentService;
	@Autowired
	private CourseRepository courseRepository;


	// Constructor injection
	public SpringBootPracticeApplication(StudentService studentService) {
		this.studentService = studentService;
	}
	@Autowired
	private CourseMaterialRepository courseMaterialRepository;




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

		Course course = Course.builder()
				.title("Spring Boot Course")
				.description("Learn Spring Boot from scratch")
				.credit(3)
				.build();

		CourseMaterial courseMaterial = CourseMaterial.builder()
				.url("https://example.com/course-material")
				.description("Course material description")
				.course(course)
				.build();

		CourseMaterial saved = courseMaterialRepository.save(courseMaterial);


		List<CourseMaterial> courseMaterialList = courseMaterialRepository.findAll();
		System.out.println(courseMaterialList);






	//	studentService.getStudentByEmailNative("ashifurnahid32@gmail.com");

	}
}