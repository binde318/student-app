package com.codewithbide.backend.repository;


import com.codewithbide.backend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findBylastName(String lastName);

//    boolean existsBylastName(String lastName);
//
//    void deleteBylastName(String lastName);
}
