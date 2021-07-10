/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpraktikum;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author bayutri
 */
public class DetailBarangView extends JFrame{
    JLabel lTitle = new JLabel("Detail Barang");
    JLabel lNama = new JLabel("Nama");
    JLabel lHarga = new JLabel("Harga (per-Satuan)");
    JLabel lGudang = new JLabel("Gudang");
    JLabel lStok = new JLabel("Stok");
    JLabel lSatuan = new JLabel("Satuan");
    
    JLabel lNamaValue = new JLabel("");
    JLabel lHargaValue = new JLabel("");
    JLabel lGudangValue = new JLabel("");
    JLabel lStokValue = new JLabel("");
    JLabel lSatuanValue = new JLabel("");
    
    JLabel lTambahStok = new JLabel("Tambah Stok");
    JTextField tfTambahStok = new JTextField();
    JButton btnTambahStok = new JButton("Tambah");
    
    JLabel lKurangiStok = new JLabel("Kurangi Stok");
    JTextField tfKurangiStok = new JTextField();
    JButton btnKurangiStok = new JButton("Kurangi");
    
    JButton btnEdit = new JButton("Edit");
    JButton btnHapus = new JButton("Hapus");
    JButton btnKembali = new JButton("Kembali");
    
    
    public DetailBarangView(String titleNama) {
        
        setTitle(titleNama);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(350,520);
        
        add(lTitle);
        lTitle.setBounds(110, 20, 160, 20);
        
        add(lNama);
        lNama.setBounds(20, 60, 150, 20);
        add(lHarga);
        lHarga.setBounds(20, 100, 150, 20);
        add(lGudang);
        lGudang.setBounds(20, 140, 150, 20);
        add(lStok);
        lStok.setBounds(20, 180, 150, 20);
        add(lSatuan);
        lSatuan.setBounds(20, 220, 150, 20);
        
        add(lNamaValue);
        lNamaValue.setBounds(180, 60, 200, 20);
        add(lHargaValue);
        lHargaValue.setBounds(180, 100, 200, 20);
        add(lGudangValue);
        lGudangValue.setBounds(180, 140, 200, 20);
        add(lStokValue);
        lStokValue.setBounds(180, 180, 200, 20);
        add(lSatuanValue);
        lSatuanValue.setBounds(180, 220, 200, 20);
        
        add(lTambahStok);
        lTambahStok.setBounds(20, 250, 150, 20);
        add(tfTambahStok);
        tfTambahStok.setBounds(20, 270, 100, 20);
        add(btnTambahStok);
        btnTambahStok.setBounds(140, 270, 120, 20);
        
        add(lKurangiStok);
        lKurangiStok.setBounds(20, 320, 150, 20);
        add(tfKurangiStok);
        tfKurangiStok.setBounds(20, 340, 100, 20);
        add(btnKurangiStok);
        btnKurangiStok.setBounds(140, 340, 120, 20);
        
        add(btnEdit);
        btnEdit.setBounds(40, 390, 80, 24);
        add(btnHapus);
        btnHapus.setBounds(140, 390, 80, 24);
        
        add(btnKembali);
        btnKembali.setBounds(10, 430, 310, 24);
        
    }
    
    public String getTambahStok(){
        return tfTambahStok.getText();
    }
    
    public String getKurangiStok(){
        return tfKurangiStok.getText();
    }
   
    public void setHide(){
        this.setVisible(false);
    }
    
    public void setVisible(){
        this.setVisible(true);
    }
}
