package com.code16.springjavaedu.thirdweek.saturday.designpatterns.state;

public class DefansImpl implements Konsol {
    @Override
    public void kareBas() {
        System.out.println("Müdehale ediliyor.");
    }

    @Override
    public void ucgenBas() {
        System.out.println("Kaleci açılıyor");

    }

    @Override
    public void yuvarlakBas() {
        System.out.println("Kayarak müdehale");

    }

    @Override
    public void xBAs() {
        System.out.println("MArkaj uygulanıyor");

    }
}
