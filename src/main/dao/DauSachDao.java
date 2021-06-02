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
import main.model.DauSach;
import main.model.DauSach;

/**
 *
 * @author Duong
 */
public class DauSachDao {

    private Connection con = KetNoiSQL.getConnection();

    public List<DauSach> getAll() {
        List<DauSach> list = new ArrayList<>();
        String sql = "SELECT * FROM tblDauSach";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new DauSach(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void insert(DauSach dauSach) {
        String sql = "EXECUTE spInsert_tblDauSach ?, ?, ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dauSach.getMaTS());
            ps.setString(2, dauSach.getNgonNgu());
            ps.setString(3, dauSach.getMaNXB());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(DauSach dauSach) {
        String sql = "Update tblDauSach SET MaTuaSach = ?, NgonNgu = ?, MaNXB = ? WHERE MaDauSach = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dauSach.getMaTS());
            ps.setString(2, dauSach.getNgonNgu());
            ps.setString(3, dauSach.getMaNXB());
            ps.setString(4, dauSach.getMaDS());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(String maDS) {
        String sql = "DELETE FROM tblDauSach WHERE MaDauSach = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, maDS);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public List<DauSach> findByName(String mads){
        List<DauSach> list = new ArrayList<>();
        String sql = "SELECT * FROM tblDauSach WHERE MaTuaSach= ?";
        System.out.println(mads);
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mads);
            rs = ps.executeQuery();
            
            while(rs.next()){
                 list.add(new DauSach(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int getTotalItem(){
        String sql = "SELECT COUNT(MaDauSach)\n" +
                        "FROM tblDauSach";
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next())
                return rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int getTotalPage(int maxPageItem){
        if(getTotalItem()%maxPageItem == 0)
            return getTotalItem()/maxPageItem;
        else
            return getTotalItem()/maxPageItem + 1; 
    }
    
    public List<DauSach> getByPage(int maxPageItem, int page){
        List<DauSach> list = new ArrayList<DauSach>();
        String sql =    "SELECT * FROM tblDauSach\n" +
                        "Order by MaDauSach\n" +
                        "OFFSET ? ROWS\n" +
                        "FETCH NEXT ? ROWS ONLY";
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, (page-1)*maxPageItem);
            ps.setInt(2, maxPageItem);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                list.add(new DauSach(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        DauSachDao dauSachDao = new DauSachDao();
        System.out.println(dauSachDao.getByPage(5, 2));
    }
}
