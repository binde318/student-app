package com.codewithbide.backend.controller;

import com.codewithbide.backend.exception.StudentNotFoundException;
import com.codewithbide.backend.model.Student;
import com.codewithbide.backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/STUDENTS")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/student")
    public Student createstudent(@RequestBody Student student){

        return studentRepository.save(student);
    }
    @GetMapping("/students")
    List<Student> getAllStudents(){

        return studentRepository.findAll();
    }
    @GetMapping("/student{id}")
    Student getStudentById(@PathVariable Long id){
        return studentRepository.findById(id)
                .orElseThrow(()-> new StudentNotFoundException(id));
    }
    @GetMapping("/Student{lastName}")
    Student fetchStudentBylastName(@PathVariable String lastName){
        return studentRepository.findBylastName(lastName);
    }
    @DeleteMapping("/student{id}")
String deleteStudentById(@PathVariable Long id){
        if (!studentRepository.existsById(id)){
            throw new StudentNotFoundException(id);
        }
    studentRepository.deleteById(id);
    return " Student with the " + id + " has been deleted !!!";
}

}
