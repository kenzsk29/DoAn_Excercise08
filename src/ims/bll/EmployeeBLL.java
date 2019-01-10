/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.MyEmployee;
import ims.MyEmployeeList;
import ims.Team;
import ims.cbItem;
import ims.dal.EmployeeDAL;
import java.sql.*;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kenz2
 */
public class EmployeeBLL {

    EmployeeDAL dal = new EmployeeDAL();

    public byte[] getImageFromDB() {
        if (dal.getImageFromDB() != null) {
            return dal.getImageFromDB();
        } else {
            JOptionPane.showMessageDialog(null, "Không thấy ảnh");
            throw new NumberFormatException("Không thấy ảnh");
        }
    }

    public ResultSet getTinhThanh() {
        if (dal.getTinhThanh() != null) {
            return dal.getTinhThanh();
        } else {
            JOptionPane.showMessageDialog(null, "Không chọn được tỉnh thành");
            throw new ArithmeticException("Không chọn được tỉnh thành");
        }
    }

    public ResultSet getNguyenQuan() {
        if (dal.getNguyenQuan() != null) {
            return dal.getNguyenQuan();
        } else {
            JOptionPane.showMessageDialog(null, "Không chọn được tỉnh thành");
            throw new ArithmeticException("Không chọn được tỉnh thành");
        }
    }
    
    public ResultSet getNoiCap() {
        if (dal.getNoiCap() != null) {
            return dal.getNoiCap();
        } else {
            JOptionPane.showMessageDialog(null, "Không chọn được tỉnh thành");
            throw new ArithmeticException("Không chọn được tỉnh thành");
        }
    }
    
    public ResultSet getQuanHuyen(String idTinhThanh) {
        if (dal.getQuanHuyen(idTinhThanh) != null) {
            return dal.getQuanHuyen(idTinhThanh);
        } else {
            JOptionPane.showMessageDialog(null, "Không chọn được quận huyện");
            throw new ArithmeticException("Không chọn được tỉnh thành");
        }
    }

//    public ResultSet getNoiCap(String idTinhThanh) {
//        if (dal.getNoiCap(idTinhThanh) != null) {
//            return dal.getQuanHuyen(idTinhThanh);
//        } else {
//            JOptionPane.showMessageDialog(null, "Không fetch được quận huyện");
//            throw new ArithmeticException("Không fetch được tỉnh thành");
//        }
//    }
    
    public ResultSet getDanToc() {
        if (dal.getDanToc() != null) {
            return dal.getDanToc();
        } else {
            JOptionPane.showMessageDialog(null, "Không chọn được dân tộc");
            throw new ArithmeticException("Không chọn được dân tộc");
        }
    }

    public ResultSet getTonGiao() {
        if (dal.getTonGiao() != null) {
            return dal.getTonGiao();
        } else {
            JOptionPane.showMessageDialog(null, "Không chọn được tôn giáo");
            throw new ArithmeticException("Không chọn được tôn giáo");
        }
    }

    public ResultSet getTrinhDoHV() {
        if (dal.getTrinhDoHV() != null) {
            return dal.getTrinhDoHV();
        } else {
            JOptionPane.showMessageDialog(null, "Không chọn được tôn giáo");
            throw new ArithmeticException("Không chọn được tôn giáo");
        }
    }

    public ResultSet getTinhTrangHN() {
        if (dal.getTinhTranhHN() != null) {
            return dal.getTinhTranhHN();
        } else {
            JOptionPane.showMessageDialog(null, "Không chọn được tôn giáo");
            throw new ArithmeticException("Không chọn được tôn giáo");
        }
    }

    public ResultSet getVanHoa() {
        if (dal.getVanHoa() != null) {
            return dal.getVanHoa();
        } else {
            JOptionPane.showMessageDialog(null, "Không chọn được tôn giáo");
            throw new ArithmeticException("Không chọn được tôn giáo");
        }
    }

    public ResultSet getQuocTich() {
        if (dal.getQuocTich() != null) {
            return dal.getQuocTich();
        } else {
            JOptionPane.showMessageDialog(null, "Không chọn được tôn giáo");
            throw new ArithmeticException("Không chọn được tôn giáo");
        }
    }

    public void addNew(MyEmployee epl) {
        try {
            dal.addNew(epl);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NumberFormatException("Nhập liệu sai");
        }

    }

    public void update(MyEmployee epl) {
        try {
            dal.update(epl);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NumberFormatException("Nhập liệu sai");
        }

    }

    public void delete(MyEmployee epl) {
        try {
            dal.delete(epl);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NumberFormatException("Nhập liệu sai");
        }

    }

