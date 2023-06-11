package com.code16.springjavaedu.thirdweek.saturday.collections.map;


import com.code16.springjavaedu.thirdweek.saturday.designpatterns.builder.Ogretmen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetYapisi {

    public static void main(String[] args) {
        /**
         * Hashset
         * List gibidir. Veri depolamak için kullanılır.
         * Lİstten farkı ise aynı elemanları saydırmaz.
         *
         */

        List<String> stringList = new ArrayList<>();
        stringList.add("Nesrin");
        stringList.add("Ayşe");
        stringList.add("Doruk");
        stringList.add("Doruk");
        for (String isim : stringList) {
            System.out.println("list içeirsindeki isim: " + isim);
        }
        System.out.println("Listin uzunluğu: " + stringList.size());

        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Nesrin");
        stringHashSet.add("Ayşe");
        stringHashSet.add(new String("Doruk"));
        stringHashSet.add(new String("Doruk"));

        HashSet<Ogretmen> ss = new HashSet<>();
        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setTckn(12345);

        Ogretmen ogretmen1 = new Ogretmen();
        ogretmen1.setTckn(12345);

        ss.add(ogretmen);
        ss.add(ogretmen1);

        for (String isim : stringHashSet) {
            System.out.println("hashset içeirsindeki isim: " + isim);
        }
        System.out.println("hashset uzunluğu: " + stringHashSet.size());



//        System.out.println("hashsetin uzunluğu:" + stringHashSet.size());
//
//        stringHashSet.add("Nesrin");
//
//        System.out.println("hashsetin uzunluğu:" + stringHashSet.size());//aynı veriden bir adet daha eklerrsem ne olur?

    }
}
