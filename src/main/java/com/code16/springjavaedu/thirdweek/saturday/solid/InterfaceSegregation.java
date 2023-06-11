package com.code16.springjavaedu.thirdweek.saturday.solid;

public class InterfaceSegregation {

    /**
     * Aynı göreve sahip interface'ler ayrı oluşturulmalıdır.
     */


}

interface IVehicle {

    public void fly();

    public void floats();

}

class Ship implements IVehicle {
    @Override
    public void fly() {

    }

    @Override
    public void floats() {

    }


//    @Override
//    public void floats() {
//
//    }
//
//    @Override
//    public void height() {
//
//    }
}

/**
 * Doğrusu:
 */

interface IFlyVehicle {
    public void fly();

    public void hasWing();

}

interface IFloatingVehicle {
    public void floats();

    public void height();

}

