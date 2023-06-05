package com.code16.springjavaedu.secondweek.saturday.oop.thissuper.bitkihiyerarsi;

public class Karpuz extends Meyve{

    public int adet;
    public static final int karpuzKilogramFiyati = 10;

    public Karpuz(String cinsi) {
        super(cinsi);
    }

    public Karpuz(int adet, String cinsi){
        this(cinsi);
        this.adet = adet; //this içerisinde bulunduğu classa ait global değişkenlere erişmek için kullanılabilir

    }

    public Karpuz(String sahibi, String yetistirlmeSekli, String cinsi){
        this(cinsi);
        System.out.println("Karpuyetiştirilme şekli");

        this.adet = adet; //this içerisinde bulunduğu classa ait global değişkenlere erişmek için kullanılabilir

    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public int elimdeKalanPara(int toplamParam){
        int karpuzaOdenenUcret = this.karpuzFiyatiHesapla();
        toplamParam -= karpuzaOdenenUcret;

        return toplamParam;
    }

    private int karpuzFiyatiHesapla(){
        int karpuzFiyati = adet * karpuzKilogramFiyati;
        return karpuzFiyati;

    }




}
