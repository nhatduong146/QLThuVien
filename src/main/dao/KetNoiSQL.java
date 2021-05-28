/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Duong
 */

public class KetNoiSQL {
    private static final String serverName = "DAUCONG";
    private static final String databaseNAme = "Library";
    private static final String userName = "daucong";
    private static final String password = "110901";
    
    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=Library;"
                    + "username=daucong;password=110901");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    public static void main(String[] args) {
        System.out.println(KetNoiSQL.getConnection());
    }
}
