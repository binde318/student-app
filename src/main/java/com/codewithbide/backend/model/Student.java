package com.codewithbide.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
  @Id
 @GeneratedValue
    private String firstName;
    private String lastName;
    private Long studentId;
    private String subject;
}
