/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpraktikum;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class MenuController {
    MenuView menuView;
    
    public MenuController(MenuView menuView, LoginView loginView) {
        this.menuView = menuView;
        
        menuView.btnTambahBarang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("tambah clicked");
                TambahBarangView tambahBarangView = new TambahBarangView();
                menuView.setHide();
                TambahBarangModel tambahBarangModel = new TambahBarangModel();
                TambahBarangController tambahBarangController = new TambahBarangController(tambahBarangView, tambahBarangModel, menuView);
            }
        });
         
        menuView.btnLihatBarang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("lihat clicked");
                
                BarangView barangView = new BarangView();
                menuView.setHide();
                BarangModel barangModel = new BarangModel();
                BarangController barangController = new BarangController(barangView, barangModel, menuView);
            }
        });
        
        menuView.btnKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                menuView.dispose();
                loginView.setVisible();
            }
        });
         
    }
    
}
