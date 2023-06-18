package com.code16.springjavaedu.fourthweek.sunday.restcall.openfeign;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiControllerFeign {

    private final ApiControllerServiceFeign apiControllerServiceFeign;

    @GetMapping("/verifyPhoneFeign")
    public ResponseInfoPhoneNumber verifyPhoneNumber(@RequestParam String phoneNumber){
        return apiControllerServiceFeign.verifyPhoneNumber(phoneNumber);
    }



}
