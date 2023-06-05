package com.code16.springjavaedu.secondweek.saturday.oop.thissuper.bitkihiyerarsi;

public class Rose extends Flower{
    protected String ad = "Gül";

    public Rose(String color) {
        super(color);
    }

    /**
     * Normalde üst sınıftaki değişken ve methodlara private tanımlanmadığı sürece erişim vardır
     * Peki öyleyse neden super anahhtar kelimesi ile üst sınıfın verisine erişme gereği duyuyorum ????
     * Çünkü üst sınıfın methodunu kullanıp ek olarak veri ekleyebilriim.ve HIDING
     */
    @Override //bu anahtar kelime ile gösterebiliriz.
    public void smell() {
//        super.smell();
        System.out.println("Rose smell is good");
    }

    /**
     * Ovveriding:
     * Nesne methodu nesne methodunu ezer adı ovverriding tir.
     * Class methodu class methodunuj gizler.
     */

    public static void fed() {
        System.out.println("Rose is fed");
    }

    /**
     * super üst sınıfın değişkenlerine erişebilri
     */
    public void info() {
        smell();
        System.out.println("Name:" + ad);//gizleme yapmış oluyorum. child class içerisinde ad tanımlanmamış olsaydı
        //üst sınıftakini super yazmadan alabilirdim.
        System.out.println("Name:" + super.ad);
        // super.color; static verilere erişemem
    }
}
