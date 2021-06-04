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
public class TacGia {

    private String maTG;
    private String hoTen;

    public TacGia() {
    }

    public TacGia(String maTG, String hoTen) {
        this.maTG = maTG;
        this.hoTen = hoTen;
    }

    public String getMaTG() {
        return maTG;
    }

    public void setMaTG(String maTG) {
        this.maTG = maTG;
    }

    public String getHoten() {
        return hoTen;
    }

    public void setHoten(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return "\nTacGia{" + "maTG=" + maTG + ", hoTen=" + hoTen + '}';
    }
}
