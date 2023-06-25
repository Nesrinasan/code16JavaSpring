package com.code16.springjavaedu.fifthweek.saturday.springbootexception;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DoctorRepository {
	static List<Doctor> doctors = new ArrayList<>();

	@PostConstruct
	public void addDoctor(){
		Doctor doctor = new Doctor();
		doctor.setName("Nesrin");
		doctor.setLastname("Aşan");
		doctors.add(doctor);


	}


}
