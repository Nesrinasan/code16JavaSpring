package com.code16.springjavaedu.fourthweek.sunday.restcall.openfeign;

import lombok.Data;

@Data
public class ResponseInfoPhoneNumber {

    private String status;
    private String phone;
    private String country;
    private String carrier;


}
