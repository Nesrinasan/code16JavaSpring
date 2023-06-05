package com.code16.springjavaedu.secondweek.saturday.oop.intefacekavrami;

public class TurkcellSendMessage implements ISendMessage{

    @Override
    public void sendMessageWithSms() {
        System.out.println("Turkcell sms gönderiyor");
    }

    @Override
    public void sendMessageWithMail() {
        System.out.println("Turkcell mail gönderiyor");

    }
}
