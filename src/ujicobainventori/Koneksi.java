/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujicobainventori;

import java.sql.*;
/**
 *
 * @author Kiddy
 */
public class Koneksi {
    
    public Connection open()
    {
        Connection con;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:51688;instance=Hudya;databaseName=latihan";
            con = DriverManager.getConnection(url, "sa", "123456");
            System.out.println(con);
            return con;
        }
        catch (Exception e)
        {
            System.err.println(e);
            return null;
        }
    }
}
