package com.code16.springjavaedu.secondweek.saturday.oop;

public class Ogretmen {

    public String adi;
    public int yasi;

    public Ogretmen(){
    }

    /**
     * method adı: okulaGit
     * method return type: void
     */
    public void okulaGit(){
        System.out.println("Öğretmen saat 9 da okula gider.");
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}
