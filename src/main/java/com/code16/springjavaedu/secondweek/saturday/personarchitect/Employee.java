package com.code16.springjavaedu.secondweek.saturday.personarchitect;

public abstract class Employee {

    private int tckn;
    private String adi;
    private final int CONSTANT = 500;

    protected int calistigiYil;

    public void workStyle(){
        System.out.println("Employee have been working");
    }

    public int maasHesaplama(){
        int maas = calistigiYil * CONSTANT;
        return maas;
    }


    public int getCalistigiYil() {
        return calistigiYil;
    }

    public void setCalistigiYil(int calistigiYil) {
        this.calistigiYil = calistigiYil;
    }

    public int getTckn() {
        return tckn;
    }

    public void setTckn(int tckn) {
        this.tckn = tckn;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}
