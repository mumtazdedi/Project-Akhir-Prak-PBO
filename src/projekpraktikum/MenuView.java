/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpraktikum;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class MenuView extends JFrame{
//    Label
    JLabel lTitle = new JLabel("Admin");
    
//    Button
    JButton btnTambahBarang = new JButton("Tambah Barang");
    JButton btnLihatBarang = new JButton("Lihat Barang");
    JButton btnKeluar = new JButton("Keluar");
    
    public MenuView() {
        setTitle("Main Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(260,250);
        setLocationRelativeTo(null); 
        
        add(lTitle);
        lTitle.setBounds(20, 20, 90, 20);
        
        add(btnTambahBarang);
        btnTambahBarang.setBounds(20, 60, 200, 30);
        
        add(btnLihatBarang);
        btnLihatBarang.setBounds(20, 100, 200, 30);
        
        add(btnKeluar);
        btnKeluar.setBounds(20, 140, 120, 30);
    }
    
    public void setHide(){
        this.setVisible(false);
    }
    
    public void setVisible(){
        this.setVisible(true);
    }
}
