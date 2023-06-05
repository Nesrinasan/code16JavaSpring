package com.code16.springjavaedu.secondweek.saturday.oop.polimorfizm;

import com.code16.springjavaedu.secondweek.saturday.oop.thissuper.bitkihiyerarsi.*;

public class Downcasting {

    public static void main(String[] args) {
        /**
         * birbirinden kalıtım alan sınıflar üzerinde de upcasting, downcasting işlemleri yapılabilir.
         *
         */

        //Upcasting: bir nesnenin refreansını bir üst nesneye atama işlemidir.
        //UpCastingte client gerçek nesneyi bilmek zorunda kalmadan işlem yapabilir.
        //polymorfizm sadece nesneler üzerinde olmaz. methodlarda olur. farklı imp. olan methodlar örnek.
        // Flower flower = new Rose("Red");

        //Downcasting
//        Rose rose = new Flower("blue"); // bu şekilde downcasting yapamam.
//
        /**
         * yanlış downcasting yöntemi.
         */
//        Flower flowerr = (Rose) new Flower("Blue");
//        System.out.println(flowerr);


        Flower flower2 = new Flower("");
        Rose flower21 = (Rose) flower2;


        /**
         * ikinci tip downcasting yöntemi.
         */
        Flower flower1 = new Rose("red");
        Rose flower11 = (Rose) flower1;
        flower11.smell();
        flower1.smell();


        Meyve meyveKarpuz = new Karpuz("Diyarbakır");

        if(meyveKarpuz instanceof Karpuz){
            Karpuz karpuz = (Karpuz)meyveKarpuz;
            int adet = karpuz.adet;
        }


        //upcasting işleminde hiyerarşi önceliği önemlidir.
        Rose rose = new Rose("");
        Flower roseFlower = new Rose("");
        if (rose instanceof Flower) {
            System.out.println("");


        } else if (rose instanceof FlowerBase) {
            System.out.println("");
        }

        if (rose instanceof FlowerBase) {
            System.out.println("flowerbase içerisine girer");
        } else if (rose instanceof Flower) {
            System.out.println("");
        }
    }
}
