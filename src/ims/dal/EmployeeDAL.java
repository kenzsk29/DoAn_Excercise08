/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.MyEmployee;
import ims.Team;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kenz2
 */
public class EmployeeDAL {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/qlnhanvien";
//    static final String DB_URL_TABLE = "jdbc:mysql://localhost/exe08";
    static final String USER = "root";
    static final String PASS = "";

    public byte[] getImageFromDB() {
        ImageIcon newImage;
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `nhanvien`");
            if (rs.next()) {
                byte[] img = rs.getBytes("anh");
                return img;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ResultSet getTinhThanh() {
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT `manoisinh`,`noisinh` FROM `noisinh`");
            return rs;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }
    public ResultSet getNguyenQuan() {
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT `manguyenquan`,`nguyenquan` FROM `nguyenquan`");
            return rs;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }
    public ResultSet getNoiCap() {
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT `manoicap`,`noicap` FROM `noicap`");
            return rs;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }
    public ResultSet getQuanHuyen(String idQuan) {
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT `maquan`,`quan` FROM `quan` WHERE `maquan`=" + idQuan);
            return rs;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet getDanToc() {
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `dantoc`");
            return rs;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet getTonGiao() {
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `tongiao`");
            return rs;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet getTrinhDoHV() {
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `hocvan`");
            return rs;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet getTinhTranhHN() {
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `honnhan`");
            return rs;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet getVanHoa() {
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `vanhoa`");
            return rs;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet getQuocTich() {
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `quoctich`");
            return rs;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }

    public void addNew(MyEmployee epl) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/qlnhanvien", "root", "");
            PreparedStatement ps = con.prepareStatement("INSERT INTO `nhanvien`(`manhanvien`, `anh`, `hoten`, `ten`, `gioitinh`, `sotaikhoan`, `ngaysinh`, `noisinh`, `msthue`, `tamtru`, `quan`, `quoctich`, `honnhan`, `dienthoai`, `didong`, `email`, `cmnd`, `vanhoa`, `hocvan`, `ngaycap`, `noicap`, `nguyenquan`, `dantoc`, `tongiao`, `thuongchu`, `hokhau`,`ghichu`) VALUES (?,null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
//            Lấy đường dẫn của hình
//            InputStream imgpath = new FileInputStream(new File(epl.getImg()));
//            insert lên csdl
            ps.setInt(1, epl.getMaNV());
//            ps.setBlob(2, imgpath);
            ps.setString(3, epl.getHoDem());
            ps.setString(4, epl.getTen());
            ps.setBoolean(5, epl.isGioiTinh());
            ps.setString(6, epl.getSTK());
            ps.setDate(7, new Date(epl.getNamSinh(), epl.getThangSinh(), epl.getNgaySinh()));
            ps.setString(8, epl.getNoiSinh());
            ps.setString(9, epl.getMST());
            ps.setString(10, epl.getTamTru());
            ps.setString(11, epl.getQuanHuyen());
            ps.setString(12, epl.getQuocTich());
            ps.setString(13, epl.getTTHonNhan());
            ps.setString(14, epl.getDienThoai());
            ps.setString(15, epl.getDiDong());
            ps.setString(16, epl.getEmail());
            ps.setString(17, epl.getCMND());
            ps.setString(18, epl.getVanHoa());
            ps.setString(19, epl.getTrinhDoHV());
            ps.setDate(20, new Date(epl.getNamCap(), epl.getThangCap(), epl.getNgayCap()));
            ps.setString(21, epl.getNoiCap());
            ps.setString(22, epl.getNguyenQuan());
            ps.setInt(23, epl.getDanToc());
            ps.setString(24, epl.getTonGiao());
            ps.setString(25, epl.getThuongTru());
            ps.setString(26, epl.getHoKhau());
            ps.setString(27, epl.getGhiChu());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(MyEmployee epl) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/qlnhanvien", "root", "");
            PreparedStatement ps = con.prepareStatement("UPDATE `nhanvien` SET `anh`=?,`hoten`=?,`ten`=?,`gioitinh`=?,`sotaikhoan`=?,`ngaysinh`=?,`noisinh`=?,`msthue`=?,`tamtru`=?,`quan`=?,`quoctich`=?,`honnhan`=?,`dienthoai`=?,`didong`=?,`email`=?,`cmnd`=?,`vanhoa`=?,`hocvan`=?,`ngaycap`=?,`noicap`=?,`nguyenquan`=?,`dantoc`=?,`tongiao`=?,`thuongtru`=?,`hokhau`=?,`ghichu`=? WHERE `manhanvien`=?");
//            Lấy đường dẫn của hình
            InputStream imgpath = new FileInputStream(new File(epl.getImg()));
//            insert lên csdl
            ps.setInt(27, epl.getMaNV());
            ps.setBlob(1, imgpath);
            ps.setString(2, epl.getHoDem());
            ps.setString(3, epl.getTen());
            ps.setBoolean(4, epl.isGioiTinh());
            ps.setString(5, epl.getSTK());
            ps.setDate(6, new Date(epl.getNamSinh(), epl.getThangSinh(), epl.getNgaySinh()));
            ps.setString(7, epl.getNoiSinh());
            ps.setString(8, epl.getMST());
            ps.setString(9, epl.getTamTru());
            ps.setString(10, epl.getQuanHuyen());
            ps.setString(11, epl.getQuocTich());
            ps.setString(12, epl.getTTHonNhan());
            ps.setString(13, epl.getDienThoai());
            ps.setString(14, epl.getDiDong());
            ps.setString(15, epl.getEmail());
            ps.setString(16, epl.getCMND());
            ps.setString(17, epl.getVanHoa());
            ps.setString(18, epl.getTrinhDoHV());
            ps.setDate(19, new Date(epl.getNamCap(), epl.getThangCap(), epl.getNgayCap()));
            ps.setString(20, epl.getNoiCap());
            ps.setString(21, epl.getNguyenQuan());
            ps.setInt(22, epl.getDanToc());
            ps.setString(23, epl.getTonGiao());
            ps.setString(24, epl.getThuongTru());
            ps.setString(25, epl.getHoKhau());
            ps.setString(26, epl.getGhiChu());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet readEmployee() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM `nhanvien`";
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void delete(MyEmployee epl) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "DELETE FROM `nhanvien` WHERE `manhanvien`=" + epl.getMaNV();
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addDCS(Team dcs) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement ps = con.prepareStatement("INSERT INTO `dcsvn`(`madcsvn`, `ngaygianhap`, `chucvu`, `noisinhhoat`) VALUES (null,?,?,?,?)");
            ps.setInt(1, dcs.getMaTV());
            ps.setDate(2, new Date(dcs.getNamGiaNhap(), dcs.getThangGiaNhap(), dcs.getNgayGiaNhap()));
            ps.setString(3, dcs.getChucVu());
            ps.setString(4, dcs.getNoiSinhHoat());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet readDCS(int Manv) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM `dcsvn` WHERE `madcsvn`=" + Manv;
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void updateDCS(Team dcs) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/qlnhanvien", "root", "");
            PreparedStatement ps = con.prepareStatement("UPDATE `dcsvn` SET `ngaygianhap`=?,`chucvu`=?,`noisinhhoat`=? WHERE `madcsvn`=?");
            ps.setDate(1, new Date(dcs.getNamGiaNhap(), dcs.getThangGiaNhap(), dcs.getNgayGiaNhap()));
            ps.setString(2, dcs.getChucVu());
            ps.setString(3, dcs.getNoiSinhHoat());
            ps.setInt(4, dcs.getMaTV());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteDCS(int MaNV) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "DELETE FROM `dcsvn` WHERE `madcsvn`=" + MaNV;
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    Doan Thanh nien

    public void addDTN(Team dtn) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement ps = con.prepareStatement("INSERT INTO `doanthanhnien`(`madcsvn`, `ngaygianhap`, `chucvu`, `noisinhhoat`) VALUES (null,?,?,?,?)");
            ps.setInt(1, dtn.getMaTV());
            ps.setDate(2, new Date(dtn.getNamGiaNhap(), dtn.getThangGiaNhap(), dtn.getNgayGiaNhap()));
            ps.setString(3, dtn.getChucVu());
            ps.setString(4, dtn.getNoiSinhHoat());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet readDTN(int Manv) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM `doanthanhnien` WHERE `madoanthanh`=" + Manv;
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void updateDTN(Team dtn) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/qlnhanvien", "root", "");
            PreparedStatement ps = con.prepareStatement("UPDATE `doanthanhnien` SET `ngaygianhap`=?,`chucvu`=?,`noisinhhoat`=? WHERE `madoanthanh`=?");
            ps.setDate(1, new Date(dtn.getNamGiaNhap(), dtn.getThangGiaNhap(), dtn.getNgayGiaNhap()));
            ps.setString(2, dtn.getChucVu());
            ps.setString(3, dtn.getNoiSinhHoat());
            ps.setInt(4, dtn.getMaTV());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteDTN(int MaNV) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "DELETE FROM `doanthanhnien` WHERE `madoanthanh`=" + MaNV;
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    Quan Doi

    public void addQD(Team qd) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement ps = con.prepareStatement("INSERT INTO `quandoi`(`maquandoi`,`ngaygianhap`, `chucvu`, `noisinhhoat`) VALUES (null,?,?,?,?)");
            ps.setInt(1, qd.getMaTV());
            ps.setDate(2, new Date(qd.getNamGiaNhap(), qd.getThangGiaNhap(), qd.getNgayGiaNhap()));
            ps.setString(3, qd.getChucVu());
            ps.setString(4, qd.getNoiSinhHoat());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet readQD(int Manv) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM `quandoi` WHERE `maquandoi`=" + Manv;
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void updateQD(Team qd) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/qlnhanvien", "root", "");
            PreparedStatement ps = con.prepareStatement("UPDATE `quandoi` SET `ngaygianhap`=?,`chucvu`=?,`noisinhhoat`=? WHERE `maquandoi`=?");
            ps.setDate(1, new Date(qd.getNamGiaNhap(), qd.getThangGiaNhap(), qd.getNgayGiaNhap()));
            ps.setString(2, qd.getChucVu());
            ps.setString(3, qd.getNoiSinhHoat());
            ps.setInt(4, qd.getMaTV());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteQD(int MaNV) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "DELETE FROM `quandoi` WHERE `maquandoi`=" + MaNV;
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
