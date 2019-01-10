/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;

/**
 *
 * @author kenz2
 */
public class Team {
    private int MaTV;
   
    private int NgayGiaNhap;
    private int ThangGiaNhap;
    private int NamGiaNhap;
    private String ChucVu;
    private String NoiSinhHoat;

    public Team() {
    }

    public Team(int MaTV, int NgayGiaNhap, int ThangGiaNhap, int NamGiaNhap, String ChucVu, String NoiSinhHoat) {
        this.MaTV = MaTV;
    
        this.NgayGiaNhap = NgayGiaNhap;
        this.ThangGiaNhap = ThangGiaNhap;
        this.NamGiaNhap = NamGiaNhap;
        this.ChucVu = ChucVu;
        this.NoiSinhHoat = NoiSinhHoat;
    }

    public int getMaTV() {
        return MaTV;
    }

    public void setMaTV(int MaTV) {
        this.MaTV = MaTV;
    }

  

    public int getNgayGiaNhap() {
        return NgayGiaNhap;
    }

    public void setNgayGiaNhap(int NgayGiaNhap) {
        this.NgayGiaNhap = NgayGiaNhap;
    }

    public int getThangGiaNhap() {
        return ThangGiaNhap;
    }

    public void setThangGiaNhap(int ThangGiaNhap) {
        this.ThangGiaNhap = ThangGiaNhap;
    }

    public int getNamGiaNhap() {
        return NamGiaNhap;
    }

    public void setNamGiaNhap(int NamGiaNhap) {
        this.NamGiaNhap = NamGiaNhap;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getNoiSinhHoat() {
        return NoiSinhHoat;
    }

    public void setNoiSinhHoat(String NoiSinhHoat) {
        this.NoiSinhHoat = NoiSinhHoat;
    }
    
}
