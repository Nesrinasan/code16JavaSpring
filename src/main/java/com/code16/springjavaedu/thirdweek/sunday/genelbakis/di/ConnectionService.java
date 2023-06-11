package com.code16.springjavaedu.thirdweek.sunday.genelbakis.di;

public class ConnectionService {

    public String connection(String type) {
        if(type.equals("Oracle")){
            return "connection url";
        }

        return null;
    }


}
