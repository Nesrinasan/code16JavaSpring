package com.code16.springjavaedu.secondweek.saturday.oop.method;

import java.util.Scanner;

public class MethodYapisi {
    public static void main(String[] args) {
        /**
         * Methodlar nesnelere ait davranış bildiren iş birimleridir.
         */
        int ilkToplamaIslemininSonucu = toplamaIslemi();
        int test = ikiSayininToplami(ilkToplamaIslemininSonucu, 3);
        int[] arrDizi = new int[5];
        carpma("nesrn", arrDizi);

    }



    public static int toplamaIslemi() {
        int toplam = 5 + 6;
        return toplam;

    }

    public static int ikiSayininToplami(int ilkSayi, int ikinciSayi) {
        int toplam = ilkSayi + ikinciSayi;
        System.out.println(toplam);
        return toplam;
    }

    public static int toplamaIslemi(int ilkSayi, int ikinciSayi) {
        int toplam = ilkSayi + ikinciSayi;
        System.out.println(toplam);
        return toplam;
    }

    public static void toplama() {
        toplamaIslemi(3, 4);
        int ilkSayi = 5;
        int ikinciSayi = 10;
        int toplam = ilkSayi + ikinciSayi;
        System.out.println(toplam);
    }

    /**
     * Method imzası: methodun adı ve parametre listesinden oluşur.
     * imza: methodAdı(toplamaIslemi) ve methodParam(int ilkSayi, int ikinciSayi)
     * NOT: aynı method imzasına sahip iki method yazılamaz.
     * Aynı isimle bir methodu farklı parametrelerle yazarsak overload etmiş oluruz.
     */



    public static int toplamaIslemi(String ilkSayi, int ikinciSayi) {
        int toplam = Integer.valueOf(ilkSayi) + ikinciSayi;
        System.out.println(toplam);
        return toplam;
    }

    /**
     * overload örneği
     */
    public static int toplamaIslemi2(int ilkSayi, int ikinciSayi) {
        int toplam = ilkSayi + ikinciSayi;
        System.out.println(toplam);
        return toplam;
    }



    public static void hesapla(int shortDeger) {
        System.out.println("int değeri aldı: " + shortDeger);
    }

    /**
     * dönüş tipi farklı olması overload yapısını etkilemez.
     * çunku methodun kullanıldığı yerde return tipi kullanım zorunluğu yok.
     */

    public static void hesapla(short shortDeger) {
        System.out.println("short değeri aldı: " + shortDeger);
    }

    public static void hesapla(long shortDeger) {
        System.out.println("long değeri aldı: " + shortDeger);
    }


    /**
     * Method yazarken dikkat edilmesi gerekenler:
     * 1) SOLID prensiplerine uymamız gerekir.
     * S harfi(Single responsibility)
     * 2) MEthod parametre sayısına dikkat edilmeli
     * 3) Bir sınıfta  15, 20 adetten fazla method olmamalı.
     * .
     * .
     * .
     */
    public void carpmaIslemi(int ilkSayi, int ikinciSayi, int ucuncuSayi, int dorduncuSayi) {
        int toplam = ilkSayi + ikinciSayi;
        System.out.println(toplam);
    }


    /**
     * kullanıcıdan 2 veri alalım.
     * toplamı 5 ten küçükse sonucun 2 ile kalanı ekrana yazdır.
     * toplam 5 ten büyükse sonucun üzerine kendisi kadar değer ekle
     */

    public void kullaniciVerisiIsleme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcıdan ilk veri al");
        int sayi = scanner.nextInt();
        System.out.println("Kullanıcıdan ikinci veri al");
        int sayi2 = scanner.nextInt();

//        int toplam = sayi + sayi2;
        int toplam = toplamaYap(sayi, sayi2);

        karsilastirma(toplam);
        scanner.close();

    }

    public int toplamaYap(int ilkSayi, int ikinciSayi) {
        int toplam = ilkSayi + ikinciSayi;
        return toplam;

    }

    public void karsilastirma(int toplamDegeri) {
        if (toplamDegeri < 5) {
            int kalan = toplamDegeri % 2;
            System.out.println("kalan değeri:" + kalan);
        } else {
            toplamDegeri += toplamDegeri;
            System.out.println("toplam değeri" + toplamDegeri);
        }
    }

    /**
     * Değişen sayıda argüman alan method
     */

    public static void carpma(String str, int... sayilar) {
        int carpim = 1;
        for (int sayi : sayilar) {
            carpim *= sayi;
        }

        System.out.println(carpim);

    }

}
