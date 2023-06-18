package com.code16.springjavaedu.fourthweek.saturday.jpaexample.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SaveEngineerRequestDto {

	private String name;

	private String lastName;

	private String tckn;

}
