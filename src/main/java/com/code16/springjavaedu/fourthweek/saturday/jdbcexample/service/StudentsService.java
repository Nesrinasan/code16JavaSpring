package com.code16.springjavaedu.fourthweek.saturday.jdbcexample.service;

import com.code16.springjavaedu.fourthweek.saturday.jdbcexample.mapper.StudentMapper;
import com.code16.springjavaedu.fourthweek.saturday.jdbcexample.responsedto.StudentInfoResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<StudentInfoResponseDto> getStudentList() {

		List<StudentInfoResponseDto> studentInfoResponseDtoList = jdbcTemplate.query("select * from student", new StudentMapper());
		return studentInfoResponseDtoList;
	}

	public StudentInfoResponseDto getStudentByNumber(Integer number) {

		String sql = "select * from student where student.no = " + number;

		List<StudentInfoResponseDto> studentInfoResponseDtoList = jdbcTemplate.query(sql, new StudentMapper());
		return studentInfoResponseDtoList.get(0);
	}

	public List<StudentInfoResponseDto> getStudentListByNameSqlInjection(String name) {
		String sql = "select * from student s where s.NAME= " + name;

		List<StudentInfoResponseDto> studentInfoResponseDtoList = jdbcTemplate.query(sql, new StudentMapper());
		return studentInfoResponseDtoList;
	}

	public List<StudentInfoResponseDto> getStudentListByName(String name) {
		String sql = "select * from student s where s.NAME= ? ";

		List<StudentInfoResponseDto> studentInfoResponseDtoList = jdbcTemplate.query(sql, new Object[]{name}, new StudentMapper());
		return studentInfoResponseDtoList;
	}

}
