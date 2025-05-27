package com.practice.springboot.SpringBoot_Practice.service;


import com.practice.springboot.SpringBoot_Practice.entity.Student;
import com.practice.springboot.SpringBoot_Practice.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class StudentService {
     final private StudentRepository studentRepository;
     private Student student;




    public  void saveStudent() {
        Student student = Student.builder()
                .name("John Doe")
                .email("ashifurnahid32@gmail.com")
                .address("123 Main St")
                .phoneNumber("1234567890")
                .build();
        studentRepository.save(student);


    }
}
