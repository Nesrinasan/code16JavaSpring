package com.code16.springjavaedu.firstweek.saturday.flowrules;

import java.util.Random;

public class IfClause {

    /**
     *  Kontrol ifaderleri:
     *  Kontrol yapıları
     *  Karar yapıları ( if-else, switch-case)
     *  Tekrarlama yapıları (for, while, do while)
     *  recursive
     *
     */

    public static void main(String[] args) {

        int ilkSayi = 10;
        int ikinciSayi = 20;

        int toplam = ilkSayi + ikinciSayi;

        if(toplam < 40){
            System.out.println("iki sayının toplamı 40'den küçük");
        }else {
            System.out.println("iki sayının toplamı 40'den büyük");
        }

        Random random = new Random();
//        int sayi = random.nextInt(100);
//        if(sayi < 10){
//            System.out.println("Sayının değeri 10'dan küçüktür.");
//        }else{
//            System.out.println("Sayının değeri 10 dan büyüktür.");
//        }

        /**
         * if, else-if, else
         */
 //sayi = 10
        int sayi = 10;
        if(sayi < 10){
            System.out.println("Sayının değeri 10'dan küçüktür.");
        }else if(sayi == 10){
            System.out.println(" ilk Sayının değeri 10 dur.");
        }else if(sayi == 20){
            System.out.println("Sayının değeri 20 dur.");
        }else if(sayi == 10){
            System.out.println("ikinci Sayının değeri 10 dur.");
        }else if(sayi == 10){
            System.out.println("üçüncü Sayının değeri 10 dur.");
        }else{
            System.out.println("Sayının değeri 10 dan büyüktür.");
        }

        boolean allow = false;
//        if(allow == true){
//            System.out.println ("izin verildi");
//        }else{
//            System.out.println ("izin verilmedi");
//        }
        /**
         * Ternary conditional operator ( Üçlü şartlı işlemci)
         */

        int sayi3 = random.nextInt(100);
        String sonuc = sayi3 > 10 ? " Alınan random sayı 10'dan büyüktür" : "Alınan sayı 10'dan küçüktür.";
        System.out.println(sonuc);
        if(sayi3> 10){
            System.out.println(" Alınan random sayı 10'dan büyüktür");

        }else{
            System.out.println(" Alınan random sayı 10'dan küçüktür");
        }
    }
}
