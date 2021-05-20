/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author K2001
 */
public class LB_User_DM {
    private int STT;
    private String MaCS;
    private String TenCS;
    private String MaDS;
    private String TenTL;
    private int SoLuong;
    private String TomTat;
    public int GetSTT(){
        return STT; 
    }
    public void SetSTT(int STT){
        this.STT = STT;
    }
    public String getMaCS(){
        return MaCS;
    }
    public void SetMaCS(String MaCS){
        this.MaCS = MaCS;
    }
    public String GetTenCS(){
        return TenCS;
    }
    public void SetTenCS(String TenCS){
        this.TenCS=TenCS;
    }
    public String GetTenTL(){
        return TenTL;
    }
    public void SetTenTL(String TenTL){
        this.TenTL=TenTL;
    }
    public String GetMaDS(){
        return MaDS;
    }
    public void SetMaDS(String MaDS){
        this.MaDS=MaDS;
    }
    public int GetSoLuong(){
        return SoLuong;
    }
    public void SetSoLuong(int SoLuong){
        this.SoLuong = SoLuong;
    }
    public String GetTomTat(){
        return TomTat;
    }
    public void SetTomTat(String TomTat){
        this.TomTat = TomTat;
    }
    
}
