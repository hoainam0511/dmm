/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.nguoidung.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import newpackage.hepbo.DatabaseHep;
import newpackage.nguoidung.BangDiem;

/**
 *
 * @author ACER
 */
public class BangDiemDao {

    public boolean insert(BangDiem bd)
            throws Exception {

        String sql = "INSERT INTO [dbo].[BangDiem]([MaSinhVien],[TiengAnh],[TinHoc],[GDTC]) values(?,?,?,?)";
        try (
                Connection con = DatabaseHep.openConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {

            ps.setString(1, bd.getMaSinhVien());
            ps.setFloat(2, bd.getTiengAnh());
            ps.setFloat(3, bd.getTinHoc());
            ps.setFloat(4, bd.getGDTC());

            return ps.executeUpdate() > 0;
        }
    }

    public boolean update(BangDiem bd)
            throws Exception {

        String sql = "UPDATE [dbo].[BangDiem]"
                + " SET [TiengAnh] = ?,[TinHoc] = ?,[GDTC] = ?"
                + " WHERE [MaSinhVien] = ?";
        try (
                Connection con = DatabaseHep.openConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {

            ps.setString(4, bd.getMaSinhVien());
            ps.setFloat(1, bd.getTiengAnh());
            ps.setFloat(2, bd.getTinHoc());
            ps.setFloat(3, bd.getGDTC());

            return ps.executeUpdate() > 0;
        }
    }

    public boolean deleteByMaSinhVien(String maSinhVien)
            throws Exception {

        String sql = "delete from [BangDiem]"
                + "WHERE [MaSinhVien] = ? ";
        try (
                Connection con = DatabaseHep.openConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {

            ps.setString(1, maSinhVien);

            return ps.executeUpdate() > 0;
        }
    }

    public BangDiem findByMaSinhVien(String maSinhVien)
            throws Exception {

        String sql = "select * from [BangDiem]"
                + "WHERE [MaSinhVien] = ? ";
        try (
                Connection con = DatabaseHep.openConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {

            ps.setString(1, maSinhVien);

            try (ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    BangDiem bd = createBangDiem(rs);

                    return bd;
                }
            }
            return null;
        }
    }

    private BangDiem createBangDiem(final ResultSet rs) throws SQLException {
        BangDiem bd = new BangDiem();
        bd.setMa(rs.getInt("Ma"));
        bd.setMaSinhVien(rs.getString("maSinhVien"));
        bd.setTiengAnh(rs.getFloat("TiengAnh"));
        bd.setTinHoc(rs.getFloat("TinHoc"));
        bd.setGDTC(rs.getFloat("GDTC"));
        return bd;
    }

    public List<BangDiem> findAll(String maSinhVien)
            throws Exception {

        String sql = "select * from [BangDiem]";
        try (
                Connection con = DatabaseHep.openConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {

            ps.setString(1, maSinhVien);

            try (ResultSet rs = ps.executeQuery();) {
                List<BangDiem> list = new ArrayList<>();
                while (rs.next()) {
                    BangDiem bd = createBangDiem(rs);

                    list.add(bd);
                }
                return list;
            }
        }
    }

    public List<BangDiem> findTop(int top)
            throws Exception {

        String sql = "SELECT TOP "+ top +" *,(TiengAnh + TinHoc +GDTC ) /3 AS DTB "
                + "FROM dbo.BangDiem ORDER BY DTB DESC";
        try (
                Connection con = DatabaseHep.openConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {


            try (ResultSet rs = ps.executeQuery();) {
                List<BangDiem> list = new ArrayList<>();
                while (rs.next()) {
                    BangDiem bd = createBangDiem(rs);

                    list.add(bd);
                }
                return list;
            }
        }
    }
}
