package com.code16.springjavaedu.thirdweek.sunday.genelbakis.di;

public class ExceptionReporter3 {
    /**
     * Dependency injection example
     */
    Database database;

    public ExceptionReporter3(Database database){
        this.database = database;
    }

    public void exceptionReport(){
        database.report();
    }

}
