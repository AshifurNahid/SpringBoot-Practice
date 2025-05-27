package com.practice.springboot.SpringBoot_Practice.repository;

import com.practice.springboot.SpringBoot_Practice.entity.Student;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
@DataJpaTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testSaveStudent() {
        Student student = Student.builder()
                .name("John Doe")
                .email("ashifurnahid32@gmail.com")
                .address("123 Main St")
                .phoneNumber("1234567890")
                .build();
        studentRepository.save(student);
    }
}