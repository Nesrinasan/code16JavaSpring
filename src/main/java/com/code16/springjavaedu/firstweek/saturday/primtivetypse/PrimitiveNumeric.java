package com.code16.springjavaedu.firstweek.saturday.primtivetypse;

public class PrimitiveNumeric {

    public static void main(String[] args) {

        //---------------------------------- TAM SAYILAR -----------------------------------
        /**
         * byte : -2^8 ile 2^8
         */
        byte byteValue = 127;
     //   System.out.println("byte value:" + byteValue);

        /**
         * short : -2^16 ile 2^16
         */
        short shortValue = 10000;
       // System.out.println("short value:" + shortValue);

        /**
         * int : -2^31 ile 2^31-1
         * bir değişkene direkt bir tam sayı değeri atanırsa default olarak int tipinden işlem görür.
         */
        int sayi = 556464654;
     //   System.out.println("sayi:" + sayi);

        /**
         * long : -2^64 ile 2^64
         */
        long longValue = 556464654;
      //  System.out.println("long value:" + longValue);


        //---------------------------------- KAYAN NOKTALI SAYILAR -----------------------------------


        /**
         * float -2^32 ile 2^32
         */
        float floatValue = 1.1f;
      //  System.out.println("Float Value" + floatValue);

        /**
         * double : -2^64 ile 2^64
         */
        double doubleValue = 1.1;
        //System.out.println("Double value:" + doubleValue);

        /**
         * NOT: Double ve float gerçek sayılar kümesinin elemanlarını tutarlar.
         * Yani 1.2 ile 2.1 arasında sonsuz sayıda değer vardır.
         * Bilgisayarında tutabileceği sayı değeri sınırlıdır.
         * Bu sebeple matematiğin doğasından kaynaklı aksamalar yaşanabilir.
         * Kullanırken dikkat etmek gerekir. Bigdecimal yapıları daha çok kullanılır profesyonel yaşamda
         */

        Double aDouble = 0.1d + 0.1d + 0.1d+ 0.1d+ 0.1d+ 0.1d + 0.1d ;//aynı durumu float olarak dene.
        System.out.println("sayının değeri: " + aDouble);

        Float floatValues = 0.1f + 0.1f + 0.1f+ 0.1f+ 0.1f+ 0.1f + 0.1f ;//aynı durumu float olarak dene.
        System.out.println("sayının değeri: " + floatValues);

        /**
         * _ kullanımı.
         * Java 7 ile beraber büyük sabit sayılarda kolaylık olması açısından sayılarda rakamlar arası _ işareti konulabilmeye başlandı
         * ancak bu ifadeyi şu durumlarda kullanmamalıyız.
         * başta ve sonda, "." nın yanında f, F, d, D gibi ifadelin yanında kullanılmaz. çünkü amacı sayıları ayırmak.
         */
        int sayiValue = 10_000_000;


    }
}
