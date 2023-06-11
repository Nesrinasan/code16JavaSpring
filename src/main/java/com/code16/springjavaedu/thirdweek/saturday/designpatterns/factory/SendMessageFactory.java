package com.code16.springjavaedu.thirdweek.saturday.designpatterns.factory;

import java.util.Objects;

public class SendMessageFactory {


    public static ISendMessage sendFactory(String messageType) {
        if (Objects.equals("FAX", messageType)) {
            ISendMessage sendMessageFax = new SendMessageFax();
            return sendMessageFax;
        } else if (Objects.equals("MAIL", messageType)) {
            ISendMessage sendMessageMail = new SendMessageMail();
            return sendMessageMail;
        }
        return null;
    }


}
