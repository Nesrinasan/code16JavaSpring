package com.code16.springjavaedu.fourthweek.sunday.restcall.resttemplate.post;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coin")
public class CoinController {

    @Autowired
    CoinServicee coinServicee;

    @PostMapping("/getToken")
    public ResponseEntity<CoinResponseDto> getTokenForCoin(@RequestBody CoinRequestDto coinRequestDto){

        ResponseEntity<CoinResponseDto> token = coinServicee.getToken(coinRequestDto);
        return token;

    }

}
