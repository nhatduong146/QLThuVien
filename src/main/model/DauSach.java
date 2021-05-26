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
public class DauSach {
    private String MaDS;
    private String MaTS;
    private String ngonNgu;
    private String maNXB;

    public DauSach() {
    }

    public DauSach(String MaDS, String MaTS, String ngonNgu, String maNXB) {
        this.MaDS = MaDS;
        this.MaTS = MaTS;
        this.ngonNgu = ngonNgu;
        this.maNXB = maNXB;
    }

    public String getMaDS() {
        return MaDS;
    }

    public void setMaDS(String MaDS) {
        this.MaDS = MaDS;
    }

    public String getMaTS() {
        return MaTS;
    }

    public void setMaTS(String MaTS) {
        this.MaTS = MaTS;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public String getMaNXB() {
        return maNXB;
    }

    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }

    @Override
    public String toString() {
        return "\nDauSach{" + "MaDS=" + MaDS + ", MaTS=" + MaTS + ", ngonNgu=" + ngonNgu + ", maNXB=" + maNXB + '}';
    }
    
    
}
