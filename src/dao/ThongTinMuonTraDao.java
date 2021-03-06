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
import model.ThongTinMuonTra;
import model.ThongTinMuonTra;

/**
 *
 * @author Duong
 */
public class ThongTinMuonTraDao {
    private Connection con = KetNoiSQL.getConnection();
    
    public List<ThongTinMuonTra> getAll(){
        List<ThongTinMuonTra> list = new ArrayList<ThongTinMuonTra>();
        String sql = "SELECT * FROM tblMuon";
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(new ThongTinMuonTra(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), 
                                        rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void insert(ThongTinMuonTra thongTinMuonTra){
        String sql = "EXECUTE spInsert_tblMuon ?, ?, ?, ?, ?, ?, ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, thongTinMuonTra.getMaDG());
            ps.setString(2, thongTinMuonTra.getMaDS());
            ps.setInt(3, thongTinMuonTra.getSoLuong());
            ps.setString(4, thongTinMuonTra.getNgayMuon());
            ps.setString(5, thongTinMuonTra.getNgayHenTra());
            ps.setString(6, thongTinMuonTra.getNgayTra());
            ps.setString(7, thongTinMuonTra.getGhiChu());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void update(ThongTinMuonTra thongTinMuonTra){
        String sql = "Update tblMuon SET MaMuon = ?, MaDauSach = ?, SoLuong = ?, "
                + "NgayMuon = ?, NgayHenTra = ?, NgayTra = ?, GhiChu = ?"
                + " WHERE MaMuon = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, thongTinMuonTra.getMaDG());
            ps.setString(2, thongTinMuonTra.getMaDS());
            ps.setInt(3, thongTinMuonTra.getSoLuong());
            ps.setString(4, thongTinMuonTra.getNgayMuon());
            ps.setString(5, thongTinMuonTra.getNgayHenTra());
            ps.setString(6, thongTinMuonTra.getNgayTra());
            ps.setString(7, thongTinMuonTra.getGhiChu());
            ps.setString(8, thongTinMuonTra.getMaMuon());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public void remove(String maMuon){
        String sql = "DELETE FROM tblMuon WHERE MaMuon = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, maMuon);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public List<ThongTinMuonTra> findByName(String maDG){
        List<ThongTinMuonTra> list = new ArrayList<>();
        String sql = "SELECT * FROM tblMuon WHERE MaDocGia = ?";
        System.out.println(maDG);
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement(sql); 
            ps.setString(1, maDG);
            rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(new ThongTinMuonTra(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), 
                                        rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public int getQuantityByMonth(String month){
        String sql = "SELECT SUM(SoLuong) FROM tblMuon\n" +
                        " WHERE SUBSTRING(NgayMuon, 1, 3) LIKE ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, month);
            rs = ps.executeQuery();
            
            if(rs.next())
                return  rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int getTotalItem(){
        String sql = "SELECT COUNT(MaMuon)\n" +
                        "FROM tblMuon";
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
    
    public List<ThongTinMuonTra> getByPage(int maxPageItem, int page){
        List<ThongTinMuonTra> list = new ArrayList<ThongTinMuonTra>();
        String sql =    "SELECT * FROM tblMuon\n" +
                        "Order by MaMuon\n" +
                        "OFFSET ? ROWS\n" +
                        "FETCH NEXT ? ROWS ONLY";
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, (page-1)*maxPageItem);
            ps.setInt(2, maxPageItem);
            rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(new ThongTinMuonTra(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), 
                                        rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static void main(String[] args) {
        ThongTinMuonTraDao thongTinMuonTraDao = new ThongTinMuonTraDao();
        System.out.println(thongTinMuonTraDao.getQuantityByMonth("Jan"));
        System.out.println(thongTinMuonTraDao.getByPage(8, 2));
    }
}
