package com.code16.springjavaedu.fifthweek.saturday.springbootexception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @Autowired
    DoctorServices doctorServices;

    @GetMapping("/doctorByName")
    public ResponseEntity<String> getDoctorByName(@RequestParam String name, @RequestParam String lastName) {
        String doctorName = doctorServices.getDoctorByName(name, lastName);
        return new ResponseEntity<>(doctorName, HttpStatus.OK);

    }


}


