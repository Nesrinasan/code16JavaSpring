package com.code16.springjavaedu.thirdweek.saturday.designpatterns.nonfactory;

public class SendMessageService {

    public void sendSms(SendMessageSms sendMessageSms){
        sendMessageSms.sendMessage();
    }

    public void sendSms(SendMessageMail sendMessageMail){
        sendMessageMail.sendMessage();
    }


}
