package com.code16.springjavaedu.thirdweek.saturday.designpatterns.state;

public class HucumImpl implements Konsol {
    @Override
    public void kareBas() {
        System.out.println("Şut");
    }

    @Override
    public void ucgenBas() {
        System.out.println("Ara pası");

    }

    @Override
    public void yuvarlakBas() {
        System.out.println("Orta aç");

    }

    @Override
    public void xBAs() {
        System.out.println("Kısa pas");

    }
}
