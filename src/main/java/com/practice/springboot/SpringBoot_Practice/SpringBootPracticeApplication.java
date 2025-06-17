package com.practice.springboot.SpringBoot_Practice;

import com.practice.springboot.SpringBoot_Practice.jpa.entity.Course;
import com.practice.springboot.SpringBoot_Practice.jpa.repository.CourseMaterialRepository;
import com.practice.springboot.SpringBoot_Practice.jpa.repository.CourseRepository;
import com.practice.springboot.SpringBoot_Practice.jpa.repository.TeacherRepository;
import com.practice.springboot.SpringBoot_Practice.jpa.service.StudentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBootPracticeApplication implements CommandLineRunner {
	@Autowired
	private  StudentService studentService;
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private CourseMaterialRepository courseMaterialRepository;
	@Autowired
	private TeacherRepository teacherRepository;








	public static void main(String[] args) {
		// Run the application ONCE and get the context
		ApplicationContext context = SpringApplication.run(SpringBootPracticeApplication.class, args);


	}
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		// This will execute when the application starts
		//studentService.saveStudent();
		//System.out.println("Student saved successfully!");
		//studentService.getStudentByName("John Doe");
		//studentService.getStudentByNameLike("John%");
		//studentService.updateStudent("John Doe2", "ashifurnahid32@gmail.com");

//		Course course = Course.builder()
//				.title("Spring Boot Course")
//				.description("Learn Spring Boot from scratch")
//				.credit(3)
//				.build();
//
//		CourseMaterial courseMaterial = CourseMaterial.builder()
//				.url("https://example.com/course-material")
//				.description("Course material description")
//				.course(course)
//				.build();
//		course.setCourseMaterial(courseMaterial);
//		CourseMaterial saved = courseMaterialRepository.save(courseMaterial);
//		System.out.println("Course Material saved successfully: " + saved.getId());
//		Teacher teacher = Teacher.builder()
//				.name("John Smith")
//				.subject("Mathematics")
//				.email("sykot111@gmail.com")
//				.phoneNumber("1234567890")
//				.build();
//		Course course1 = Course.builder()
//				.title("Advanced Mathematics")
//				.description("In-depth study of advanced mathematical concepts")
//				.credit(4)
//				.teacher(teacher)
//				.build();
//		Course course2 = Course.builder()
//				.title("Advanced Mathematics")
//				.description("In-depth study of advanced mathematical concepts")
//				.credit(4)
//				.teacher(teacher)
//				.build();
//		List<Course> courses = List.of(course1, course2);
//		teacher.setCourses(courses);
//		teacherRepository.save(teacher);

		Pageable pageable = PageRequest.of(0, 2, Sort.by("title").ascending());
		List<Course> courseList = courseRepository.findAll( pageable ).getContent();
//
//		for( Course course : courseList) {
//			System.out.println(course.getTitle());
//			System.out.println(course.getDescription());
//			System.out.println(course.getCredit());
//			//System.out.println(course.getTeacher());
//			System.out.println("===================================");
//		}


	//	studentService.getStudentByEmailNative("ashifurnahid32@gmail.com");

	}
}