package com.code16.springjavaedu.fourthweek.sunday.springbootexception;

import com.code16.springjavaedu.fourthweek.sunday.myException.BusinessException;
import com.code16.springjavaedu.fourthweek.sunday.myException.Doctor;
import org.springframework.stereotype.Service;

@Service("drService")
public class DoctorService {

    public void getDoctorList() {
        Doctor doctor = null;

    }

    public String getDoctorByName(String name) throws BusinessException {
        if (name.startsWith("A")) {
            throw new BusinessException("A ile başlayan Doctor bulunmuyor");
        }

        try {
            Doctor doctor = null;
            doctor.setName(name);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally bloğuna giriş yapıldı");
        }

        Doctor doctor = new Doctor();
        doctor.setName(name);

        return doctor.getName();

    }
}
