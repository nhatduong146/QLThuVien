/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import main.model.NhaXuatBan;

/**
 *
 * @author Duong
 */
public class NhaXuatBanDao {
       public List<NhaXuatBan> getAll(){
           List<NhaXuatBan> list = new ArrayList<>();
           String sql = "SELECT * FROM tblNhaXuatBan";
           Connection connection = null;
           PreparedStatement ps = null;
           ResultSet rs = null;
           
           try {
               connection = KetNoiSQL.getConnection();
               ps = connection.prepareStatement(sql);
               rs = ps.executeQuery();
               
               while (rs.next()) {                   
                   list.add(new NhaXuatBan(rs.getInt(1), rs.getString(2), rs.getString(3)));
               }
               
               return list;
           } catch (Exception e) {
               e.printStackTrace();
           }
           
           return null;
       }
       
       public List<NhaXuatBan> findByName(String name){
           List<NhaXuatBan> list = new ArrayList<>();
           String sql = "SELECT * FROM tblNhaXuatBan WHERE tenNXB LIKE ?";
           Connection connection = null;
           PreparedStatement ps = null;
           ResultSet rs = null;
           
           try {
               connection = KetNoiSQL.getConnection();
               ps = connection.prepareStatement(sql);
               ps.setString(1, sql);
               rs = ps.executeQuery();
               
               while (rs.next()) {                   
                   list.add(new NhaXuatBan(rs.getInt(1), rs.getString(2), rs.getString(3)));
               }
               
               return list;
           } catch (Exception e) {
               e.printStackTrace();
           }
           
           return null;
       }
       
       public void insert(NhaXuatBan nhaXuatBan){
           String sql = "INSERT INTO";
           Connection connection = null;
           PreparedStatement ps = null;
           
           try {
               connection = KetNoiSQL.getConnection();
               ps = connection.prepareStatement(sql);
               ps.setString(1, sql);
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
       
       public static void main(String[] args) {
           NhaXuatBanDao nhaXuatBanDao = new NhaXuatBanDao();
           for(NhaXuatBan nxb : nhaXuatBanDao.getAll())
               System.out.println(nxb);
       }
}
