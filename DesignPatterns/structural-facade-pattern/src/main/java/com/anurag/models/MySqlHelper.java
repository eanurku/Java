package com.anurag.models;

import java.sql.Connection;

public class MySqlHelper {

    public static Connection getDbConnection() {

        return null;
    }

    public void getPdfReport(String tableName, Connection conn) {
        System.out.println(String.format("pdf report generated from mysql %s table", tableName));
    }

    public void getExelReport(String tableName, Connection conn) {
        System.out.println(String.format("Exel report generated from oracle %s table", tableName));
    }

}
