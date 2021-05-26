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

    private String maTS;
    private String tenTS;
    private String maTG;
    private String maTL;
    private String tomTat;
    private int soLuong;

    public TuaSach() {
    }

    public TuaSach(String maTS, String tenTS, String maTG, String maTL, String tomTat, int soLuong) {
        this.maTS = maTS;
        this.tenTS = tenTS;
        this.maTG = maTG;
        this.maTL = maTL;
        this.tomTat = tomTat;
        this.soLuong = soLuong;
    }

    public String getMaTS() {
        return maTS;
    }

    public void setMaTS(String maTS) {
        this.maTS = maTS;
    }

    public String getTenTS() {
        return tenTS;
    }

    public void setTenTS(String tenTS) {
        this.tenTS = tenTS;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getMaTG() {
        return maTG;
    }

    public void setMaTG(String maTG) {
        this.maTG = maTG;
    }

    public String getTomTat() {
        return tomTat;
    }

    public void setTomTat(String tomTat) {
        this.tomTat = tomTat;
    }

    @Override
    public String toString() {
        return "\nTuaSach{" + "maTS=" + maTS + ", tenTS=" + tenTS + ", maTG=" + maTG + ", maTL=" + maTL + ", tomTat=" + tomTat + ", soLuong=" + soLuong + '}';
    }
    
}
