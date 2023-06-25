package com.code16.springjavaedu.fifthweek.saturday.restcall.openfeign.controller;

import com.code16.springjavaedu.fifthweek.saturday.restcall.openfeign.service.CustomerFeignService;
import com.code16.springjavaedu.fifthweek.saturday.restcall.resttemplate.dto.SaveCustomerRequestDto;
import com.code16.springjavaedu.fifthweek.saturday.restcall.resttemplate.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/feign/customer")
@RequiredArgsConstructor
public class CustomerFeignController {

	private final CustomerFeignService customerFeignService;

	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody SaveCustomerRequestDto saveCustomerRequestDto){
		customerFeignService.save(saveCustomerRequestDto);
	}



}
