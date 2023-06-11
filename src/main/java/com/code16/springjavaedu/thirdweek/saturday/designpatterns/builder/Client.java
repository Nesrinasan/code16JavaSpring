package com.code16.springjavaedu.thirdweek.saturday.designpatterns.builder;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        Log log = new Log.Builder().logType("INFO").logMessage("Hata oluştu").build();
        String logMessage = log.getLogMessage();
        if(logMessage == null){

        }
        System.out.println(log.toString());

        Log2 log2 = Log2.builder().logDate(new Date()).logMessage("test hata aldı").build();

    }
}
