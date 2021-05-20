/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author K2001
 */
public class LB_User_Muon {
    private int STT;
    private String MaCS;
    private String MaMuon;
    private Date NgayMuon;
    private Date NgayHenTra;
    private String GhiChu;
    private int SoLuong;
    private Date NgayTra;
    private String MaDG;
    public int GetSTT(){
        return STT;
    }
    public void SetSTT(int STT){
        this.STT = STT;
    }
    public String GetMaCS(){
        return MaCS;
    }
    public void SetMaCS(String MaCS){
        this.MaCS = MaCS;
    }
    public String GetMaMuon(){
        return MaMuon;
    }
    public void SetMaMuon(String MaMuon){
        this.MaMuon = MaMuon;
    }
    public Date GetNgayMuon(){
        return NgayMuon;
    }
    public void SetNgayMuon(Date NgayMuon){
        this.NgayMuon = NgayMuon;
    }
    public Date GetNgayTra(){
        return NgayTra;
    }
    public void SetNgayTra(Date NgayTra){
        this.NgayTra = NgayTra;
    }
    public Date GetNgayHenTra(){
        return NgayHenTra;
    }
    public void SetNgayHenTra(Date NgayHenTra){
        this.NgayHenTra = NgayHenTra;
    }
    public int GetSoLuong(){
        return SoLuong;
    }
    public void SetSoLuong(int SoLUong){
        this.SoLuong = SoLUong;
    }
    public String GetGhiChu(){
        return GhiChu;
    }
    public void SetGhiChu(String GhiChu){
        this.GhiChu = GhiChu;
    }
    public String GetMaDG(){
        return MaDG;
    }
    public void SetMaDG(String MaDG){
        this.MaDG=MaDG;
    }
 
}
