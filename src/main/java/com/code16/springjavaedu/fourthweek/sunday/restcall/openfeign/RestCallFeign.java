package com.code16.springjavaedu.fourthweek.sunday.restcall.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "veriphoneCall", url = "https://veriphone.p.rapidapi.com/")
public interface RestCallFeign {

    @GetMapping(value = "/verify")
    ResponseInfoPhoneNumber verifyPhoneNumber(@RequestHeader("X-RapidAPI-Host") String apiHost, @RequestHeader("X-RapidAPI-Key") String apiKey, @RequestParam String phone);


}
