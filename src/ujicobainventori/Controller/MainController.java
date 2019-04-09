/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujicobainventori.Controller;

import java.awt.Color;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import ujicobainventori.Connection.Koneksi;

/**
 *
 * @author Kiddy
 */
public class MainController {
   
    public void get(JTable table, String sql) {
        try{
            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.open();
            
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public ResultSet getWithParameter(JTable table, Map map, String sql) {
        try{
            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.open();
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            map.forEach((k,v) -> {
                try {
                    ps.setString((int) k, v.toString());
                } catch (SQLException ex) {
                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            
            ResultSet rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs)); 
            return rs;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public ResultSet show(Map map, String sql){
        try{
            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.open();
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            map.forEach((k,v) -> {
                try {
                    ps.setString((int) k, v.toString());
                } catch (SQLException ex) {
                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            
             ResultSet rs = ps.executeQuery();
             
             return rs;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public boolean preparedStatement(Map map, String sql){
        try{
            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.open();
            PreparedStatement ps = con.prepareStatement(sql);
            
            map.forEach((k,v) -> {
                try {
                    ps.setString((int) k, v.toString());
                } catch (SQLException ex) {
                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            
            int rows = ps.executeUpdate();
            System.out.println("prepared Statement Executed!");
            return rows != 0;
        }
        catch(Exception e){
            System.err.println(e.getMessage());
            return false;
        }
    }
    
}
