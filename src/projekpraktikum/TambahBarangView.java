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
public class TambahBarangView extends JFrame{
    JLabel lTitle = new JLabel("Tambah Barang");
    JLabel lNama = new JLabel("Nama");
    JLabel lHarga = new JLabel("Harga (per-Satuan)");
    JLabel lGudang = new JLabel("Gudang");
    JLabel lStok = new JLabel("Stok");
    JLabel lSatuan = new JLabel("Satuan");
    
    JTextField tfNama = new JTextField();
    JTextField tfHarga = new JTextField();
    JTextField tfGudang = new JTextField();
    JTextField tfStok = new JTextField();
    JTextField tfSatuan = new JTextField();
    
//    Button
    JButton btnSimpan = new JButton("Simpan");
    JButton btnReset = new JButton("Reset");
    JButton btnKembali = new JButton("Kembali");
    
    public TambahBarangView() {
        setTitle("Aplikasi Gudang");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(470,380);
        setLocationRelativeTo(null); 
        
        add(lTitle);
        lTitle.setBounds(40, 20, 150, 20);
        add(lNama);
        lNama.setBounds(40, 70, 150, 20);
        add(lHarga);
        lHarga.setBounds(40, 100, 150, 20);
        add(lGudang);
        lGudang.setBounds(40, 130, 150, 20);
        add(lStok);
        lStok.setBounds(40, 160, 150, 20);
        add(lSatuan);
        lSatuan.setBounds(40, 190, 150, 20);

        
        add(tfNama);
        tfNama.setBounds(200, 70, 200, 20);
        add(tfHarga);
        tfHarga.setBounds(200, 100, 200, 20);
        add(tfGudang);
        tfGudang.setBounds(200, 130, 200, 20);
        add(tfStok);
        tfStok.setBounds(200, 160, 200, 20);
        add(tfSatuan);
        tfSatuan.setBounds(200, 190, 200, 20);
        
        add(btnSimpan);
        btnSimpan.setBounds(40, 240, 160, 30);
        add(btnReset);
        btnReset.setBounds(240, 240, 160, 30);
        add(btnKembali);
        btnKembali.setBounds(40, 290, 360, 30);
        
    }
    
    public String getNama(){
        return tfNama.getText();
    }
    
    public String getHarga(){
        return tfHarga.getText();
    }
    
    public String getGudang(){
        return tfGudang.getText();
    }
    
    public String getStok(){
        return tfStok.getText();
    }
    
    public String getSatuan(){
        return tfSatuan.getText();
    }
    
    public void setHide(){
        this.setVisible(false);
    }
    
    public void setVisible(){
        this.setVisible(true);
    }
    
    public void resetData(){
        tfNama.setText("");
        tfHarga.setText("");
        tfGudang.setText("");
        tfStok.setText("");
        tfSatuan.setText("");
    }
}
