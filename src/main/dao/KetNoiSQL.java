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
    private static final String serverName = "DESKTOP-7H6RADQ\\TRANTHITHULUYEN";
    private static final String databaseNAme = "Library";
    private static final String userName = "sa";
    private static final String password = "tttl1209ntk";
    
    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=Library;"
                    + "username=sa;password=tttl1209ntk0208");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    public static void main(String[] args) {
        System.out.println(KetNoiSQL.getConnection());
    }
}
