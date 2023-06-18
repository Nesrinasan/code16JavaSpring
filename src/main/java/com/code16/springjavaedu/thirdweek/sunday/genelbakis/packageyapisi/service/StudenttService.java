package com.code16.springjavaedu.thirdweek.sunday.genelbakis.packageyapisi.service;


import com.code16.springjavaedu.configuration.GeneralConfiguration;
import com.code16.springjavaedu.fourthweek.saturday.packagestructure.responsedto.StudentInfoResponseDto;
import com.code16.springjavaedu.thirdweek.sunday.genelbakis.packageyapisi.convert.StudentConverter;
import com.code16.springjavaedu.fourthweek.saturday.packagestructure.model.Student;
import com.code16.springjavaedu.thirdweek.sunday.genelbakis.packageyapisi.model.student.StudentInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudenttService {

    @Autowired
    StudentConverter converter;

    @Autowired
    ModelMapper modelMapper;

//    @Autowired
//    public StudenttService(StudentConverter converter){
//        this.converter = converter;
//    }

    public List<StudentInfoResponseDto> getStudenttList() {

        List<Student> studentList = GeneralConfiguration.studentList; //DB verisi
        return convertToStudentInfoResponseDtoFromStudent(studentList);

    }

    private List<StudentInfoResponseDto> convertToStudentInfoResponseDtoFromStudent(List<Student> studentList) {
        List<StudentInfoResponseDto> studentInfoResponseDtoList = new ArrayList<>();

        for (Student student : studentList) {
            String name = student.getName();
            String classNo = student.getClassNo();
            int number = student.getNumber();

            StudentInfoResponseDto studentInfoResponseDto = new StudentInfoResponseDto();
            studentInfoResponseDto.setNumber(number);
            studentInfoResponseDto.setName(name);
            studentInfoResponseDtoList.add(studentInfoResponseDto);
        }
        return studentInfoResponseDtoList;
    }

    private List<StudentInfoResponseDto> convertToStudentInfoResponseDtoFromStudentMapper(List<Student> studentList) {
        List<StudentInfoResponseDto> studentInfoResponseDtoList = new ArrayList<>();


        for (Student student : studentList) {
            StudentInfoResponseDto studentInfoResponseDto = modelMapper.map(student, StudentInfoResponseDto.class);
            studentInfoResponseDtoList.add(studentInfoResponseDto);
        }
        return studentInfoResponseDtoList;
    }

    private List<StudentInfoResponseDto> convertToStudentInfoResponseDtoFromStudentStremApi(List<Student> studentList) {

        List<StudentInfoResponseDto> studentInfoResponseDtoList = studentList.stream().map(student -> {

            return modelMapper.map(student, StudentInfoResponseDto.class);

        }).collect(Collectors.toList());

        return studentInfoResponseDtoList;

    }

}
