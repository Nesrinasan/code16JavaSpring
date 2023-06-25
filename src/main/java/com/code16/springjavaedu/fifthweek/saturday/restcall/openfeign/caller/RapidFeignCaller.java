package com.code16.springjavaedu.fifthweek.saturday.restcall.openfeign.caller;

import com.code16.springjavaedu.fifthweek.saturday.restcall.resttemplate.dto.VerifyPhoneResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "rapid", url = "https://veriphone.p.rapidapi.com/")
public interface RapidFeignCaller {


	@GetMapping(value = "/verify")
	VerifyPhoneResponseDto verifyPhoneNumber(@RequestHeader("X-RapidAPI-Host") String apiHost, @RequestHeader("X-RapidAPI-Key") String apiKey, @RequestParam String phone);


}
