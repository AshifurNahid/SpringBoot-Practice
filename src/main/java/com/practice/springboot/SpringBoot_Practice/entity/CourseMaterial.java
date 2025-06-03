package com.practice.springboot.SpringBoot_Practice.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course_materials")
public class CourseMaterial {

    /// [...](https://chat.deepseek.com/a/chat/s/96ffa740-1e4b-43ea-954a-b1c796620723)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "description")
    private String description;

    @OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "course_id", referencedColumnName = "courseId")
    private Course course;
}
