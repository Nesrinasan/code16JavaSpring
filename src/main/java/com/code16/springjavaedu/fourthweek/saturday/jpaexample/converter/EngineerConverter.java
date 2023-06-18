package com.code16.springjavaedu.fourthweek.saturday.jpaexample.converter;

import com.code16.springjavaedu.fourthweek.saturday.jpaexample.entity.Engineer;
import com.code16.springjavaedu.fourthweek.saturday.jpaexample.responseDto.EngineerSaveResponseDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class EngineerConverter {
	private final ModelMapper modelMapper;

	public List<EngineerSaveResponseDto> convertToEngineerSaveResponseDtoByEngineer(List<Engineer> engineerListByName) {
		List<EngineerSaveResponseDto> engineerSaveResponseDtoList = new ArrayList<>();
		for (Engineer engineer : engineerListByName) {
			EngineerSaveResponseDto engineerSaveResponseDto = modelMapper.map(engineer, EngineerSaveResponseDto.class);
			engineerSaveResponseDtoList.add(engineerSaveResponseDto);
		}
		return engineerSaveResponseDtoList;
	}

}
