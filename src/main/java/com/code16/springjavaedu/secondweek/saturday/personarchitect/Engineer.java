package com.code16.springjavaedu.secondweek.saturday.personarchitect;

public class Engineer extends Employee{


    public void info(){

    }

    @Override
    public void workStyle() {
        super.workStyle();
        System.out.println("Engineer produces projets");
    }

    @Override
    public int maasHesaplama() {
        int maas = super.maasHesaplama();
        maas = maas + (maas * 30) / 100 ;
        return maas;
     }
}
