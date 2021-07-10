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
public class DetailBarangModel {
    int idBarang;
    DBConnector connector = new DBConnector();
    
    public DetailBarangModel(String idBarang) {
        this.idBarang = Integer.parseInt(idBarang);
    }
    
    public String[][] readData(){
        try{            
            String data[][] = new String[1][6];
            
            connector.statement = connector.koneksi.createStatement();
            String query = "SELECT * FROM barang WHERE id="+this.idBarang; 
            ResultSet resultSet = connector.statement.executeQuery(query);
            while (resultSet.next()){
                data[0][0] = resultSet.getString("id"); //harus sesuai nama kolom di mysql
                data[0][1] = resultSet.getString("nama");                
                data[0][2] = resultSet.getString("harga");
                data[0][3] = resultSet.getString("gudang");
                data[0][4] = resultSet.getString("stok");
                data[0][5] = resultSet.getString("satuan");
                
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public void deleteData(){
        try{
            connector.statement = connector.koneksi.createStatement();
            String query = "DELETE FROM barang WHERE id="+this.idBarang; 
            connector.statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Barang Berhasil dihapus");
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    }
    
    public void updateData(String Nama, int Harga, String Gudang, String Satuan){
        try {
                String query = "UPDATE barang SET nama = '"+Nama+"', harga = "+Harga+", gudang = '"+Gudang+"', satuan = '"+Satuan+"' WHERE id = "+idBarang;

                connector.statement = (Statement) connector.koneksi.createStatement();
                connector.statement.executeUpdate(query); //execute query insert to data_Daerah
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void updateStok(int StokBaru){
        try {
                String query = "UPDATE barang SET stok="+StokBaru+" WHERE id = "+idBarang;

                connector.statement = (Statement) connector.koneksi.createStatement();
                connector.statement.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Data Stok Berhasil Diupdate!");
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
}
