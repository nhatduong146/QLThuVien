/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author Duong
 */
public class DocGia {
    private String maDG;
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String ngayDK;
    private String ngayHetHan;
    private String sdt;
    private String gioiTinh;

    public DocGia() {
    }
    
    public DocGia(String maDG, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String sdt, String ngayDK, String ngayHetHan) {
        this.maDG = maDG;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.ngayDK = ngayDK;
        this.ngayHetHan = ngayHetHan;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
    }
    
    public String getMaDG() {
        return maDG;
    }

    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    public String getHoten() {
        return hoTen;
    }

    public void setHoten(String hoten) {
        this.hoTen = hoten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgayDK() {
        return ngayDK;
    }

    public void setNgayDK(String ngayDK) {
        this.ngayDK = ngayDK;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "\nDocGia{" + "maDG=" + maDG + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", ngayDK=" + ngayDK + ", ngayHetHan=" + ngayHetHan + ", sdt=" + sdt + ", gioiTinh=" + gioiTinh + '}';
    }
}
