package com.code16.springjavaedu.thirdweek.saturday.designpatterns;

import com.code16.springjavaedu.thirdweek.saturday.designpatterns.builder.Ogretmen;

public class test {
    public static void main(String[] args) {
        Ogretmen ogretmen = new Ogretmen();
    }
}

/**
 * State Design Pattern, bir nesnenin o anki durumuna bağlı olarak çalışma zamanında(runtime)
 * davranışını tamamen değiştirmesini sağlayan bir tasarım desenidir.
 * televizyon kumandasındaki açılış ve kapanış tuşunun aynı tuş olmasına rağmen televizyonun
 * açık yahut kapalı olması durumlarına göre farklı davranışlar sergilemesini düşünebiliriz.
 * Bu tuşa basıldığında televizyon açıksa eğer kapatılacak yok eğer kapalıysa açılacaktır.
 */

