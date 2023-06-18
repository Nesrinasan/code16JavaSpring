package com.code16.springjavaedu.fourthweek.sunday.restcall.resttemplate.post;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CoinRequestDto {

    @JsonProperty("client_id")
    private String clientId;

    private String audience;

    @JsonProperty("grant_type")
    private String grantType;
}
