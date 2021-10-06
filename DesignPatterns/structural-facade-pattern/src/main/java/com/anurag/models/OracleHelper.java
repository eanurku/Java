package com.anurag.models;

import java.sql.Connection;

public class OracleHelper {

    public static Connection getDbConnection(){

        return null;
    }

    public void getPdfReport(String tableName,Connection conn){
        System.out.println("pdf report generated from oracle");
    }

    public void getExelReport(String tableName,Connection conn){
        System.out.println("Exel report generated from oracle");
    }

}
