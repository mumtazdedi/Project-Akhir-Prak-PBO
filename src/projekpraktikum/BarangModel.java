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
public class BarangModel {
    DBConnector connector = new DBConnector();
    
    public String[][] readData(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][7];
            
            String query = "SELECT * FROM barang"; 
            ResultSet resultSet = connector.statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("nama");                
                data[jmlData][2] = resultSet.getString("harga");
                data[jmlData][3] = resultSet.getString("gudang");
                data[jmlData][4] = resultSet.getString("stok");
                data[jmlData][5] = resultSet.getString("satuan");
                
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public int getBanyakData(){
        int jmlData = 0;
        try{
            connector.statement = connector.koneksi.createStatement();
            String query = "SELECT * FROM barang";
            ResultSet resultSet = connector.statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
}
