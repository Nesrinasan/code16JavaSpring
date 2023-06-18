package com.code16.springjavaedu.fourthweek.saturday.packagestructure.controller;

import com.code16.springjavaedu.fourthweek.saturday.packagestructure.model.Student;
import com.code16.springjavaedu.fourthweek.saturday.packagestructure.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentsController {
    @Autowired
    StudentService studentService;

    @GetMapping("/getStudentList")
    public List<Student> getStudentList(){
        return studentService.getStudentList();

    }

}
