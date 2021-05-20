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
public class LB_User_TSTL {
    private int STT_TS;
    private int STT_TL;
    private String MaTS;
    private String TenTS;
    private String NDTS;
    private String MaTL;
    private String TenTL;
    private String MaTG;
    private String TomTat;
    public int GetSTT_TS(){
        return STT_TS;
    }
    public void SetSTT_TS(int STT_TS){
        this.STT_TS = STT_TS;
    }
    public int GetSTT_TL(){
       return STT_TL;
    }
    public void SetSTT_TL(int STT_TL){
        this.STT_TL=STT_TL;
    }
    public String GetMaTS(){
        return MaTS;
    }
    public void SetMaTS(String MaTS){
        this.MaTS=MaTS;
    }
    public String GetMaTL(){
        return MaTL;
    }
    public void SetMaTL(String MaTL){
        this.MaTL=MaTL;
    }
    public String GetTenTS(){
        return TenTS;
    }
    public void SetTenTS(String TenTG){
        this.TenTS=TenTS;
    }
    public String GetTenTL(){
        return TenTL;
    }
    public void SetTenTL(String TenTL){
        this.TenTL=TenTL;
    }
    public String GetNDTS(){
        return NDTS;
    }
    public void SetNDTS(String NDTS){
        this.NDTS=NDTS;
    }
     public String GetMaTG(){
        return MaTG;
    }
    public void SetMaTG(String MaTG){
        this.MaTG=MaTG;
    }
    public String GetTomtat(){
        return TomTat;
    }
    public void SetTomTat(String TomTat){
        this.TomTat=TomTat;
    }
}
