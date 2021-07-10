/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpraktikum;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class BarangView extends JFrame{
    
    JButton btnKembali = new JButton("Kembali");
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID", "Nama", "Harga", "Gudang", "Stok", "Satuan", "Total Harga"};
    JLabel lInfo = new JLabel("Note : Sentuh baris dalam tabel untuk melihat detail barang.");

    public BarangView() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Barang");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(900,380);
        
        add(scrollPane);
        scrollPane.setBounds(0, 0, 900, 260);
        add(lInfo);
        lInfo.setBounds(20, 270, 500, 20);
        
        add(btnKembali);
        btnKembali.setBounds(13, 300, 200, 24);
        
    }
    
    public void setHide(){
        this.setVisible(false);
    }
    
    public void setVisible(){
        this.setVisible(true);
    }
    
    
}
