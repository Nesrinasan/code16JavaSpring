package com.code16.springjavaedu.thirdweek.sunday.genelbakis.packageyapisi.controller;

import com.code16.springjavaedu.thirdweek.sunday.genelbakis.packageyapisi.model.student.Student;
import com.code16.springjavaedu.thirdweek.sunday.genelbakis.packageyapisi.service.StudenttService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
//www.google.com/student/getStudentsList
    @Autowired
    StudenttService studentService;

    @GetMapping(value = "/getStudentsList")
    public List<Student> getStudentList(){
        return studentService.getStudenttList();

    }

}
