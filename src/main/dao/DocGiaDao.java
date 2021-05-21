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
                DocGia docGia = new DocGia();
                // to be continue........................................................................................
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void insert(DocGia docGia){
        String sql = "INSERT INTO tblDocGia ";//to be continue....................................
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(sql);
            //to be continue ...................................................................................
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public void update(DocGia docGia){
        String sql = "Update tblDocGia SET ........ WHERE maDocGia = ?";//to be continue....................................
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(sql);
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
    
}
