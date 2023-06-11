package com.code16.springjavaedu.thirdweek.sunday.genelbakis.annotations;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class PostConstructurAnnotation {

    public static List<String> cityList = new ArrayList<>();

    @PostConstruct
    @Order(2)
    public void testPostConstructur(){
        System.out.println("Context ayağa kalktıktan sonra ilk çağrılan method.");

    }

    @PostConstruct
    @Order(1)
    public void cityList(){
       cityList.add("Adana");
       cityList.add("Mersin");

    }

}
