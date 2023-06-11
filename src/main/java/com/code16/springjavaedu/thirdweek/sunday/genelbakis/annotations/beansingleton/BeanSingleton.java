package com.code16.springjavaedu.thirdweek.sunday.genelbakis.annotations.beansingleton;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanSingleton implements CommandLineRunner {

    private final DoctorService doctorService;
    private final ManagerService managerService;

    public BeanSingleton(DoctorService doctorService, ManagerService managerService) {
        this.doctorService = doctorService;
        this.managerService = managerService;
    }

    @Override
    public void run(String... args) throws Exception {

        doctorService.getEmployeeValue();
        managerService.getEmployeeValue();
    }
}
