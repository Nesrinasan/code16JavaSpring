package com.code16.springjavaedu.secondweek.saturday.oop.intefacekavrami;

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
