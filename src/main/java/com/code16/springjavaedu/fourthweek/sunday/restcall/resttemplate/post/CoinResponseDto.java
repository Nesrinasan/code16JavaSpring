package com.code16.springjavaedu.fourthweek.sunday.restcall.resttemplate.post;

import lombok.Data;

@Data
public class CoinResponseDto {

    private String accessToken;
    private String scope;
    private String tokenType;
    private Integer expiresIn;

}
