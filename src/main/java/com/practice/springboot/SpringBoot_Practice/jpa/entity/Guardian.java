package com.practice.springboot.SpringBoot_Practice.jpa.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Guardian {

    private String guardianFirstName;
    private String guardianLastName;
    private String guardianEmail;
    private String guardianPhoneNumber;

}
