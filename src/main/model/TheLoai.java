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
public class TheLoai {
    private int stt;
    private String maTL;
    private String tenTL;
    public int getStt(){
        return stt;
    }
    public void setStt(int stt){
        this.stt=stt;
    }
    public String getMaTL(){
        return maTL;
    }
    public void setMaTL(String maTL){
        this.maTL = maTL;
    }
    public String getTenTL(){
        return tenTL;
    }
    public void setTenTL(String tenTL){
        this.tenTL=tenTL;
    }
}
