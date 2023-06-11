package com.code16.springjavaedu.thirdweek.saturday.solid;

public class LiskovSubstitution {

    /**
     * “Alt seviye sınıflardan oluşan nesnelerin,
     * üst sınıfın nesneleri ile yer değiştirdikleri zaman,
     * aynı davranışı sergilemesi gerekmektedir.
     * Türetilen sınıflar, türeyen sınıfların tüm özelliklerini kullanabilmelidir.
     */

    public abstract class Car {

        String otomatikVitesModeli;

        public void run() {
            System.out.println("Run");
        }

        public abstract void OpenAirConditioning();

    }


    public class Murat131 extends Car {


        @Override
        public void OpenAirConditioning() {
            //null
        }
    }

    public class Ferrari extends Car {

        @Override
        public void OpenAirConditioning() {
            System.out.println("air conditioner turned on");

        }
    }

    public void client() {
        Car car = new Murat131();

    }

}
