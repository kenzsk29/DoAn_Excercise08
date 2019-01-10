/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;

import java.sql.Date;

/**
 *
 * @author kenz2
 */
public class MyEmployee {

    int MaNV;
    byte[] imgByte;
    private String img;
    private String HoDem;
    private String Ten;
    private boolean GioiTinh;
    private String STK;
    private int NgaySinh;
    private int ThangSinh;
    private int NamSinh;
    private String NoiSinh;
    private String MST;
    private String TamTru;
    private String QuanHuyen;
    private String QuocTich;
    private String TTHonNhan;
    private String DienThoai;
    private String DiDong;
    private String Email;
    private String CMND;
    private String VanHoa;
    private String TrinhDoHV;
    private int NgayCap;
    private int ThangCap;
    private int NamCap;
    private String NoiCap;
    private String NguyenQuan;
    private int DanToc;
    private String TonGiao;
    private String ThuongTru;
    private String HoKhau;
    private String GhiChu;

    public MyEmployee(int MaNV, String img, String HoDem, String Ten, boolean GioiTinh, String STK, int NgaySinh, int ThangSinh, int NamSinh, String NoiSinh, String MST, String TamTru, String QuanHuyen, String QuocTich, String TTHonNhan, String DienThoai, String DiDong, String Email, String CMND, String VanHoa, String TrinhDoHV, int NgayCap, int ThangCap, int NamCap, String NoiCap, String NguyenQuan, int DanToc, String TonGiao, String ThuongTru, String HoKhau, String GhiChu) {

        this.MaNV = MaNV;
        this.img = img;
        this.HoDem = HoDem;
        this.Ten = Ten;
        this.GioiTinh = GioiTinh;
        this.STK = STK;
        this.NgaySinh = NgaySinh;
        this.ThangSinh = ThangSinh;
        this.NamSinh = NamSinh;
        this.NoiSinh = NoiSinh;
        this.MST = MST;
        this.TamTru = TamTru;
        this.QuanHuyen = QuanHuyen;
        this.QuocTich = QuocTich;
        this.TTHonNhan = TTHonNhan;
        this.DienThoai = DienThoai;
        this.DiDong = DiDong;
        this.Email = Email;
        this.CMND = CMND;
        this.VanHoa = VanHoa;
        this.TrinhDoHV = TrinhDoHV;
        this.NgayCap = NgayCap;
        this.ThangCap = ThangCap;
        this.NamCap = NamCap;
        this.NoiCap = NoiCap;
        this.NguyenQuan = NguyenQuan;
        this.DanToc = DanToc;
        this.TonGiao = TonGiao;
        this.ThuongTru = ThuongTru;
        this.HoKhau = HoKhau;
        this.GhiChu = GhiChu;
    }

    public MyEmployee() {
    }

    public byte[] getImgByte() {
        return imgByte;
    }

    public void setImgByte(byte[] imgByte) {
        this.imgByte = imgByte;
    }

    
    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getHoDem() {
        return HoDem;
    }

    public void setHoDem(String HoDem) {
        this.HoDem = HoDem;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSTK() {
        return STK;
    }

    public void setSTK(String STK) {
        this.STK = STK;
    }

    public int getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(int NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public int getThangSinh() {
        return ThangSinh;
    }

    public void setThangSinh(int ThangSinh) {
        this.ThangSinh = ThangSinh;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getNoiSinh() {
        return NoiSinh;
    }

    public void setNoiSinh(String NoiSinh) {
        this.NoiSinh = NoiSinh;
    }

    public String getMST() {
        return MST;
    }

    public void setMST(String MST) {
        this.MST = MST;
    }

    public String getTamTru() {
        return TamTru;
    }

    public void setTamTru(String TamTru) {
        this.TamTru = TamTru;
    }

    public String getQuanHuyen() {
        return QuanHuyen;
    }

    public void setQuanHuyen(String QuanHuyen) {
        this.QuanHuyen = QuanHuyen;
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String QuocTich) {
        this.QuocTich = QuocTich;
    }

    public String getTTHonNhan() {
        return TTHonNhan;
    }

    public void setTTHonNhan(String TTHonNhan) {
        this.TTHonNhan = TTHonNhan;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getDiDong() {
        return DiDong;
    }

    public void setDiDong(String DiDong) {
        this.DiDong = DiDong;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getVanHoa() {
        return VanHoa;
    }

    public void setVanHoa(String VanHoa) {
        this.VanHoa = VanHoa;
    }

    public String getTrinhDoHV() {
        return TrinhDoHV;
    }

    public void setTrinhDoHV(String TrinhDoHV) {
        this.TrinhDoHV = TrinhDoHV;
    }

    public int getNgayCap() {
        return NgayCap;
    }

    public void setNgayCap(int NgayCap) {
        this.NgayCap = NgayCap;
    }

    public int getThangCap() {
        return ThangCap;
    }

    public void setThangCap(int ThangCap) {
        this.ThangCap = ThangCap;
    }

    public int getNamCap() {
        return NamCap;
    }

    public void setNamCap(int NamCap) {
        this.NamCap = NamCap;
    }

    public String getNoiCap() {
        return NoiCap;
    }

    public void setNoiCap(String NoiCap) {
        this.NoiCap = NoiCap;
    }

    public String getNguyenQuan() {
        return NguyenQuan;
    }

    public void setNguyenQuan(String NguyenQuan) {
        this.NguyenQuan = NguyenQuan;
    }

    public int getDanToc() {
        return DanToc;
    }

    public void setDanToc(int DanToc) {
        this.DanToc = DanToc;
    }

    public String getTonGiao() {
        return TonGiao;
    }

    public void setTonGiao(String TonGiao) {
        this.TonGiao = TonGiao;
    }

    public String getThuongTru() {
        return ThuongTru;
    }

    public void setThuongTru(String ThuongTru) {
        this.ThuongTru = ThuongTru;
    }

    public String getHoKhau() {
        return HoKhau;
    }

    public void setHoKhau(String HoKhau) {
        this.HoKhau = HoKhau;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

}
