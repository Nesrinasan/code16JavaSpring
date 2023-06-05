package com.code16.springjavaedu.secondweek.saturday.oop.encapsulation;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setAdi("Ahmet");
        ogrenci.setNo(2324);

        Ogrenci ogrenci2 = new Ogrenci();
        ogrenci2.setAdi("Ahmet");
        ogrenci2.setNo(2324);




        //Equals HashCode
        System.out.println(ogrenci.equals(ogrenci2));
        System.out.println(ogrenci == ogrenci2);
      //  ogrenci = ogrenci2;
        System.out.println(ogrenci == ogrenci2);

        HashSet<Ogrenci> set = new HashSet();
        set.add(ogrenci);
        set.add(ogrenci2);


    }



}
