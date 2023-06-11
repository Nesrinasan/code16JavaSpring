package com.code16.springjavaedu.thirdweek.saturday.designpatterns.state;

public class Client {

    public static void main(String[] args) {
        Oyun oyun = new Oyun();
        oyun.ucgen();
        oyun.x();
        oyun.topuKaptir();

        oyun.x();
        oyun.kare();
        oyun.topuKap();

    }




}
