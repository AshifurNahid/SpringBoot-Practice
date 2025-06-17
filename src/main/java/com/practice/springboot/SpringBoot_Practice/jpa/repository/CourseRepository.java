package com.practice.springboot.SpringBoot_Practice.jpa.repository;

import com.practice.springboot.SpringBoot_Practice.jpa.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
