package com.code16.springjavaedu.thirdweek.saturday.intefacekavrami;

public class VodafoneSendMessage implements ISendMessage{
    @Override
    public void sendMessageWithSms() {
        System.out.println("Vodafone sms gönderiyor");

    }

    @Override
    public void sendMessageWithMail() {
        System.out.println("Vodafone mail gönderiyor");

    }
}
