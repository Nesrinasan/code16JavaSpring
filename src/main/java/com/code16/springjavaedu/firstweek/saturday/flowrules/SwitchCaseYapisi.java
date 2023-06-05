package com.code16.springjavaedu.firstweek.saturday.flowrules;

import java.util.Random;

public class SwitchCaseYapisi {
    /**
     * if else if else gibi uzun yapıların muadili olarak kullanılır.
     * switch içerisnde int/string gibi yapılar olmalı
     * @return
     */
    public static void main(String[] args) {

        Random random = new Random();
        int sayi = random.nextInt(100);

        switch (sayi){
            case 1 :
                System.out.println("Sayı 1 case'ine girdi");
                break;
            case 2:
                break;
            case 3:
                System.out.println("Sayı 3 case'ine girdi");
                break;
            default:
                System.out.println("Sayı 1, 2, 3 değerlerini sağlamıyor");

        }

    }


    public void test(){
        String s = "";
        //code
        return ;

    }
}
