package com.code16.springjavaedu.fourthweek.saturday.jpaexample.service;

import com.code16.springjavaedu.fourthweek.saturday.jpaexample.converter.EngineerConverter;
import com.code16.springjavaedu.fourthweek.saturday.jpaexample.entity.Engineer;
import com.code16.springjavaedu.fourthweek.saturday.jpaexample.repository.EngineerRepository;
import com.code16.springjavaedu.fourthweek.saturday.jpaexample.requestDto.SaveEngineerRequestDto;
import com.code16.springjavaedu.fourthweek.saturday.jpaexample.responseDto.EngineerSaveResponseDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class EngineerService {

	private final EngineerRepository engineerRepository;
	private final EngineerConverter engineerConverter;

	@Transactional(transactionManager = "transactionManager")
	public void save(SaveEngineerRequestDto saveEngineerRequestDto) {
		Engineer engineer = new Engineer();
		engineer.setName(saveEngineerRequestDto.getName());
		engineer.setLastName(saveEngineerRequestDto.getLastName());
		engineer.setTckn(saveEngineerRequestDto.getTckn());

		engineerRepository.save(engineer);
		test();

	}
	private static void test() {
		String s = null;
		s.equals("");
	}

	public List<EngineerSaveResponseDto> getEngineerListByName(String name){
		Engineer allByName = engineerRepository.findAllByName(name);
		List<Engineer> engineerListByName = engineerRepository.findEngineerByName(name);

		List<EngineerSaveResponseDto> engineerSaveResponseDtoList = engineerConverter.convertToEngineerSaveResponseDtoByEngineer(engineerListByName);
		return engineerSaveResponseDtoList;

	}

}
