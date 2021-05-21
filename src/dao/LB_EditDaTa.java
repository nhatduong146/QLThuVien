/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.LB_User_DG;
import model.LB_User_Muon;
import model.LB_User_NXBTG;
import model.LB_User_TSTL;
import model.LB_User_DM;

/**
 *
 * @author NGUYEN TRONG KHANG
 */
public class LB_EditDaTa {

    private Connection con = KetNoiSQL.getConnection();

    /*Cap nhat thong tin DocGia*/
    public ResultSet Update_DocGia(String madg, String MaDocGia, String HoTenDG, int GioiTinh, String NgaySinh, String NgayDK,
            String NgayHetHanDK, String DiaChi, String SDT) throws SQLException {
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "set dateformat dmy;"
                + "update tblDocGia set MaDocGia='" + MaDocGia + "', HoTenDG='" + HoTenDG + "', GioiTinh=" + GioiTinh + ", NgaySing='" + NgaySinh
                + "', NgayDangKi='" + NgayDK + "',NgayHetHanDK='" + NgayHetHanDK + "', SoDienThoai='" + SDT + "', where MaDocGia='" + madg + "'";

        stmt.executeUpdate(url);
        return rs;

    }

    /*Them moi DocGia*/
    public ResultSet Add_User_DG(String MaDG, String HoLotDG, String TenDocGia, int GioiTinh, String Ngaysinh, String DiaChi, String SDT,
            String NgayDK, String NgayHetHanDK) throws SQLException {
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "set dateformat dmy;"
                + "INSERT INTO tblDocGia (MaDocGia,HoLotDG,TenDocGia,GioiTinh,NgaySinh,DiaChi,SoDienThoai,NgayDangKi,NgayHetHanDK)"
                + "values ('" + MaDG + "',N'" + HoLotDG + "',N'" + TenDocGia + "'," + GioiTinh + ",'" + Ngaysinh + "',N'" + DiaChi + "','" + SDT + "','" + NgayDK + "','" + NgayHetHanDK + "');";

        stmt.executeUpdate(url);
        return rs;
    }

    /*Xoa DocGia*/
    public ResultSet Delete_DocGia(String MaDG) throws SQLException {
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "delete from tblDocGia where MaDocGia= '" + MaDG + "'";
        stmt.executeUpdate(url);
        return rs;
    }

    public static void main(String a[]) throws SQLException {
        new LB_EditDaTa();

    }
}
