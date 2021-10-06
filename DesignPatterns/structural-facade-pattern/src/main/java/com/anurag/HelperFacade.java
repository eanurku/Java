package com.anurag;

import com.anurag.models.DBType;
import com.anurag.models.MySqlHelper;
import com.anurag.models.OracleHelper;
import com.anurag.models.ReportType;

import java.sql.Connection;

public class HelperFacade {

    public static void getReport(DBType dbType, ReportType reportType, String tableName) {
        Connection conn;
        switch (dbType) {

            case MYSQL:
                conn = MySqlHelper.getDbConnection();
                MySqlHelper mysqlHelper = new MySqlHelper();
                switch (reportType) {
                    case PDF:
                        mysqlHelper.getPdfReport(tableName, conn);
                        break;
                    case EXEL:
                        mysqlHelper.getExelReport(tableName, conn);
                        break;
                }
                break;
            case ORACLE:
                conn = OracleHelper.getDbConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case PDF:
                        oracleHelper.getPdfReport(tableName, conn);
                        break;
                    case EXEL:
                        oracleHelper.getExelReport(tableName, conn);
                        break;
                }
                break;

        }

    }

}
