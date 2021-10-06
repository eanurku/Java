package com.anurag;

import com.anurag.models.DBType;
import com.anurag.models.MySqlHelper;
import com.anurag.models.ReportType;

import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class FacadeDemo
{
    public static void main( String[] args ) {

        //before facade
        MySqlHelper mysqlHelper=new MySqlHelper();
        Connection conn = MySqlHelper.getDbConnection();
        mysqlHelper.getExelReport("Employee",conn);

        System.out.println("-----------------");
        //after Facade
        HelperFacade.getReport(DBType.MYSQL, ReportType.EXEL,"Employee");



    }
}
