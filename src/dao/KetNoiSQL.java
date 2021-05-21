/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Duong
 */

public class KetNoiSQL {
    private static final String serverName = "DESKTOP-4GDE4UA";
    private static final String databaseNAme = "MANAGE_LIBRARY";
    private static final String userName = "sa";
    private static final String password = "123456";
    
    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://"+serverName+":1433;databasename="+databaseNAme+";"
                    + "username="+userName+";password="+password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    public static void main(String[] args) {
        System.out.println(KetNoiSQL.getConnection());
    }
}
