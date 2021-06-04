/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.DocGia;
import model.TuaSach;

/**
 *
 * @author Duong
 */
public class TuaSachDao {
    private Connection con = KetNoiSQL.getConnection();
    
    public List<TuaSach> getAll(){
        List<TuaSach> list = new ArrayList<>();
        String sql = "SELECT * FROM tblTuaSach";
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(new TuaSach(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void insert(TuaSach tuaSach){
        String sql = "EXECUTE spInsert_tblTuaSach ?, ?, ?, ?, ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tuaSach.getTenTS());
            ps.setString(2, tuaSach.getMaTG());
            ps.setString(3, tuaSach.getMaTL());
            ps.setString(4, tuaSach.getTomTat());
            ps.setInt(5, tuaSach.getSoLuong());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void update(TuaSach tuaSach){
        String sql = "Update tblTuaSach SET TenTuaSach = ?, MaTacGia = ?, MaTheLoai = ?, TomTat = ?, SoLuong = ? "
                + "WHERE MaTuaSach = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tuaSach.getTenTS());
            ps.setString(2, tuaSach.getMaTG());
            ps.setString(3, tuaSach.getMaTL());
            ps.setString(4, tuaSach.getTomTat());
            ps.setInt(5, tuaSach.getSoLuong());
            ps.setString(6, tuaSach.getMaTS());
            ps.executeUpdate();
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void remove(String maDG){
        String sql = "DELETE FROM tblTuaSach WHERE maTuaSach = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, maDG);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public List<TuaSach> findByName(String name){
        List<TuaSach> list = new ArrayList<>();
        String sql = "SELECT * FROM tblTuaSach WHERE TenTuaSach LIKE CONCAT( '%',?,'%')";
        String tg = "'%" + name + "%'";
        System.out.println(tg);
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(new TuaSach(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
        TuaSachDao tuaSachDao = new TuaSachDao();
        System.out.println(tuaSachDao.findByName("sống"));
        
    }
}
