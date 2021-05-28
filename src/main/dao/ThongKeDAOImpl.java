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
import main.model.muontra;

/**
 *
 * @author Admin
 */
public class ThongKeDAOImpl implements ThongKeDAO {
    private Connection con = KetNoiSQL.getConnection();

    @Override
    public List<muontra> getListMuontra() {
        String sql = "select mamuon, ngaymuon, ngaytra from tblmuon ";
        
        List<muontra> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                muontra dhh = new muontra();
                dhh.setMamuon(rs.getString("mamuon"));
                dhh.setNgaymuon(rs.getDate("ngaymuon"));
                dhh.setNgaytra(rs.getDate("ngaytra"));
                list.add(dhh);
            }
            ps.close();
            return list;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
}
}