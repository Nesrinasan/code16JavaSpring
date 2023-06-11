package com.code16.springjavaedu.thirdweek.saturday.collections.dizi;

import com.code16.springjavaedu.thirdweek.saturday.designpatterns.builder.Ogretmen;

public class Diziler {

    public static void main(String[] args) {

        /**
         * Aynı türden verileri tutarlar
         * Sıralı tutarlar
         * uzunlukları sabittir. Başlarken verilmelidir.
         * @param args
         */

        /**
         * Sabit bir uzunluk verilir.
         * Uzunluk negatif olamaz.
         * Dizinin ilk indexi 0'dan başlar.
         */

        Integer[] dd = {4,5,8};
        dd[0] = 55;
        System.out.println(dd[0]);

        int[] sayiDizi = new int[3];
        sayiDizi[1] = 4;
        sayiDizi[2] = 5;
//        sayiDizi[3] = 8;
        System.out.println();
       // sayiDizi[3] = 10; // 3. indexi yoktur. Runtime hatası alır.

        Integer[] strDizisi = {3,4,5};

        /**
         * nesne tanımlanabilir
         */
        Ogretmen[] ogretmenDizisi = new Ogretmen[2];
        ogretmenDizisi[1] = new Ogretmen();


        /**
         * dizinin son değerini alma
         */
        int[] arrDizi = new int[5];
        arrDizi[0] = 28;
        arrDizi[arrDizi.length-1] = 234;

        System.out.println("dizinin ilk elemanı: " + arrDizi[0]);



        int[] arr = new int[5];
        char c='c';
        long longValue=10;
        String str = "Doruk";

        arr[1] = c;
       // arr[3]= longValue;
        //arr[4]= str;
        System.out.println (arr[0] + " " + arr[1]+ " " + arr[2] + " " +arr[3]);
        System.out.println((int) c);


        /**
         * Dizi uzunluğu .length methodu ile alınır.
         */
        int[] dizi = new int[5];
        int length = dizi.length;
//        System.out.println("Dizinin uzunluğu:" + length);


        /**
         * Dizi uzunluğu
         */
        Integer[] dizi2 = new Integer[5];
        dizi2[0] = 5;
        dizi2[1] = 23;
        dizi2[2] = 12;
        dizi2[3] = 213;
        dizi2[4] = 2156;

        for (int i = 0; i <= dizi2.length-1; i++) {
            int dizininDegeri = dizi2[i];
            System.out.println(dizininDegeri);
        }

        System.out.println("dizi2 nin 1. indexi, 2. elemanı: " + dizi2[1]);

        Integer ikinciDeger = dizi2[1];
        Integer ikinciIndexDegeri = dizi2[2];


        int toplam = dizi2[1] + ikinciIndexDegeri;
        System.out.println(toplam);


        String[] isimDizisi = {"Nesrin", "Burak", "Doruk"};
        for (String isim : isimDizisi) {
            System.out.print(isim);
        }
    }
}
