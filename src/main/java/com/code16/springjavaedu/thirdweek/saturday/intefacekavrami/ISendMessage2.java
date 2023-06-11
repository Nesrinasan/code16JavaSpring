package com.code16.springjavaedu.thirdweek.saturday.intefacekavrami;

public interface ISendMessage2 {
    public void sendMessageWithSms();

    public void sendMessageWithMail();


    public default void test(){
        System.out.println("Test");
        test2();

    }

    private static void test2(){
        System.out.println("test2");

    }


}
