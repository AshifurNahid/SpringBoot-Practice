package com.practice.springboot.SpringBoot_Practice;

import com.practice.springboot.SpringBoot_Practice.entity.Course;
import com.practice.springboot.SpringBoot_Practice.entity.CourseMaterial;
import com.practice.springboot.SpringBoot_Practice.entity.Teacher;
import com.practice.springboot.SpringBoot_Practice.repository.CourseMaterialRepository;
import com.practice.springboot.SpringBoot_Practice.repository.CourseRepository;
import com.practice.springboot.SpringBoot_Practice.repository.TeacherRepository;
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
		Teacher teacher = Teacher.builder()
				.name("John Smith")
				.subject("Mathematics")
				.email("sykot111@gmail.com")
				.phoneNumber("1234567890")
				.build();
		Course course1 = Course.builder()
				.title("Advanced Mathematics")
				.description("In-depth study of advanced mathematical concepts")
				.credit(4)
				.teacher(teacher)
				.build();
		Course course2 = Course.builder()
				.title("Advanced Mathematics")
				.description("In-depth study of advanced mathematical concepts")
				.credit(4)
				.teacher(teacher)
				.build();
		List<Course> courses = List.of(course1, course2);
		teacher.setCourses(courses);
		teacherRepository.save(teacher);


		//List<CourseMaterial> courseMaterialList = courseMaterialRepository.findAll();
		//List<Course> courseList = courseRepository.findAll();
		//System.out.println(courseMaterialList);
		//System.out.println(courseList);
//		for( Course course1 : courseList) {
//			System.out.println(course1.getTitle());
//			System.out.println(course1.getDescription());
//			System.out.println(course1.getCredit());
//			System.out.println(course1.getCourseMaterial());
//			System.out.println("===================================");
//		}






	//	studentService.getStudentByEmailNative("ashifurnahid32@gmail.com");

	}
}