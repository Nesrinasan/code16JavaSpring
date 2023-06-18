package com.code16.springjavaedu.fourthweek.sunday.restcall.resttemplate.get;


import org.springframework.http.ResponseEntity;

public interface ApiService {

    public ResponseEntity<ResponseInfoPhoneNumber> verifyPhoneNumber(String number);


}
