package com.code16.springjavaedu.thirdweek.sunday.genelbakis.packageyapisi.controller;

import com.code16.springjavaedu.fourthweek.saturday.packagestructure.model.Student;
import com.code16.springjavaedu.fourthweek.saturday.packagestructure.responsedto.StudentInfoBilgiResponseDto;
import com.code16.springjavaedu.fourthweek.saturday.packagestructure.responsedto.StudentInfoResponseDto;
import com.code16.springjavaedu.thirdweek.sunday.genelbakis.packageyapisi.service.StudenttService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
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
//    @RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public List<StudentInfoResponseDto> getStudentList(){
        return studentService.getStudenttList();
    }

//    @GetMapping(value = "/getStudentsList")
////    @RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
//    public List<StudentInfoBilgiResponseDto> getStudentList(){
//        return studentService.getStudenttList();
//    }

}
