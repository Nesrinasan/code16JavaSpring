package com.code16.springjavaedu.fifthweek.saturday.restcall.resttemplate.service;

import com.code16.springjavaedu.fifthweek.saturday.myexception.UserException;
import com.code16.springjavaedu.fifthweek.saturday.restcall.resttemplate.dto.SaveCustomerRequestDto;
import com.code16.springjavaedu.fifthweek.saturday.restcall.resttemplate.dto.VerifyPhoneResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CustomerService {
	private final RestTemplate restTemplate;

	public void save(SaveCustomerRequestDto saveCustomerRequestDto){
		String name = saveCustomerRequestDto.name();
		String phoneNumber = saveCustomerRequestDto.phoneNumber();

		if(!validatePhoneNumber(phoneNumber)){
			throw new UserException("Kullanıcının telefon numarası hatalı.");
		}
		//save işlemi yapılır
	}

	private boolean validatePhoneNumber(String phoneNumber) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("X-RapidAPI-Key", "e7573b8dfamsh06db1ee333752fbp1e2a0ajsn67ca8fb7fe8d");
		httpHeaders.add("X-RapidAPI-Host", "veriphone.p.rapidapi.com");
		HttpEntity<VerifyPhoneResponseDto> httpEntity = new HttpEntity(httpHeaders);

		String url = "https://veriphone.p.rapidapi.com/verify?phone="+phoneNumber;
		try{
			ResponseEntity<VerifyPhoneResponseDto> responseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, VerifyPhoneResponseDto.class);
			VerifyPhoneResponseDto body = responseEntity.getBody();
			return body.isPhone_valid();
		}catch (Exception e){
			throw new UserException("Kullanıcnın telefon numarası verify edilirken bir hata ile karşılaşıldı.");
		}
	}
}
