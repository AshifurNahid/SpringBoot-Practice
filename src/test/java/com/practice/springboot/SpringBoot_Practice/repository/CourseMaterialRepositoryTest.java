package com.practice.springboot.SpringBoot_Practice.repository;

import com.practice.springboot.SpringBoot_Practice.entity.Course;
import com.practice.springboot.SpringBoot_Practice.entity.CourseMaterial;
import org.junit.jupiter.api.Test; // JUnit 5 ব্যবহার করুন
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest // JPA টেস্টের জন্য স্পেশালাইজড
public class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

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
        assertNotNull(saved.getId());
    }
}