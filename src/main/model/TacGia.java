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
public class TacGia {
    private int stt;
    private String maTG;
    private String hoTen;
    public int getStt(){
        return stt;
    }
    public void setStt(int stt){
        this.stt=stt;
    }
    public String getMaTG(){
        return maTG;
    }
    public void setMaTG(String maTG){
        this.maTG = maTG;
    }
    public String getHoten(){
        return hoTen;
    }
    public void setHoten(String hoTen){
        this.hoTen = hoTen;
    }
}
