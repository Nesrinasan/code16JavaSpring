package com.code16.springjavaedu.thirdweek.saturday.designpatterns.nonfactory;

public class Client {

    public static void main(String[] args) {

        SendMessageService sendMessageService = new SendMessageService();

        SendMessageMail sendMessageMail = new SendMessageMail();

        SendMessageFax sendMessageFax = new SendMessageFax();

        SendMessageSms sendMessageSms = new SendMessageSms();

        sendMessageService.sendSms(sendMessageSms);

        sendMessageService.sendSms(sendMessageMail);






    }

}
