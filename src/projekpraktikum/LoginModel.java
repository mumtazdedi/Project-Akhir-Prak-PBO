/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpraktikum;

import java.sql.*;
import javax.swing.JOptionPane; 

/**
 *
 * @author bayutri
 */
public class LoginModel {
    DBConnector connector = new DBConnector();
    boolean loginStatus = false;

    public LoginModel(String Username, String Password) {
        int jmlData=0;
        try {
           String query = "SELECT * FROM users WHERE username='" + Username+"' AND password='"+Password+"'";
           connector.statement = (Statement) connector.koneksi.createStatement();
           ResultSet resultSet = connector.statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
            
            if (jmlData==0) {                
                JOptionPane.showMessageDialog(null, "Username atau Password salah!");
            }
            else {
                loginStatus = true;
                JOptionPane.showMessageDialog(null, "Login berhasil!");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }    
    
    public boolean getLoginStatus(){
        return loginStatus;
    }
}
