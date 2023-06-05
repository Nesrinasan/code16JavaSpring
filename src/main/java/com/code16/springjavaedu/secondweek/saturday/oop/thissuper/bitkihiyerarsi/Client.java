package com.code16.springjavaedu.secondweek.saturday.oop.thissuper.bitkihiyerarsi;

public class Client {
    public static void main(String[] args) {
        Karpuz karpuz = new Karpuz("Van");
        karpuz.setAdet(2);
        int i = karpuz.elimdeKalanPara(100);
        System.out.println(i);


    }
}
