package com.code16.springjavaedu.fifthweek.saturday.springbootexception;

import com.code16.springjavaedu.fifthweek.saturday.myexception.UserException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServices {


    public String getDoctorByName(String name, String lastName) {

        List<Doctor> doctors = DoctorRepository.doctors;
        Optional<Doctor> doctor = doctors
                .stream()
                .filter(doctorInner -> doctorInner.getName().equals(name) && doctorInner.getLastname().equals(lastName))
                .findFirst();

        if(!doctor.isPresent()){
            throw new UserException("Kullanıcı kaydı bulunamadı");
        }
            return doctor.get().getName();


    }
}
