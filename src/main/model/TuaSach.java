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
public class TuaSach {
    private int stt;
    private String maTS;
    private String tenTS;
    private String maTG;
    private String maTL;
    private String tomTat;
    private int soLuong;
    
    public int getStt(){
        return stt;
    }
    public void setStt(int stt){
        this.stt=stt;
    }
    public String getMaTS(){
        return maTS;
    }
    public void setMaTS( String maTS){
        this.maTS = maTS; 
    }
    public String getTenTS(){
        return tenTS;
    }
    public void setTenTS(String tenTS){
        this.tenTS=tenTS;
    }
    public int getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(int soLuong){
        this.soLuong=soLuong;
    }
    public String getMaTL(){
        return maTL;
    }
    public void setMaTL(String maTL){
        this.maTL = maTL;
    }
     public String getMaTG(){
        return maTG;
    }
    public void setMaTG(String maTG){
        this.maTG = maTG;
    }
     public String getTomTat(){
         return tomTat;
     }
     public void setTomTat(String tomTat){
         this.tomTat=tomTat;
     }
}
