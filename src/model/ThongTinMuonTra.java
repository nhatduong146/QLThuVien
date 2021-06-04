/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Duong
 */
public class ThongTinMuonTra {

    private String maMuon;
    private String maDG;
    private String maDS;
    private int soLuong;
    private String ngayTra;
    private String ngayHenTra;
    private String ngayMuon;
    private String ghiChu;

    public ThongTinMuonTra(String maMuon, String maDG, String maDS, int soLuong, String ngayMuon, String ngayHenTra, String ngayTra, String ghiChu) {
        this.maMuon = maMuon;
        this.maDG = maDG;
        this.maDS = maDS;
        this.soLuong = soLuong;
        this.ngayTra = ngayTra;
        this.ngayHenTra = ngayHenTra;
        this.ngayMuon = ngayMuon;
        this.ghiChu = ghiChu;
    }

    public ThongTinMuonTra() {
    }

    public void setMaDS(String maTS) {
        this.maDS = maTS;
    }

    public String getMaDS() {
        return maDS;
    }

    public String getMaMuon() {
        return maMuon;
    }

    public void setMaMuon(String maMuon) {
        this.maMuon = maMuon;
    }

    public String getMaDG() {
        return maDG;
    }

    public void setMaDG(String MaDG) {
        this.maDG = MaDG;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getNgayHenTra() {
        return ngayHenTra;
    }

    public void setNgayHenTra(String ngayHenTra) {
        this.ngayHenTra = ngayHenTra;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return "\nThongTinMuonTra{" + "maMuon=" + maMuon + ", maDG=" + maDG + ", maDS=" + maDS + ", soLuong=" + soLuong + ", ngayTra=" + ngayTra + ", ngayHenTra=" + ngayHenTra + ", ngayMuon=" + ngayMuon + ", ghiChu=" + ghiChu + '}';
    }

}
