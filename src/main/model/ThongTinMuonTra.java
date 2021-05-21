/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;

/**
 *
 * @author Duong
 */
public class ThongTinMuonTra {
    private int stt;
    private String maMuon;
    private String maDG;
    private int soLuong;
    private String ngayTra;
    private String ngayHenTra;
    private String ngayMuon;
    private String ghiChu;
     public int getStt(){
         return stt;
     }
     public void setStt(int stt){
         this.stt=stt;
     }
     public String getMaMuon(){
         return maMuon;
     }
     public void setMaMuon(String maMuon){
         this.maMuon=maMuon;
     }
     public String getMaDG(){
         return maDG;
     }
     public void setMaDG(String MaDG){
         this.maDG=MaDG;
     }
     public int getSoLuong(){
         return soLuong;
     }
     public void setSoLuong(int soLuong){
         this.soLuong=soLuong;
     }
     public String getNgayMuon(){
         return ngayMuon;
     }
     public void setNgayMuon(String ngayMuon){
         this.ngayMuon = ngayMuon;
     }
     public String getNgayTra(){
         return ngayTra;
     }
     public void setNgayTra(String ngayTra){
         this.ngayTra = ngayTra;
     }
     public String getNgayHenTra(){
         return ngayHenTra;
     }
     public void setNgayHenTra(String ngayHenTra){
         this.ngayHenTra = ngayHenTra;
     }
     public String getGhiChu(){
         return ghiChu;
     }
     public void setGhiChu(String ghiChu){
         this.ghiChu = ghiChu;
     }
}
