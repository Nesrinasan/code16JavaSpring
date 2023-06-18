package com.code16.springjavaedu.fourthweek.saturday.packagestructure.service;


import com.code16.springjavaedu.fourthweek.saturday.packagestructure.model.Student;
import com.code16.springjavaedu.configuration.GeneralConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudentList() {
        return GeneralConfiguration.studentList;
    }

}
