package com.code16.springjavaedu.thirdweek.sunday.genelbakis.di;

public class ExceptionReporter {

    OracleDB oracleDB;
    MysqlDB mysqlDB;
    ConnectionService connectionService;

    public ExceptionReporter(){
        connectionService = new ConnectionService();
        String oracleConn = connectionService.connection("Oracle");
        oracleDB = new OracleDB(oracleConn);
        mysqlDB = new MysqlDB();
    }

    public void exceptionReportOracle(){
        oracleDB.report();
    }

    public void exceptionReportMysql(){
        mysqlDB.report();
    }
}
