package com.practice.springboot.SpringBoot_Practice.repository;

import com.practice.springboot.SpringBoot_Practice.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByName(String name);

    //List<Student> findByEmail(String email);
    List<Student> findByNameLike(String name);

    /// JPQL
    @Query(value = "SELECT s FROM Student s WHERE s.email = ?1 ")
    List<Student> findByEmail(String email);

    /// JPQL Named Parameter
    @Query(value = "SELECT s FROM Student s WHERE s.email = :email ")
    Student getStudentsByEmail(@Param("email") String email);


    /// Native Query
    @Query(value = "SELECT * FROM students s WHERE s.email= ?1 ",
            nativeQuery = true)
    List<Student> getStudentByEmailNative(@Param("email") String email);

    @Modifying
    @Transactional
    @Query(value= " Update Student s SET s.name = :name where s.email = :email")
    int updateStudent(String name, String email);


}
