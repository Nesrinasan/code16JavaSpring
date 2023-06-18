package com.code16.springjavaedu.fourthweek.saturday.jpaexample.service;

import com.code16.springjavaedu.fourthweek.saturday.jpaexample.converter.EngineerConverter;
import com.code16.springjavaedu.fourthweek.saturday.jpaexample.entity.Engineer;
import com.code16.springjavaedu.fourthweek.saturday.jpaexample.repository.EngineerRepository;
import com.code16.springjavaedu.fourthweek.saturday.jpaexample.requestDto.SaveEngineerRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {

    @Autowired
    EngineerConverter engineerConverter;


    @Autowired
    EngineerRepository engineerRepository;

    public void saveEngineerNPE() {
        Engineer engineer = null;
        engineer.setName("");
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Engineer getEngineer(SaveEngineerRequestDto saveEngineerDto) {
        Engineer engineer = null;
        engineer = engineerRepository.save(engineer);
        return engineer;
    }

}
