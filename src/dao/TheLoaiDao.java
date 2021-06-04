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
import model.TheLoai;

/**
 *
 * @author Duong
 */
public class TheLoaiDao {

    private Connection con = KetNoiSQL.getConnection();

    public List<TheLoai> getAll() {
        List<TheLoai> list = new ArrayList<>();
        String sql = "SELECT * FROM tblTheLoai";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new TheLoai(rs.getString(1), rs.getString(2)));
            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void insert(TheLoai theLoai) {
        String sql = "EXECUTE spInsert_tblTheLoai ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, theLoai.getTenTL());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(TheLoai theLoai) {
        String sql = "Update tblTheLoai SET TenLoaiSach = ? WHERE MaTheLoai = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, theLoai.getTenTL());
            ps.setString(2, theLoai.getMaTL());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(String maTG) {
        String sql = "DELETE FROM tblTheLoai WHERE maTheLoai = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, maTG);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<TheLoai> findByName(String name) {
        List<TheLoai> list = new ArrayList<>();
        String sql = "SELECT * FROM tblTheLoai WHERE TenLoaiSach LIKE CONCAT( '%',?,'%')";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new TheLoai(rs.getString(1), rs.getString(2)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        
    }
}
