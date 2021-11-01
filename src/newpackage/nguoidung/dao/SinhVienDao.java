/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.nguoidung.dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.serial.SerialBlob;
import newpackage.hepbo.DatabaseHep;
import newpackage.nguoidung.NguoiDung;
import newpackage.nguoidung.SinhVien;

/**
 *
 * @author ACER
 */
public class SinhVienDao {

    public boolean insert(SinhVien sv)
            throws Exception {

        String sql = " INSERT INTO dbo.SinhVien(MaSinhVien,HoTen,Email,SoDT,GioiTinh,DiaChi,Hinh)"
                + "values(?,?,?,?,?,?,?)";
        try (
                Connection con = DatabaseHep.openConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, sv.getMaSinhVien());
            ps.setString(2, sv.getHoTen());
            ps.setString(3, sv.getEmail());
            ps.setString(4, sv.getSoDT());
            ps.setInt(5, sv.getGioiTinh());
            ps.setString(6, sv.getDiaChi());
            if (sv.getHinh() != null) {
                Blob hinh = new SerialBlob(sv.getHinh());
                ps.setBlob(7, hinh);
            } else {
                Blob hinh = null;
                ps.setBlob(7, hinh);
            }
            return ps.executeUpdate() > 0;
        }

    }

    public boolean update(SinhVien sv)
            throws Exception {

        String sql = "       UPDATE dbo.SinhVien"
                + " SET HoTen = ?,Email = ?,SoDT = ?,GioiTinh = ?,DiaChi = ?,Hinh = ? "
                + " where MaSinhVien =?";
        try (
                Connection con = DatabaseHep.openConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(7, sv.getMaSinhVien());
            ps.setString(1, sv.getHoTen());
            ps.setString(2, sv.getEmail());
            ps.setString(3, sv.getSoDT());
            ps.setInt(4, sv.getGioiTinh());
            ps.setString(5, sv.getDiaChi());
            if (sv.getHinh() != null) {
                Blob hinh = new SerialBlob(sv.getHinh());
                ps.setBlob(6, hinh);
            } else {
                Blob hinh = null;
                ps.setBlob(6, hinh);
            }
            return ps.executeUpdate() > 0;
        }

    }

    public boolean delete(String maSinhVien) throws Exception {

        String sql = "delete from sinhvien"
                + " where MaSinhVien =?";
        try (
                Connection con = DatabaseHep.openConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, maSinhVien);
            return ps.executeUpdate() > 0;
        }

    }

    public SinhVien findByid(String maSinhVien) throws Exception {

        String sql = "select * from sinhvien where maSinhVien = ?";
        try (
                Connection con = DatabaseHep.openConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, maSinhVien);
            try (ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    SinhVien sv = createSinhVien(rs);
                    return sv;
                }
            }
            return null;
        }

    }

    public List<SinhVien> findAll() throws Exception {

        String sql = "select * from sinhvien ";
        try (
                Connection con = DatabaseHep.openConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            try (ResultSet rs = ps.executeQuery();) {
                List<SinhVien> list = new ArrayList<>();
                while (rs.next()) {
                    SinhVien sv = createSinhVien(rs);
                    list.add(sv);
                }
                return list;
            }

        }

    }

    private SinhVien createSinhVien(final ResultSet rs) throws SQLException {
        SinhVien sv = new SinhVien();
        sv.setMaSinhVien(rs.getString("masinhvien"));
        sv.setHoTen(rs.getString("hoten"));
        sv.setEmail(rs.getString("email"));
        sv.setSoDT(rs.getString("soDT"));
        sv.setDiaChi(rs.getString("diachi"));
        sv.setGioiTinh(rs.getInt("gioitinh"));
        Blob blob = rs.getBlob("hinh");
        if (blob != null) {
            sv.setHinh(blob.getBytes(0, (int) blob.length()));
        }
        return sv;
    }
}
