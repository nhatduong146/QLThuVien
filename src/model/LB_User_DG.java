package model;

import java.util.Date;

/**
 *
 * @author NGUYEN TRONG KHANG
 */
public class LB_User_DG {
    private int STT;
    private String MaDG;
    private String HotenDG;
    private Date NgaySinh;
    private String DiaChi;
    private Date NgayDK;
    private Date NgayHetHanDK;
    private String SDT;
    private String GioiTinh;
    
    public int GetSTT(){
        return STT;
    }
    public void SetSTT(int STT){
        this.STT = STT;
    }
    public String GetMaDG(){
        return MaDG;
    }
    public void SetMaDG(String MaDG){
        this.MaDG=MaDG;
    }
    public String GetHoTenDG(){
        return HotenDG;
    }
    public void SetHoTenDG(String HoTenDG){
        this.HotenDG=HoTenDG;
    }
    public Date GetNgaySinh(){
        return NgaySinh;
    }
    public void SetNgaySinh(Date NgaySinh){
        this.NgaySinh=NgaySinh;
    }  
    public String GetDiaChi(){
        return DiaChi;
    }
    public void SetDiaChi(String DiaChi){
        this.DiaChi=DiaChi;
    }
    public Date GetNgayDK(){
        return NgayDK;
    }
    public void SetNgayDK(Date NgayDK){
        this.NgayDK=NgayDK;
    }
    public Date GetNgayHetHanDK(){
        return NgayHetHanDK;
    }
    public void SetNgayHetHanDK(Date NgayHetHanDK){
        this.NgayHetHanDK=NgayHetHanDK;
    }
    public String GetGioiTinh(){
        return GioiTinh;
    }
    public void SetGioiTinh(String GioiTinh){
        this.GioiTinh = GioiTinh;
    }
    public String GetSDT(){
        return SDT;
    }
    public void SetSDT(String SDT){
        this.SDT = SDT;
    }
    
}




