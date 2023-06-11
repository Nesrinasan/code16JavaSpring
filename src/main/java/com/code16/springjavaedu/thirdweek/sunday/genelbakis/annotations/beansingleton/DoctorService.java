package com.code16.springjavaedu.thirdweek.sunday.genelbakis.annotations.beansingleton;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    private final EmployeeService employeeService;

    public DoctorService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void getEmployeeValue(){
        System.out.println(this.employeeService);
    }

}
