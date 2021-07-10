/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpraktikum;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author bayutri
 */
public class UpdateBarangController {

    public UpdateBarangController(String dataBarang[][], UpdateBarangView updateBarangView, DetailBarangModel detailBarangModel, MenuView menuView) {
        updateBarangView.tfNama.setText(dataBarang[0][1]);
        updateBarangView.tfHarga.setText(dataBarang[0][2]);
        updateBarangView.tfGudang.setText(dataBarang[0][3]);
        updateBarangView.tfSatuan.setText(dataBarang[0][5]);
        
        updateBarangView.btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean namaNumberic = false;
                String Nama = updateBarangView.getNama();
                try {
                    Double num = Double.parseDouble(Nama);
                    namaNumberic = true;
                } catch (NumberFormatException e) {
                    namaNumberic = false;
                }
                try{
                    int Harga = Integer.parseInt(updateBarangView.getHarga());
                    
                    if(Harga < 0 || namaNumberic == true ){
                        JOptionPane.showMessageDialog(null, "Nama Harus Huruf, Harga harus bilangan positif");
                    }
                    else
                    {
                        detailBarangModel.updateData(Nama, Harga, updateBarangView.getGudang(), updateBarangView.getSatuan());
                        JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate!");
                    }
                    
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Gudang dan Satuan Harus huruf dan semua field harus diisi!");
                }
                
            }
        });
        
        updateBarangView.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                updateBarangView.dispose();
                DetailBarangView detailBarangView = new DetailBarangView(dataBarang[0][1]);
                DetailBarangModel detailBarangModel = new DetailBarangModel(dataBarang[0][0]);
                DetailBarangController detailBarangController = new DetailBarangController(detailBarangView, detailBarangModel, menuView);
            }
        });
        
        updateBarangView.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    updateBarangView.resetData();
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Gagal Reset Data");
                }
                
            }
        });
    }
    
}
