package com.code16.springjavaedu.secondweek.saturday.personarchitect;

public class MaasHesaplamaService {


//    public void maasHesapla(Engineer engineer, int calistigiYil){
//        engineer.setCalistigiYil(calistigiYil);
//        int maas = engineer.maasHesaplama();
//        System.out.println(maas);
//
//    }
//
//    public void maasHesapla(Manager manager, int calistigiYil){
//        manager.setCalistigiYil(calistigiYil);
//        int maas = manager.maasHesaplama();
//        System.out.println(maas);
//
//    }


    public void maasHesapla(Employee employee, int calistigiYil){
        employee.setCalistigiYil(calistigiYil);
//        if(employee instanceof Manager){
//            Manager manager = (Manager) employee;
//            System.out.println(manager.getOdasininKati());
//        }

        employee.maasHesaplama();
    }

}
