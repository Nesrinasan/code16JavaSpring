package com.code16.springjavaedu.fourthweek.saturday.jdbcexample.mapper;

import com.code16.springjavaedu.fourthweek.saturday.jdbcexample.responsedto.StudentInfoResponseDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentMapper implements RowMapper<StudentInfoResponseDto> {

	@Override
	public StudentInfoResponseDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentInfoResponseDto student = new StudentInfoResponseDto();
		student.setName(rs.getString("NAME"));
		student.setNo(rs.getInt("NO"));

		return student;
	}
}
