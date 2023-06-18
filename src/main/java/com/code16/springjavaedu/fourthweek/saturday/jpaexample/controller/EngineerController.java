package com.code16.springjavaedu.fourthweek.saturday.jpaexample.controller;

import com.code16.springjavaedu.fourthweek.saturday.jpaexample.requestDto.SaveEngineerRequestDto;
import com.code16.springjavaedu.fourthweek.saturday.jpaexample.responseDto.EngineerSaveResponseDto;
import com.code16.springjavaedu.fourthweek.saturday.jpaexample.service.EngineerService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/engineer")
@RequiredArgsConstructor
public class EngineerController {
	private final EngineerService engineerService;

	@PostMapping("/save")
	public void save(@RequestBody SaveEngineerRequestDto saveEngineerRequestDto) {
		engineerService.save(saveEngineerRequestDto);

	}

	@GetMapping("/engineerList")
	public List<EngineerSaveResponseDto> save(@RequestParam String name) {
		return engineerService.getEngineerListByName(name);

	}



}
