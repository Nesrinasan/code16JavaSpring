package com.code16.springjavaedu.firstweek.saturday.endofclass;

import java.util.Random;

public class Asks {

    public static void main(String[] args) {

        /**
         * Soru: Çıktısı
         */
        //   System.out.println(23 + 2 + "Merhaba");

        /**
         * soru
         */
        int h = 0;
        while (h < 10) {
            System.out.println(h);

            if (h * 2 == 10) {
                break;
            }
            h++;
        }

        /**
         * soru: Çıktısı ne olur?
         *
         */
        Random random = new Random();
        int sayi = random.nextInt(10);
        switch (4) {
            case 1:
                System.out.println("Ahmet");
                break;
            case 2:
                System.out.println("Ahmet");
            case 3:
                break;
            case 4:
                System.out.println("Mehmet");
            case 6:
                System.out.println("Murat");
            default:
                System.out.println("Doruk");

        }

        /**
         * soru: 1, 2, 3....20 ye kadar olan sayıların toplamı?
         *
         */
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum * i;
        }

        System.out.println(sum);


        /**
         * çıktısı ne olur?
         */
        int deger = 0;
        for (int i = 0; i < 10; i++) {
            deger = deger + i;
        }
        System.out.println(deger);
    }
}
