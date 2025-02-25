package com.example.test_eight.controller;


import com.example.test_eight.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping(path = "/student")
    public Student getStudent(){

        Student obj1 = new Student();
        obj1.setId(20);
        obj1.setAge(25);
        obj1.setName("Tharushii");
        obj1.setGrade(13);
        return obj1;

    }
}
