package com.code16.springjavaedu.fourthweek.sunday.restcall.resttemplate.post;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CoinServicee {

    private final RestTemplate restTemplate;
    private final HttpHeaders httpHeaders;

    public ResponseEntity<CoinResponseDto> getToken(CoinRequestDto coinRequestDto){

        httpHeaders.add("content-type", "application/json");
        httpHeaders.add("X-RapidAPI-Host", "bravenewcoin.p.rapidapi.com");
        httpHeaders.add("X-RapidAPI-Key", "e7573b8dfamsh06db1ee333752fbp1e2a0ajsn67ca8fb7fe8d");
        String url = "https://bravenewcoin.p.rapidapi.com/oauth/token";

        HttpEntity<CoinRequestDto> httpEntity = new HttpEntity<CoinRequestDto>(coinRequestDto, httpHeaders);
        ResponseEntity<CoinResponseDto> coinResponseDtoResponseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, CoinResponseDto.class);

        return coinResponseDtoResponseEntity;

    }

}
