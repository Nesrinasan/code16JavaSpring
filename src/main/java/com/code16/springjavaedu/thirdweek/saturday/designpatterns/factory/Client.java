package com.code16.springjavaedu.thirdweek.saturday.designpatterns.factory;

public class Client {

    public static void main(String[] args) {

        ISendMessage sms = SendMessageFactory.sendFactory("SMS");
        sms.sendMessage();


    }
}
