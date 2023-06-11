package com.code16.springjavaedu.thirdweek.saturday.intefacekavrami;

public class TurkcellSendMessage implements ISendMessage{

    @Override
    public void sendMessageWithSms() {
        System.out.println("Turkcell sms gönderiyor");
    }

    @Override
    public void sendMessageWithMail() {
        test();
        System.out.println("Turkcell mail gönderiyor");

    }


}