    public MyEmployeeList readEmployeeList() {
        ResultSet rs = dal.readEmployee();
        MyEmployeeList list = new MyEmployeeList();
        try {
            while (rs.next()) {
                Date NgaySinh = rs.getDate("ngaysinh");
                int ngaysinh = NgaySinh.getDay();
                int thangsinh = NgaySinh.getMonth();
                int namsinh = NgaySinh.getYear();

                Date NgayCap = rs.getDate("ngaycap");
                int ngaycap = NgayCap.getDay();
                int thangcap = NgayCap.getMonth();
                int namcap = NgayCap.getYear();
//                =======================
                MyEmployee epl = new MyEmployee();
                epl.setMaNV(rs.getInt("manhanvien"));
//                epl.setImg(linkImage);
                epl.setImgByte(rs.getBytes("anh"));
                epl.setHoDem(rs.getString("hoten"));
                epl.setTen(rs.getString("ten"));
                epl.setGioiTinh(rs.getBoolean("gioitinh"));
                epl.setSTK(rs.getString("sotaikhoan"));
                epl.setNgaySinh(ngaysinh);
                epl.setThangSinh(thangsinh);
                epl.setNamSinh(namsinh);
//                epl.setNoiSinh(rs.getString("noisinh"));
                epl.setMST(rs.getString("msthue"));
                epl.setTamTru(rs.getString("tamtru"));
//                epl.setQuanHuyen(rs.getString("quan"));
//                epl.setQuocTich(rs.getString("quoctich"));
//                epl.setTTHonNhan(rs.getString("honnhan"));
                epl.setDienThoai(rs.getString("dienthoai"));
                epl.setDiDong(rs.getString("didong"));
//                epl.setEmail(rs.getString("email"));
                epl.setCMND(rs.getString("cmnd"));
//                epl.setVanHoa(rs.getString("vanhoa"));
//                epl.setTrinhDoHV(rs.getString("hocvan"));
                epl.setNgayCap(ngaycap);
                epl.setThangCap(thangcap);
                epl.setNamCap(namcap);
//                epl.setNoiCap(rs.getString("noicap"));
//                epl.setNguyenQuan(rs.getString("nguyenquan"));
//                epl.setDanToc(rs.getInt("dantoc"));
//                epl.setTonGiao(rs.getString("tongiao"));
                epl.setThuongTru(rs.getString("thuongtru"));
//                epl.setHoKhau(rs.getString("hokhau"));
                epl.setGhiChu(rs.getString("ghichu"));

                list.listEmployee.add(epl);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Không thấy ảnh");
            ex.printStackTrace();
        }
        return null;
    }
//  Dang cong san

    public void addDCS(Team dcs) {
        try {
            dal.addDCS(dcs);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NumberFormatException("Nhập liệu sai");
        }
    }

    public Team readDCS(int MaNV) {
        ResultSet rs = dal.readDCS(MaNV);
        Team dcs = new Team();

        try {
            if (!rs.isBeforeFirst()) {
                System.out.println("Không có dữ liệu ĐCS");
                return null;
            }
            while (rs.next()) {
                Date NgayGiaNhap = rs.getDate("ngaygianhap");
                int ngayGN = NgayGiaNhap.getDay();
                int thangGN = NgayGiaNhap.getMonth();
                int namGN = NgayGiaNhap.getYear();

                dcs.setChucVu(rs.getString("chucvu"));
                dcs.setNoiSinhHoat(rs.getString("noisinhhoat"));
                dcs.setNamGiaNhap(namGN);
                dcs.setThangGiaNhap(thangGN);
                dcs.setNgayGiaNhap(ngayGN);
            }
            return dcs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void updateDCS(Team dcs) {
        try {
            dal.updateDCS(dcs);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NumberFormatException("Nhập liệu sai");
        }
    }

    public void deleteDCS(int MaNV) {
        try {
            dal.deleteDCS(MaNV);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NumberFormatException("Nhập liệu sai");
        }
    }
//    Doan thanh nien

    public void addDTN(Team dtn) {
        try {
            dal.addDTN(dtn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Team readDTN(int MaNV) {
        ResultSet rs = dal.readDTN(MaNV);
        Team dtn = new Team();

        try {
            if (!rs.isBeforeFirst()) {
                System.out.println("Không có dữ liệu đoàn thanh niên");
                return null;
            }
            while (rs.next()) {
                Date NgayGiaNhap = rs.getDate("ngaygianhap");
                int ngayGN = NgayGiaNhap.getDay();
                int thangGN = NgayGiaNhap.getMonth();
                int namGN = NgayGiaNhap.getYear();

                dtn.setChucVu(rs.getString("chucvu"));
                dtn.setNoiSinhHoat(rs.getString("noisinhhoat"));
                dtn.setNamGiaNhap(namGN);
                dtn.setThangGiaNhap(thangGN);
                dtn.setNgayGiaNhap(ngayGN);
            }
            return dtn;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void updateDTN(Team dtn) {
        try {
            dal.updateDTN(dtn);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NumberFormatException("Nhập liệu sai");
        }
    }

    public void deleteDTN(int MaNV) {
        try {
            dal.deleteDTN(MaNV);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NumberFormatException("Nhập liệu sai");
        }
    }
//    quan doi

    public void addQD(Team qd) {
        try {
            dal.addQD(qd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Team readQD(int MaNV) {
        ResultSet rs = dal.readQD(MaNV);
        Team qd = new Team();

        try {
            if (!rs.isBeforeFirst()) {
                System.out.println("Không có dữ liệu quân đội");
                return null;
            }
            while (rs.next()) {
                Date NgayGiaNhap = rs.getDate("ngaygianhap");
                int ngayGN = NgayGiaNhap.getDay();
                int thangGN = NgayGiaNhap.getMonth();
                int namGN = NgayGiaNhap.getYear();

                qd.setChucVu(rs.getString("chucvu"));
                qd.setNoiSinhHoat(rs.getString("noisinhhoat"));
                qd.setNamGiaNhap(namGN);
                qd.setThangGiaNhap(thangGN);
                qd.setNgayGiaNhap(ngayGN);
            }
            return qd;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void updateQD(Team qd) {
        try {
            dal.updateQD(qd);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NumberFormatException("Nhập liệu sai");
        }
    }

    public void deleteQD(int MaNV) {
        try {
            dal.deleteQD(MaNV);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NumberFormatException("Nhập liệu sai");
        }
    }
}
