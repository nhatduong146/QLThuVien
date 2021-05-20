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
public class LB_Service {

    private Connection con;

    public LB_Service() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=MANAGE_LIBRARY;"
                    + "username=sa;password=tttl1209ntk0208");
        } catch (Exception e) {
        }
    }

    /*Select toan bo du lieu tu tblDocGia*/
    public List<LB_User_DG> GetAll_DocGia() throws SQLException {
        List<LB_User_DG> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblDocGia";
        rs = stmt.executeQuery(url);

        while (rs.next()) {
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
        return users;

    }

    //Select toan bo du lieu tu tblMuon
    public List<LB_User_Muon> GetAll_Return_B() throws SQLException {
        List<LB_User_Muon> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblMuon";
        rs = stmt.executeQuery(url);
        while (rs.next()) {

            LB_User_Muon lb_user = new LB_User_Muon();
            lb_user.SetSTT(rs.getInt("STT"));
            lb_user.SetMaMuon(rs.getString("MaMuon"));
            lb_user.SetNgayMuon(rs.getDate("NgayMuon"));
            lb_user.SetNgayHenTra(rs.getDate("NgayHenTra"));
            lb_user.SetNgayTra(rs.getDate("NgayTra"));
            lb_user.SetGhiChu(rs.getString("GhiChu"));
            lb_user.SetMaDG(rs.getString("MaDocGia"));
            lb_user.SetSoLuong(rs.getInt("SoLuong"));
            lb_user.SetMaCS(rs.getString("MaCuonSach"));
            users.add(lb_user);

        }
        return users;

    }

    // Select toan bo du lieu tu tblCuonSach
    public List<LB_User_DM> GetAll_DM_B() throws SQLException {
        List<LB_User_DM> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblCuonSach";
        rs = stmt.executeQuery(url);

        while (rs.next()) {

            LB_User_DM lb_user = new LB_User_DM();
            lb_user.SetSTT(rs.getInt("STT"));
            lb_user.SetMaCS(rs.getString("MaCuonSach"));
            lb_user.SetTenCS(rs.getString("TenCuonSach"));
            lb_user.SetMaDS(rs.getString("MaDauSach"));
            lb_user.SetTenTL(rs.getString("TenTL"));
            lb_user.SetSoLuong(rs.getInt("SoLuong"));
            lb_user.SetTomTat(rs.getString("TomTat"));

            users.add(lb_user);
        }
        return users;

    }

    // Select toan bo du lieu tu tblCuonSach
    public List<LB_User_DM> GetAll_DS_B() throws SQLException {
        List<LB_User_DM> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblDauSach";
        rs = stmt.executeQuery(url);

        while (rs.next()) {

            LB_User_DM lb_user = new LB_User_DM();
            lb_user.SetMaDS(rs.getString("MaDauSach"));
            lb_user.SetMaTS(rs.getString("MaTuaSach"));
            users.add(lb_user);
        }
        return users;

    }

    // Select toan bo du lieu tu tblTheLoai
    public List<LB_User_TSTL> GetAll_TL_B() throws SQLException {
        List<LB_User_TSTL> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblTheLoai";
        rs = stmt.executeQuery(url);

        while (rs.next()) {

            LB_User_TSTL lb_user = new LB_User_TSTL();
            lb_user.SetSTT_TL(rs.getInt("STT"));
            lb_user.SetMaTL(rs.getString("MaTheLoai"));
            lb_user.SetTenTL(rs.getString("TenLoaiSach"));
            users.add(lb_user);
        }
        return users;

    }

    // Select toan bo du lieu tu tblTuaSach
    public List<LB_User_TSTL> GetAll_TS_B() throws SQLException {
        List<LB_User_TSTL> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblTuaSach";
        rs = stmt.executeQuery(url);

        while (rs.next()) {
            LB_User_TSTL lb_user = new LB_User_TSTL();
            lb_user.SetSTT_TS(rs.getInt("STT"));
            lb_user.SetMaTS(rs.getString("MaTuaSach"));
            lb_user.SetTenTL(rs.getString("TenTuaSach"));
            lb_user.SetMaTL(rs.getString("MaTheLoai"));
            lb_user.SetMaTG(rs.getString("MaTacGia"));
            lb_user.SetTomTat(rs.getString("TomTat"));
            users.add(lb_user);
        }
        return users;

    }

    // Select toan bo du lieu tu tblTacGia
    public List<LB_User_NXBTG> GetAll_TacGia() throws SQLException {
        List<LB_User_NXBTG> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblTacGia";
        rs = stmt.executeQuery(url);

        while (rs.next()) {

            LB_User_NXBTG lb_user = new LB_User_NXBTG();
            lb_user.SetSTT_TG(rs.getInt("STT"));
            lb_user.SetMaTG(rs.getString("MaTacGia"));
            lb_user.SetTenTG(rs.getString("TenTacGia"));
            users.add(lb_user);
        }
        return users;

    }

    // Select toan bo du lieu tu tblXuatBan
    public List<LB_User_NXBTG> GetAll_NXB() throws SQLException {
        List<LB_User_NXBTG> users = new ArrayList();
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String url = "SELECT * FROM tblNhaXuatBan";
        rs = stmt.executeQuery(url);

        while (rs.next()) {

            LB_User_NXBTG lb_user = new LB_User_NXBTG();
            lb_user.SetSTT_NXB(rs.getInt("STT"));
            lb_user.SetMaNXB(rs.getString("MaNXB"));
            lb_user.SetTenNXB(rs.getString("TenNXB"));
            users.add(lb_user);
        }
        return users;

    }


    public static void main(String a[]) throws SQLException {
        new LB_Service();

    }
}
