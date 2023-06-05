package com.code16.springjavaedu.secondweek.saturday.oop.intefacekavrami;

public class Client {
    public static void main(String[] args) {


        TurkcellSendMessage turkcellSendMessage = new TurkcellSendMessage();
        turkcellSendMessage.sendMessageWithMail();
        turkcellSendMessage.sendMessageWithSms();






    }
}
