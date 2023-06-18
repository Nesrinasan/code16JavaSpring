package com.code16.springjavaedu.fourthweek.sunday.restcall.resttemplate.get;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    ApiService apiService;

    @GetMapping("/verifyPhone")
    public ResponseEntity<ResponseInfoPhoneNumber> verifyPhoneNumber(@RequestParam String phoneNumber){
        ResponseEntity<ResponseInfoPhoneNumber> responseInfoPhoneNumberResponseEntity = apiService.verifyPhoneNumber(phoneNumber);

        return responseInfoPhoneNumberResponseEntity;
    }



}
