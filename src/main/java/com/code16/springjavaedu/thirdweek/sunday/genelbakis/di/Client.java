package com.code16.springjavaedu.thirdweek.sunday.genelbakis.di;

public class Client {


    public static void main(String[] args) {
        ConnectionService connectionService = new ConnectionService();

        ExceptionReporter exceptionReporter = new ExceptionReporter();
        exceptionReporter.exceptionReportOracle();
        exceptionReporter.exceptionReportMysql();

        String oracleConn = connectionService.connection("Oracle");
        OracleDB oracleDB = new OracleDB(oracleConn);
        MysqlDB mysqlDB = new MysqlDB();
        PostgreSqlDB postgreSqlDB = new PostgreSqlDB();
        ExceptionReporter2 exceptionReporter2 = new ExceptionReporter2(oracleDB, mysqlDB, postgreSqlDB);
        exceptionReporter2.exceptionReportMysql();
        exceptionReporter2.exceptionReportOracle();

        Database database = new OracleDB(oracleConn);
        Database postgreSqlDB1 = new PostgreSqlDB();
        ExceptionReporter3 exceptionReporter3 = new ExceptionReporter3(postgreSqlDB1);
        exceptionReporter3.exceptionReport();

    }
}
