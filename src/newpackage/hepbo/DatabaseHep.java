/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.hepbo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author ACER
 */
public class DatabaseHep {
    public static Connection openConnection() throws Exception{
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connStr = "jdbc:sqlserver://localhost;database=PolyApp;";
        String username = "nam";
        String pass = "1";
        Connection con = DriverManager.getConnection(connStr,username,pass);
        return con;
    }
}
