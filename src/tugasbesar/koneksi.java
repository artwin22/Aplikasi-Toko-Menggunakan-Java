/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kuroko
 */
public class koneksi {
    private static Connection conn;
    
    public static Connection getKoneksi(){
        String url ="jdbc:mysql://localhost/tokokita";
        String user="root";
        String pass="";
        
        try {
            conn = (Connection) DriverManager.getConnection(url, user, pass);
        } catch (SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
        return conn;
    }
}