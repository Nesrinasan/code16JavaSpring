package com.code16.springjavaedu.secondweek.saturday.personarchitect;

public class Manager extends Employee{

    int odasininKati;
    private final int maasKatSayisi = 1500;

    @Override
    public int maasHesaplama() {
        return maasKatSayisi * calistigiYil;

    }

    public int getOdasininKati() {
        return odasininKati;
    }

    public void setOdasininKati(int odasininKati) {
        this.odasininKati = odasininKati;
    }
}
