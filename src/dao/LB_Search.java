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
public class LB_Search {

    private Connection con;

    public LB_Search() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=MANAGE_LIBRARY;"
                    + "username=sa;password=tttl1209ntk0208");
        } catch (Exception e) {
        }
    }

    //Tim kiem theo MaDocGia
    public List<LB_User_DG> Search_DocGia_M(String madg) throws SQLException {
        List<LB_User_DG> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblDocGia";
        rs = stmt.executeQuery(url);

        while (rs.next()) {
            if (rs.getString("MaDocGia").compareToIgnoreCase(madg) == 0) {
                LB_User_DG lb_user = new LB_User_DG();
                lb_user.SetSTT(rs.getInt("STT"));
                lb_user.SetMaDG(rs.getString("MaDocGia"));
                lb_user.SetHoTenDG(rs.getString("HoLotDG") + " " + rs.getString("TenDocGia"));
                if (rs.getInt("GioiTinh") == 1) {
                    lb_user.SetGioiTinh("Nam");
                } else {
                    lb_user.SetGioiTinh("Nữ");
                }
                lb_user.SetNgaySinh(rs.getDate("NgaySinh"));
                lb_user.SetDiaChi(rs.getString("DiaChi"));
                lb_user.SetNgayDK(rs.getDate("NgayDangKi"));
                lb_user.SetNgayHetHanDK(rs.getDate("NgayHetHanDK"));
                lb_user.SetSDT(rs.getString("SoDienThoai"));
                users.add(lb_user);
            }

        }
        return users;

    }

    //Tim kiem theo TenDocGia
    public List<LB_User_DG> Search_DocGia_T(String madg) throws SQLException {
        List<LB_User_DG> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblDocGia";
        rs = stmt.executeQuery(url);

        while (rs.next()) {
            if (rs.getString("TenDocGia").compareToIgnoreCase(madg) == 0) {
                LB_User_DG lb_user = new LB_User_DG();
                lb_user.SetSTT(rs.getInt("STT"));
                lb_user.SetMaDG(rs.getString("MaDocGia"));
                lb_user.SetHoTenDG(rs.getString("HoLotDG") + " " + rs.getString("TenDocGia"));
                if (rs.getInt("GioiTinh") == 1) {
                    lb_user.SetGioiTinh("Nam");
                } else {
                    lb_user.SetGioiTinh("Nữ");
                }
                lb_user.SetNgaySinh(rs.getDate("NgaySinh"));
                lb_user.SetDiaChi(rs.getString("DiaChi"));
                lb_user.SetNgayDK(rs.getDate("NgayDangKi"));
                lb_user.SetNgayHetHanDK(rs.getDate("NgayHetHanDK"));
                lb_user.SetSDT(rs.getString("SoDienThoai"));
                users.add(lb_user);
            }
        }
        return users;
    }

    //Search theo MaNXB
    public List<LB_User_NXBTG> Search_NXB_M(String maNXB) throws SQLException {
        List<LB_User_NXBTG> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblNhaXuatBan";
        rs = stmt.executeQuery(url);

        while (rs.next()) {
            if (rs.getString("MaNXB").compareToIgnoreCase(maNXB) == 0) {
                LB_User_NXBTG lb_user = new LB_User_NXBTG();
                lb_user.SetSTT_NXB(rs.getInt("STT"));
                lb_user.SetMaNXB(rs.getString("MaNXB"));
                lb_user.SetTenNXB(rs.getString("TenNXB"));
                users.add(lb_user);
            }

        }

        return users;

    }

    // Search theo TenNXB
    public List<LB_User_NXBTG> Search_NXB_T(String tenNXB) throws SQLException {
        List<LB_User_NXBTG> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblNhaXuatBan";
        rs = stmt.executeQuery(url);

        while (rs.next()) {
            if (rs.getString("TenNXB").compareToIgnoreCase(tenNXB) == 0) {
                LB_User_NXBTG lb_user = new LB_User_NXBTG();
                lb_user.SetSTT_NXB(rs.getInt("STT"));
                lb_user.SetMaNXB(rs.getString("MaNXB"));
                lb_user.SetTenNXB(rs.getString("TenNXB"));
                users.add(lb_user);
            }

        }

        return users;

    }

    // Search theo MaTacGia
    public List<LB_User_NXBTG> Search_TG_M(String tenNXB) throws SQLException {
        List<LB_User_NXBTG> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblTacGia";
        rs = stmt.executeQuery(url);

        while (rs.next()) {
            if (rs.getString("MaTacGia").compareToIgnoreCase(tenNXB) == 0) {
                LB_User_NXBTG lb_user = new LB_User_NXBTG();
                lb_user.SetSTT_TG(rs.getInt("STT"));
                lb_user.SetMaTG(rs.getString("MaTacGia"));
                lb_user.SetTenTG(rs.getString("TenTacGia"));
                users.add(lb_user);
            }

        }

        return users;

    }
// Search theo TenTacGia
    public List<LB_User_NXBTG> Search_TG_T(String tenNXB) throws SQLException {
        List<LB_User_NXBTG> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblNhaXuatBan";
        rs = stmt.executeQuery(url);

        while (rs.next()) {
            if (rs.getString("TenTacGia").compareToIgnoreCase(tenNXB) == 0) {
                LB_User_NXBTG lb_user = new LB_User_NXBTG();
                lb_user.SetSTT_TG(rs.getInt("STT"));
                lb_user.SetMaNXB(rs.getString("MaNXB"));
                lb_user.SetTenNXB(rs.getString("TenNXB"));
                users.add(lb_user);
            }

        }

        return users;

    }
    public List<LB_User_TSTL> Search_TS_M(String MaTS) throws SQLException {
        List<LB_User_TSTL> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblTuaSach";
        rs = stmt.executeQuery(url);

        while (rs.next()) {
            if (rs.getString("MaTuaSach").compareToIgnoreCase(MaTS) == 0) {
                LB_User_TSTL lb_user = new LB_User_TSTL();
                lb_user.SetSTT_TS(rs.getInt("STT"));
               lb_user.SetMaTS(rs.getString("MaTuaSach"));
               lb_user.SetTenTS(rs.getString("TenTuaSach"));
               lb_user.SetMaTL(rs.getString("MaTheLoai"));
               lb_user.SetMaTG(rs.getString("MaTacGia"));
               lb_user.SetTomTat(rs.getString("TenTuaSach"));
                users.add(lb_user);
            }
        }
        return users;
    }
    public List<LB_User_TSTL> Search_TS_T(String TenTS) throws SQLException {
        List<LB_User_TSTL> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblTuaSach";
        rs = stmt.executeQuery(url);

        while (rs.next()) {
            if (rs.getString("TenTuaSach").compareToIgnoreCase(TenTS) == 0) {
                LB_User_TSTL lb_user = new LB_User_TSTL();
               lb_user.SetSTT_TS(rs.getInt("STT"));
               lb_user.SetMaTS(rs.getString("MaTuaSach"));
               lb_user.SetTenTS(rs.getString("TenTuaSach"));
               lb_user.SetMaTL(rs.getString("MaTheLoai"));
               lb_user.SetMaTG(rs.getString("MaTacGia"));
               lb_user.SetTomTat(rs.getString("TenTuaSach"));
                users.add(lb_user);
            }
        }
        return users;
    }

   

    public static void main(String a[]) throws SQLException {
        new LB_Search();

    }
}
