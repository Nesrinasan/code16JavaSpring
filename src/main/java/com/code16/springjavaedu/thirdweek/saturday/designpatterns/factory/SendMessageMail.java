package com.code16.springjavaedu.thirdweek.saturday.designpatterns.factory;

public class SendMessageMail implements ISendMessage{

    public void sendMessage(){
        System.out.println("mail ile mesaj gönderiliyor ");
    }

}
