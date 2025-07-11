package com.practice.springboot.SpringBoot_Practice.jpa.repository;

import com.practice.springboot.SpringBoot_Practice.jpa.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
