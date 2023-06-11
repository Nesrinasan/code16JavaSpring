package com.code16.springjavaedu.thirdweek.saturday.flying;

import jdk.jshell.spi.ExecutionControl;

public abstract class Plane {

    int capacity;
    int fare;
    int passengerCount;

    public int takeTicket(int personCount){
        return personCount * fare;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }


}
