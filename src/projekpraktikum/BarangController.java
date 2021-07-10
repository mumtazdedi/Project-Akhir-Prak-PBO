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
public class BarangController {

    public BarangController(BarangView barangView, BarangModel barangModel, MenuView menuView) {
        
        if (barangModel.getBanyakData()!=0) {
            String dataBarang[][] = barangModel.readData();
            for(int i=0;i<barangModel.getBanyakData();i++){
                String Harga = "Rp." + dataBarang[i][2];
                int TotalHarga = Integer.parseInt(dataBarang[i][2])*Integer.parseInt(dataBarang[i][4]);
                
                dataBarang[i][2] = Harga;
                dataBarang[i][6] = "Rp." + Integer.toString(TotalHarga);
            }
            barangView.tabel.setModel((new JTable(dataBarang, barangView.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Belum ada data");
        }
        
        barangView.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                barangView.dispose();
                menuView.setVisible();
            }
        });
        
        barangView.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = barangView.tabel.getSelectedRow();
//                int kolom = lihatVieww.tabel.getSelectedColumn(); // ga kepake sekarang

                String namaTerpilih = barangView.tabel.getValueAt(baris, 1).toString();
                String idTerpilih = barangView.tabel.getValueAt(baris, 0).toString();
//                System.out.println(namaTerpilih);
//                System.out.println(idTerpilih);

                barangView.dispose();
//                
                DetailBarangView detailBarangView = new DetailBarangView(namaTerpilih);
                DetailBarangModel detailBarangModel = new DetailBarangModel(idTerpilih);
                DetailBarangController detailBarangController = new DetailBarangController(detailBarangView, detailBarangModel, menuView);

            }
        }
        );
    }
}
