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
import main.model.DocGia;

/**
 *
 * @author Duong
 */
public class DocGiaDao {
    private Connection con = KetNoiSQL.getConnection();
    
    public List<DocGia> getAll(){
        List<DocGia> list = new ArrayList<DocGia>();
        String sql = "SELECT * FROM tblDocGia";
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(new DocGia(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), 
                                        rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void insert(DocGia docGia){
        String sql = "EXECUTE spInsert_tblDocGia ?, ?, ?, ?, ?, ?, ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, docGia.getHoten());
            ps.setString(2, docGia.getGioiTinh());
            ps.setString(3, docGia.getNgaySinh());
            ps.setString(4, docGia.getDiaChi());
            ps.setString(5, docGia.getSdt());
            ps.setString(6, docGia.getNgayDK());
            ps.setString(7, docGia.getNgayHetHan());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public void update(DocGia docGia){
        String sql = "Update tblDocGia SET HoTenDG = ?, GioiTinh = ?, NgaySinh = ?, "
                + "DiaChi = ?, SoDienThoai = ?, NgayDangKi = ?, NgayHetHanDk = ?"
                + " WHERE maDocGia = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, docGia.getHoten());
            ps.setString(2, docGia.getGioiTinh());
            ps.setString(3, docGia.getNgaySinh());
            ps.setString(4, docGia.getDiaChi());
            ps.setString(5, docGia.getSdt());
            ps.setString(6, docGia.getNgayDK());
            ps.setString(7, docGia.getNgayHetHan());
            ps.setString(8, docGia.getMaDG());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public void remove(String maDG){
        String sql = "DELETE FROM tblDocGia WHERE maDocGia = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, maDG);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public List<DocGia> findByName(String name){
        List<DocGia> list = new ArrayList<>();
        String sql = "SELECT * FROM tblDocGia WHERE HoTenDG LIKE CONCAT( '%',?,'%')";
        System.out.println(name);
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(new DocGia(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), 
                                        rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static void main(String[] args) {
        DocGiaDao docGiaDao = new DocGiaDao();
        System.out.println(docGiaDao.findByName("Cường"));
    }
}
