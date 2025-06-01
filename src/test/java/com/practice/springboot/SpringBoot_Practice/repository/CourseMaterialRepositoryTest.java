package com.practice.springboot.SpringBoot_Practice.repository;

import com.practice.springboot.SpringBoot_Practice.entity.Course;
import com.practice.springboot.SpringBoot_Practice.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.List;



@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void testSaveCourseMaterial() {
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
        //assertNotNull(saved.getId());
    }
    @Test
    public void testFindById() {
        List<CourseMaterial> courseMaterial = courseMaterialRepository.findAll();
        System.out.println(courseMaterial);
    }
    @Test
    public void testCourse(){

    }

}