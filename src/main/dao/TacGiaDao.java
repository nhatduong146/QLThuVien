
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
import main.model.TacGia;

/**
 *
 * @author Duong
 */
public class TacGiaDao {

    private Connection con = KetNoiSQL.getConnection();

    public List<TacGia> getAll() {
        List<TacGia> list = new ArrayList<>();
        String sql = "SELECT * FROM tblTacGia";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new TacGia(rs.getString(1), rs.getString(2)));
            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void insert(TacGia tacGia) {
        String sql = "EXECUTE spInsert_tblTacGia ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tacGia.getHoten());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(TacGia tacGia) {
        String sql = "Update tblTacGia SET TenTacGia = ? WHERE MaTacGia = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tacGia.getHoten());
            ps.setString(2, tacGia.getMaTG());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(String maTG) {
        String sql = "DELETE FROM tblTacGia WHERE maTacGia = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, maTG);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<TacGia> findByName(String name) {
        List<TacGia> list = new ArrayList<>();
        String sql = "SELECT * FROM tblTacGia WHERE TenTacGia LIKE CONCAT( '%',?,'%')";
        System.out.println(name);
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new TacGia(rs.getString(1), rs.getString(2)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        TacGiaDao tacGiaDao = new TacGiaDao();
        System.out.println(tacGiaDao.getAll());
        System.out.println(tacGiaDao.findByName("Ng"));
    }
}
