package com.code16.springjavaedu.thirdweek.saturday.designpatterns.state;

import java.util.Scanner;

public class Cliant1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Durum seçiniz");
        String durum = s.next();
        System.out.println("Buton tipi seçiniz seçiniz");
        String buttonTypeStr = s.next();
        ButtonType buttonType = ButtonType.valueOf(buttonTypeStr);
        if (buttonType.equals(ButtonType.UCGEN)) {
            if (durum.equals("Hucum")) {
                System.out.println("ara pas verilsin");
            } else if (durum.equals("Müdehale")) {
                System.out.println("kaleci açılıyor");
            }
        } else if (buttonType.equals(ButtonType.KARE)) {
            if (durum.equals("Hucum")) {
                System.out.println("şut");
            }
            if (durum.equals("Müdehale")) {
                System.out.println("müdehale eidliyor");
            }
        } else if (buttonType.equals(ButtonType.X)) {
            if (durum.equals("Hucum")) {
                System.out.println("orta pas verilsin");
            }
            if (durum.equals("Müdehale")) {
                System.out.println("arjaj uygulanıyor");
            }
        } else if (buttonType.equals(ButtonType.YUVARLAK)) {
            if (durum.equals("Hucum")) {
                System.out.println("ORta aç");
            }
            if (durum.equals("Müdehale")) {
                System.out.println("Kayarak mudehhale");
            }
        }


    }
}
