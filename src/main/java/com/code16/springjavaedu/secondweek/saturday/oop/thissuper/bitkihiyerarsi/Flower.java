package com.code16.springjavaedu.secondweek.saturday.oop.thissuper.bitkihiyerarsi;

public class Flower extends FlowerBase {
    private String color;
    private String height;
    public String ad = "Çiçek";

    public Flower(String color){
        this.color = color;
        System.out.println("Çicek oluştu.");
    }


    public void smell(){
        System.out.println("flower smells good");
//        String ad = super.ad;
    }

    public static void fed(){
        System.out.println("flower is fed");
    }

}
