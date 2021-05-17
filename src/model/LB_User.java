/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author NGUYEN TRONG KHANG
 */
public class LB_User {
    private int STT;
    private String MaDG;
    private String HotenDG;
    private String NgaySinh;
    private String DiaChi;
    private String NgayDK;
    private String NgayHetHanDK;
    private String SĐT;
    public int GetSTT(){
        return STT;
    }
    public void SetSTT(int STT){
        this.STT = STT;
    }
    public String GetMaDG(){
        return MaDG;
    }
    public void SetMaDG(String MaDG){
        this.MaDG=MaDG;
    }
    public String GetHoTenDG(){
        return HotenDG;
    }
    public void SetHoTenDG(String HoTenDG){
        this.HotenDG=HoTenDG;
    }
    public String GetNgaySinh(){
        return NgaySinh;
    }
    public void SetNgaySinh(String NgaySinh){
        this.NgayDK=NgaySinh;
    }  
    public String GetDiaChi(){
        return DiaChi;
    }
    public void SetDiaChi(String DiaChi){
        this.DiaChi=DiaChi;
    }
    public String GetNgayDK(){
        return NgayDK;
    }
    public void SetNgayDK(String NgayDK){
        this.NgayDK=NgayDK;
    }
    public String GetNgayHetHanDK(){
        return NgayHetHanDK;
    }
    public void SetNgayHetHanDK(String NgayHetHanDK){
        this.NgayHetHanDK=NgayHetHanDK;
    }
}

