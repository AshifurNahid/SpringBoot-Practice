package com.practice.springboot.SpringBoot_Practice.repository;

import com.practice.springboot.SpringBoot_Practice.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
