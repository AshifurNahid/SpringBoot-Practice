package com.practice.springboot.SpringBoot_Practice.service;


import com.practice.springboot.SpringBoot_Practice.entity.Guardian;
import com.practice.springboot.SpringBoot_Practice.entity.Student;
import com.practice.springboot.SpringBoot_Practice.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.junit.Test;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StudentService {
    final private StudentRepository studentRepository;
    private Student student;

    public void getStudentByName(String name) {
        System.out.println(studentRepository.findByName(name));

    }

    public void getStudentByEmail(String email) {
        System.out.println(studentRepository.findByEmail(email));
    }

    public void getStudentByNameLike(String name) {
        System.out.println(studentRepository.findByNameLike(name));
    }

    public void getStudentByEmailNative(String name) {
        System.out.println(studentRepository.getStudentByEmailNative(name));
    }

    public void updateStudent(String name, String email) {
        int updatedRows = studentRepository.updateStudent(name, email);
        System.out.println("Updated Rows: " + updatedRows);
    }


    public void saveStudent() {

        Guardian guardian = Guardian.builder()
                .guardianFirstName("Rahim Khan")
                .build();
        Student student = Student.builder()
                .name("John Doe")
                .email("ashifurnahid32@gmail.com")
                .address("123 Main St")
                .phoneNumber("1234567890")
                .guardian(guardian)
                .build();
        studentRepository.save(student);


    }


}
