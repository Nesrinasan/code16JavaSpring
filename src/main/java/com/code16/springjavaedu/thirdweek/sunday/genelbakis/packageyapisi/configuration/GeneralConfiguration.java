package com.code16.springjavaedu.thirdweek.sunday.genelbakis.packageyapisi.configuration;


import com.code16.springjavaedu.thirdweek.sunday.genelbakis.packageyapisi.model.student.Student;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class GeneralConfiguration {

    public static List<Student> studentList = new ArrayList<>();

    @PostConstruct
    public void fillStudentList(){
        Student student = new Student();
        student.setName("Nesrin");
        student.setNumber(123);

        Student student1 = new Student();
        student1.setName("Doruk");
        student1.setNumber(234);

        studentList.add(student);
        studentList.add(student1);
    }




}
