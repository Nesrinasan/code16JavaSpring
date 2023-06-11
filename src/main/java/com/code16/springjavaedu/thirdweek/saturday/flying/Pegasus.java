package com.code16.springjavaedu.thirdweek.saturday.flying;

public class Pegasus extends Plane implements CateringInterface{

    boolean isCurrentPassengerBusiness;
    private final int businessAddFare = 500;

    @Override
    public int takeTicket(int personCount) {
        int ticket = super.takeTicket(personCount);
        if(isCurrentPassengerBusiness){
            ticket = ticket + businessAddFare;
        }
        return ticket;
    }

    public boolean isCurrentPassengerBusiness() {
        return isCurrentPassengerBusiness;
    }

    public void setCurrentPassengerBusiness(boolean currentPassengerBusiness) {
        isCurrentPassengerBusiness = currentPassengerBusiness;
    }

    @Override
    public void food(){
        System.out.println("3 saatlik uçuşalrda et menü ikram eder");
    }
}
