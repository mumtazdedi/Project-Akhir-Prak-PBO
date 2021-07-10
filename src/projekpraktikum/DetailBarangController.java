/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpraktikum;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author bayutri
 */
public class DetailBarangController {
    DetailBarangView detailBarangView;
    DetailBarangModel detailBarangModel;
    int stokLama, idBarang;
    public DetailBarangController(DetailBarangView detailBarangView, DetailBarangModel detailBarangModel, MenuView menuView) {        
        this.detailBarangModel = detailBarangModel;
        this.detailBarangView = detailBarangView;
        
        try{
            updateData();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Membaca Data");
        }
        
        detailBarangView.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                detailBarangView.dispose();
                
                BarangView barangView = new BarangView();
                BarangModel barangModel = new BarangModel();
                BarangController barangController = new BarangController(barangView, barangModel, menuView);
            }
        });
        
        detailBarangView.btnTambahStok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String StringStok = detailBarangView.getTambahStok();
                try{
                    int TambahStok = Integer.parseInt(StringStok);
                    if(TambahStok < 0){
                        JOptionPane.showMessageDialog(null, "Data Harus Angka Positif!");
                    }else{
                        detailBarangModel.updateStok(stokLama+TambahStok);
                        detailBarangView.tfTambahStok.setText("");
                        updateData();
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Data Harus Terisi dan Angka!");
                }
            }
        });
        
        detailBarangView.btnKurangiStok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String StringStok = detailBarangView.getKurangiStok();
                try{
                    int KurangiStok = Integer.parseInt(StringStok);
                    if(KurangiStok < 0){
                        JOptionPane.showMessageDialog(null, "Data Harus Angka Positif!");
                    }else{
                        detailBarangModel.updateStok(stokLama-KurangiStok);
                        detailBarangView.tfKurangiStok.setText("");
                        updateData();
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Data Harus Terisi dan Angka!");
                }
            }
        });
        
        
        detailBarangView.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String dataBarang[][] = detailBarangModel.readData();
                UpdateBarangView updateBarangView = new UpdateBarangView(dataBarang[0][1]);
                detailBarangView.dispose();
                UpdateBarangController updateBarangController = new UpdateBarangController(dataBarang, updateBarangView, detailBarangModel, menuView);
            }
        });
        
        detailBarangView.btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int result = JOptionPane.showConfirmDialog(null, "Yakin Untuk Menghapus?", "WARNING",
                   JOptionPane.YES_NO_OPTION,
                   JOptionPane.QUESTION_MESSAGE);
                if(result == JOptionPane.YES_OPTION){
                   detailBarangModel.deleteData();
                }else if (result == JOptionPane.NO_OPTION){
                   
                }
            }
        });
    }
    
    private void updateData(){
            String dataBarang[][] = detailBarangModel.readData();
            detailBarangView.lNamaValue.setText(dataBarang[0][1]);
            detailBarangView.lHargaValue.setText(dataBarang[0][2]);
            detailBarangView.lGudangValue.setText(dataBarang[0][3]);
            detailBarangView.lStokValue.setText(dataBarang[0][4]);
            detailBarangView.lSatuanValue.setText(dataBarang[0][5]);
            
            this.idBarang = Integer.parseInt(dataBarang[0][0]);
            this.stokLama = Integer.parseInt(dataBarang[0][4]);
        }
}
