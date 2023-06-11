package com.code16.springjavaedu.secondweek.saturday.personarchitect;

public class Client {
    public static void main(String[] args) {

        System.out.println("Engineer maasşı hesaplanıyor");

        MaasHesaplamaService maasHesaplamaService = new MaasHesaplamaService();

//        Engineer engineer = new Engineer();
//        engineer.setAdi("Murat");
//        maasHesaplamaService.maasHesapla(engineer, 7);

        Manager manager = new Manager();
        manager.setAdi("Ahmet");
        manager.setOdasininKati(2);
        maasHesaplamaService.maasHesapla(manager, 5);


        Employee muhasebe = new Muhasebe();
        muhasebe.setAdi("Meral");
        maasHesaplamaService.maasHesapla(muhasebe, 8);






    }
}
