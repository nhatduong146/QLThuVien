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
public class NhaXuatBan {
    private int stt;
    private String maNXB;
    private String tenNXB;

    public NhaXuatBan(int stt, String maNXB, String tenNXB) {
        this.stt = stt;
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
    }
    
    public NhaXuatBan(){}
    
    public int getStt(){
        return stt;
    }
    public void setStt(int Stt){
        this.stt = Stt;
    }
    public String getMaNXB(){
        return maNXB;
    }
    public void setMaNXB(String maNXB){
        this.maNXB=maNXB;
    }
    public String getTenNXB(){
        return tenNXB;
    }
    public void setTenNXB(String tenNXB){
        this.tenNXB=tenNXB;
    }

    @Override
    public String toString() {
        return "NhaXuatBan{" + "stt=" + stt + ", maNXB=" + maNXB + ", tenNXB=" + tenNXB + '}';
    }
    
    
}
