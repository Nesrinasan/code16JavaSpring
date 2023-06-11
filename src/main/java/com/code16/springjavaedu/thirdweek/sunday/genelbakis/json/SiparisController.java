package com.code16.springjavaedu.thirdweek.sunday.genelbakis.json;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/siparis")
public class SiparisController {

    @PostMapping("/siparisKaydet")
    public void siparisKaydet(@RequestBody SiparisSaveRequestBody siparisSaveRequestBody){
        System.out.println(siparisSaveRequestBody);

    }

}
