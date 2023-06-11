package com.code16.springjavaedu.thirdweek.saturday.intefacekavrami;

public class Client {
    public static void main(String[] args) {

        ISendMessage turkcellSendMessage = new TurkcellSendMessage();
        turkcellSendMessage.sendMessageWithMail();
        turkcellSendMessage.sendMessageWithSms();

        VodafoneSendMessage vodafoneSendMessage = new VodafoneSendMessage();
        vodafoneSendMessage.sendMessageWithMail();

    }
}
