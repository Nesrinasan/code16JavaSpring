package com.code16.springjavaedu.thirdweek.saturday.javatype;


import com.code16.springjavaedu.thirdweek.saturday.designpatterns.builder.Ogretmen;

public class JavaType {
    /**
     * is JAva pass by value or pass by reference
     */
    public static void main(String[] args) {
//        int i = 5;
//        System.out.println("i'nin değeri" + i);
//        test(i);
//        System.out.println("i'nin methoddan dönüşü" + i);

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setAdi("Mahmut");
        System.out.println("ogremenin adı: " + ogretmen.getAdi());
        test(ogretmen);
        System.out.println("method dönüşü ogremenin adı: " + ogretmen.getAdi());

    }

    private static void test(Ogretmen ogretmen) {
        ogretmen.setTckn(1212);
        System.out.println("method içerisinde ogremenin adı: " + ogretmen.getAdi());

    }

    private static void test(int i) {
        i++;
        System.out.println("i'nin yeni değeri" + i);
    }
}
