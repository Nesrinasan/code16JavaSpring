package com.code16.springjavaedu.secondweek.saturday.oop.thissuper.bitkihiyerarsi;

public class ThisSuper {

    public static void main(String[] args) {
        /**
         * This ve super anahtar kelimelerdir.
         * this'in 2 adet kullanımı vardır.
         * 1) içerisinde bulunduğu nesnenin yapılandırıcısını çağırabilriiz
         * 2) içinde bulunduğu nesneye bir feferanstır.
         *
         * Super:
         * üst sınıfın yapılandırıcısına ve üyelerine erişebiliriz.
         *
         * Sadece bir üstteki nesnenin verilerine erişir.
         * super ile statik bağlamdaki verilere erişilemez.
         */

        //     Karpuz karpuz = new Karpuz("Nesrin", "Sera");
        Rose rose = new Rose("red");
        rose.smell();
        System.out.println(rose.ad);


    }
}
