package com.code16.springjavaedu.thirdweek.sunday.genelbakis.annotations.beansingleton;


import org.springframework.stereotype.Service;

@Service
public class DoctorServicess {

    private final EmployeeService employeeService;

    public DoctorServicess(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void getEmployeeValue(){
        System.out.println(this.employeeService);
    }

}
