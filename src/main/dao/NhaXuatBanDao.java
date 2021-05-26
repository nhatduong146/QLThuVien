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
import main.model.TuaSach;

/**
 *
 * @author Duong
 */
public class NhaXuatBanDao {

    private Connection con = KetNoiSQL.getConnection();

    public List<NhaXuatBan> getAll() {
        List<NhaXuatBan> list = new ArrayList<>();
        String sql = "SELECT * FROM tblNhaXuatBan";
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new NhaXuatBan(rs.getString(1), rs.getString(2)));
            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void insert(NhaXuatBan nhaXuatBan){
        String sql = "EXECUTE spInsert_tblNhaXuatBan ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nhaXuatBan.getTenNXB());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update(NhaXuatBan nhaXuatBan){
        String sql = "Update tblNhaXuatBan SET TenNXB = ? WHERE MaNXB = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nhaXuatBan.getTenNXB());
            ps.setString(2, nhaXuatBan.getMaNXB());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void remove(String maNXB){
        String sql = "DELETE FROM tblNhaXuatBan WHERE maNXB = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, maNXB);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public List<NhaXuatBan> findByName(String name){
        List<NhaXuatBan> list = new ArrayList<>();
        String sql = "SELECT * FROM tblNhaXuatBan WHERE TenNXB LIKE CONCAT( '%',?,'%')";
        System.out.println(name);
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(new NhaXuatBan(rs.getString(1), rs.getString(2)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        NhaXuatBanDao nhaXuatBanDao = new NhaXuatBanDao();
        nhaXuatBanDao.remove("NXB016");
    }
}
