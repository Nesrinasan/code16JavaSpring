package com.code16.springjavaedu.secondweek.saturday.oop.constructur;

import java.util.Scanner;

public class IslemTest {

    /**
     * Bana bir adet servis ver. Bu servis kendisine verdiğim iki sayının toplamını, çarpımını, bölümünü, çıkarmasını yapsın.
     * Ama servis default olarak her zaman iki sayıyı toplasın buna hep ihtiyacım var.
     * çarpma bölme gibi işlemlere ihtiyaıcm oldukca başvuracağım.
     * Ayrıca çıkarma sonucu negatif olamaz. Negatiflik durumunda verileri yanlış girdiğmizi belirten bir  mesaj verelim.
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        DortIslemService dortIslemService = new DortIslemService(sayi1, sayi2);
        int toplam = dortIslemService.getToplam();
        System.out.println(toplam);

        dortIslemService.setCarp(sayi1, sayi2);
        int carp = dortIslemService.getCarp();
        System.out.println(carp);

    }
}
