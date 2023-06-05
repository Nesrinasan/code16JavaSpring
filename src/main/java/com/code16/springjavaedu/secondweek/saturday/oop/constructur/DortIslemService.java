package com.code16.springjavaedu.secondweek.saturday.oop.constructur;

public class DortIslemService {
    private int toplam;
    private int carp;

    public DortIslemService(int sayi1, int sayi2){
        int toplam = sayi2 + sayi1;
        this.toplam = toplam;

    }


    public int getToplam() {
        return toplam;
    }

    public void setToplam(int toplam) {
        this.toplam = toplam;
    }

    public int getCarp() {
        return carp;
    }

    public void setCarp(int sayi1, int sayi2) {
        this.carp = sayi1 * sayi2;
    }
}
