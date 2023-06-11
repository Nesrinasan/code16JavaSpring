package com.code16.springjavaedu.thirdweek.sunday.genelbakis.packageyapisi.service;


import com.code16.springjavaedu.thirdweek.sunday.genelbakis.packageyapisi.configuration.GeneralConfiguration;
import com.code16.springjavaedu.thirdweek.sunday.genelbakis.packageyapisi.convert.StudentConverter;
import com.code16.springjavaedu.thirdweek.sunday.genelbakis.packageyapisi.model.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudenttService {

    @Autowired
    StudentConverter converter;

    public List<Student> getStudenttList() {
        List<Student> studentList = GeneralConfiguration.studentList;
        for (Student student : studentList) {
            converter.studentConvert(student);
        }

        return studentList;

    }

}
