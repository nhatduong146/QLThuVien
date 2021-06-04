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
public class NhaXuatBan {
    private String maNXB;
    private String tenNXB;

    public NhaXuatBan(String maNXB, String tenNXB) {
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
    }
    
    public NhaXuatBan(){}

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
        return "NhaXuatBan{"+ ", maNXB=" + maNXB + ", tenNXB=" + tenNXB + '}';
    }
    
    
}
