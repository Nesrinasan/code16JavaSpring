package com.code16.springjavaedu.fourthweek.sunday.restcall.resttemplate.get;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService{

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HttpHeaders httpHeaders;

    @Override
    public ResponseEntity<ResponseInfoPhoneNumber> verifyPhoneNumber(String number) {
        httpHeaders.add("X-RapidAPI-Host", "veriphone.p.rapidapi.com");
        httpHeaders.add("X-RapidAPI-Key", "e7573b8dfamsh06db1ee333752fbp1e2a0ajsn67ca8fb7fe8d");
        HttpEntity<ResponseInfoPhoneNumber> httpEntity = new HttpEntity<>(httpHeaders);

        String url = "https://veriphone.p.rapidapi.com/verify?phone="+number;
        ResponseEntity<ResponseInfoPhoneNumber> responseInfoPhoneNumberResponseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, ResponseInfoPhoneNumber.class);

        return responseInfoPhoneNumberResponseEntity;

    }
}
