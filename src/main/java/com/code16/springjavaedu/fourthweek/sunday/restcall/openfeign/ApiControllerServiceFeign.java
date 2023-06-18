package com.code16.springjavaedu.fourthweek.sunday.restcall.openfeign;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ApiControllerServiceFeign {
	private final RestCallFeign restCallFeign;

	public ResponseInfoPhoneNumber verifyPhoneNumber(String phoneNumber){
		return restCallFeign.verifyPhoneNumber(phoneNumber, "veriphone.p.rapidapi.com", "e7573b8dfamsh06db1ee333752fbp1e2a0ajsn67ca8fb7fe8d");
	}
}
