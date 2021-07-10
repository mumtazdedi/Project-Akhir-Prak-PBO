/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpraktikum;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/**
 *
 * @author bayutri
 */
public class TambahBarangController {
    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    
    public TambahBarangController(TambahBarangView tambahBarangView, TambahBarangModel tambahBarangModel, MenuView menuView) {
        
        tambahBarangView.btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
//                System.out.println("tambah clicked");
                try{
                    int harga = Integer.parseInt(tambahBarangView.getHarga());
                    int stok = Integer.parseInt(tambahBarangView.getStok());
                    if(pattern.matcher(tambahBarangView.getSatuan()).matches()){
                        JOptionPane.showMessageDialog(null, "Data Satuan tidak boleh angka!");
                    }else{
                        tambahBarangModel.insertData(tambahBarangView.getNama(), harga, tambahBarangView.getGudang(), stok, tambahBarangView.getSatuan());
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Pastikan data terisi dengan benar!");
                }
                
            }
        });
        
        tambahBarangView.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
//                System.out.println("reset clicked");
                tambahBarangView.resetData();
            }
        });
        
        tambahBarangView.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
//                System.out.println("kembali clicked");
                tambahBarangView.setHide();
                menuView.setVisible();
            }
        });
        
    }
    
    
}
