package com.code16.springjavaedu.thirdweek.sunday.genelbakis.di;

public class ExceptionReporter2 {
    /**
     * Dependency injection example
     */
    OracleDB oracleDB;
    MysqlDB mysqlDB;
    PostgreSqlDB postgreSqlDB;

    public ExceptionReporter2(OracleDB oracleDB, MysqlDB mysqlDB, PostgreSqlDB postgreSqlDB){
        this.oracleDB = oracleDB;
        this.mysqlDB = mysqlDB;
        this.postgreSqlDB = postgreSqlDB;
    }

    public void exceptionReportOracle(){
        oracleDB.report();
    }

    public void exceptionReportMysql(){
        mysqlDB.report();
    }

    public void exceptionReportPostgreSql(){
        postgreSqlDB.report();
    }
}
