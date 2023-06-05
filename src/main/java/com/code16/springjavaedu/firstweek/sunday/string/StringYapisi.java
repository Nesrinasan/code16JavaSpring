package com.code16.springjavaedu.firstweek.sunday.string;

import com.code16.springjavaedu.secondweek.saturday.oop.Ogretmen;

public class StringYapisi {

    /**
     * Text tutmak için kullanılırlar.
     */

    public static void main(String[] args) {
        /**
         * Çeşitli oluşturulma şekilleri vardır.
         */

        String str1 = new String("Nesrin");
        String str2 = new String("Nesrin");
        String str5 = str1;
        String str3 = "Nesrin";
        String str4= "Nesrin";
        //str1 = "Murat";


//        str5 = str5.substring(0,2);
//        System.out.println(str1);
//        System.out.println(str5);

//        System.out.println("sonuc : " + (str1 == str3));


//        if (str1 == str2) {
//            System.out.println ("yeap");
//        } else {
//            System.out.println ("no");
//        }
//
//        if (str3 == str4) {
//            System.out.println ("yeap");
//        } else {
//            System.out.println ("no");
//        }
//

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.adi = "murat";

        Ogretmen ogretmen1 = new Ogretmen();
        ogretmen1.adi = "murat";

        System.out.println(ogretmen1.equals(ogretmen));
        if (str1.equals(str1)) {
            System.out.println ("yeap");
        } else {
            System.out.println ("no");
        }

//        String a1 = "Burak";
//        String a2 = "Burak";
//
//        if (a1 == a2) {
//            System.out.println ("yeap");
//        } else {
//            System.out.println ("no");
//        }

        /**
         * == ve .equals kullanım farkı.
         */

//        if (str.equals(str1)) {
//            System.out.println ("yeap");
//        } else {
//            System.out.println ("no");
//        }

        /**
         * substring kullanımı
         */

//        String cumle = "Bu bir cümledir";
//        cumle = cumle.substring(3,8);//index önemli.
//        System.out.println(cumle);

        /**
         * String immutable
         */

        String name = "Nesrin";
        name = "Ahmet" + " Aşan";
        System.out.println(name);
        //Hafızada Nesrin ve Nesrin Aşan eklenmiş oldu.
//
//        String firstName = new String("Burak");// A11
//        firstName = "Burak"; //B11
//        firstName = new String("Burak"); //A12
//        firstName = "Burak";//B11
//
//        System.out.println(firstName);
//
//        String var = "son durumdaki sayac degeri= ";
//        for (int i = 0; i < 10; i++) {
//            var = var + i;
//            System.out.println(var);
//        }
//
//        /**
//         * String builder kullanımı
//         */
//        StringBuilder stringBuilder = new StringBuilder("son durumdaki sayac degeri= ");
//        for (int i = 0; i < 10; i++) {
//            stringBuilder.append(i);
//            System.out.println(stringBuilder.toString());
//        }

        String isim = "Nesrin" + "Aşan";
        System.out.println(isim);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nesrin");
        stringBuilder.append("Aşan");

    }


}
