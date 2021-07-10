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
public class TambahBarangModel {
    DBConnector connector = new DBConnector();
    
    public void insertData(String Nama, int Harga, String Gudang, int Stok, String Satuan){
        int jmlData=0;
        try {
           String query = "SELECT * FROM barang WHERE nama='" + Nama+"'";
           connector.statement = (Statement) connector.koneksi.createStatement();
           ResultSet resultSet = connector.statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
            
            if (jmlData==0) {                
                query = "INSERT INTO barang VALUES(NULL,'"+Nama+"',"+Harga+",'"+Gudang+"',"+Stok+",'"+Satuan+"')";

                connector.statement = (Statement) connector.koneksi.createStatement();
                connector.statement.executeUpdate(query); //execute query insert
                
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Barang Baru Berhasil ditambahkan");
            }
            else {
                JOptionPane.showMessageDialog(null, "Data Barang sudah ada, Silahkan cek di menu lihat Barang!");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
}
