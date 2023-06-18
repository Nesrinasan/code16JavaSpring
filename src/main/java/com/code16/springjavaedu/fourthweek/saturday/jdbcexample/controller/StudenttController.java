package com.code16.springjavaedu.fourthweek.saturday.jdbcexample.controller;

import com.code16.springjavaedu.fourthweek.saturday.jdbcexample.responsedto.StudentInfoResponseDto;
import com.code16.springjavaedu.fourthweek.saturday.jdbcexample.service.StudentsService;
import com.code16.springjavaedu.fourthweek.saturday.jpaexample.entity.Engineer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudenttController {

	@Autowired
	StudentsService service;

	@GetMapping("/studentList")
	public List<StudentInfoResponseDto> getStudentList() {
		return service.getStudentList();
	}

	@GetMapping("/studentByNumber/{number}")
	public StudentInfoResponseDto getStudentByNo(@PathVariable Integer number) {
		return service.getStudentByNumber(number);
	}

	/**
	 * sql injection case
	 * @param name
	 * @return
	 */
	@GetMapping("/studentlistByNameSqlInj/{name}")
	public List<StudentInfoResponseDto> getStudentlistByName(@PathVariable String name) {
		return service.getStudentListByNameSqlInjection(name);
	}


	/**
	 * sql injection fix case
	 * @param name
	 * @return
	 */
	@GetMapping("/studentlistByName")
	public List<StudentInfoResponseDto> studentlistByName(@RequestParam String name) {
		return service.getStudentListByName(name);
	}


}
