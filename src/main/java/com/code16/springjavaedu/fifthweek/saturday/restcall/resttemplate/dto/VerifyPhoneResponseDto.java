package com.code16.springjavaedu.fifthweek.saturday.restcall.resttemplate.dto;

import lombok.Data;

@Data
public class VerifyPhoneResponseDto {
	private String phone;
	private String country;
	private String country_prefix;
	private boolean phone_valid;


}
