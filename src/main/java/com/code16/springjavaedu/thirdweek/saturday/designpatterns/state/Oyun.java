package com.code16.springjavaedu.thirdweek.saturday.designpatterns.state;

public class Oyun {

    private Konsol konsol;

    public Oyun(){
        System.out.println("Oyun başladı");
        konsol = new HucumImpl();
    }

    public void ucgen(){
        konsol.ucgenBas();
    }

    public void kare(){
        konsol.kareBas();
    }
    public void yuvarlak(){
        konsol.yuvarlakBas();
    }
    public void x(){
        konsol.xBAs();
    }


    public void topuKap(){
        System.out.println("Top kapıpldı hücuma çıkılıyor");
        konsol = new HucumImpl();
        
    }

    public void topuKaptir(){
        System.out.println("Top kaptırıldı");
        konsol = new DefansImpl();

    }





}
