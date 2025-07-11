package com.practice.springboot.SpringBoot_Practice.jpa.repository;

import com.practice.springboot.SpringBoot_Practice.jpa.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseMaterialRepository  extends JpaRepository<CourseMaterial, Long> {
    // Additional query methods can be defined here if needed
}
