/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGUYEN TRONG KHANG
 */
public class LB_Service {
    private Connection con = null;
    LB_User user;
    public LB_Service() {
    user = new LB_User();
        String url = "net.sourceforge.jtds.jdbc.Driver";

        try {

            Class.forName(url);

            String dbUrl = "jdbc:jtds:sqlserver://192.168.1.101:49676/MANAGE_LIBRARY";

            con = (Connection) DriverManager.getConnection(dbUrl);

      } catch (ClassNotFoundException ex) {

            Logger.getLogger(LB_Service.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {

            Logger.getLogger(LB_Service.class.getName()).log(Level.SEVERE, null, ex);

        }}
    public static void main(String a[]){
        new LB_Service();
    }
}
