/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.nguoidung.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import newpackage.hepbo.DatabaseHep;
import newpackage.nguoidung.NguoiDung;


/**
 *
 * @author ACER
 */
public class NguoiDungDao {

    public NguoiDung checkLogin(String tenDangNhap, String matKhau)
            throws Exception {
        String sql = "select tenDangNhap, matKhau, vaiTro from nguoidung "
                + "where tenDangNhap =? and matKhau =?";
        try  (
             Connection con = DatabaseHep.openConnection();
         PreparedStatement ps = con.prepareStatement(sql);
         ){
            ps.setString(1, tenDangNhap);
            ps.setString(2, matKhau);
           try(ResultSet rs = ps.executeQuery();){
               if (rs.next()) {
                   NguoiDung nd = new  NguoiDung();
                   nd.setTenDangNhap(tenDangNhap);
                   nd.setVaiTro(rs.getString("vaiTro"));
                   return nd;
               }
           } 
        }
        return null;
    }

}