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
public class LoginView extends JFrame{
    JLabel lTitle = new JLabel("Selamat Datang");
    JLabel lUsername = new JLabel("Username");
    JLabel lPassword = new JLabel("Password");
    
    JTextField tfUsername = new JTextField();
    JTextField tfPassword = new JTextField();
    
//    Button
    JButton btnLogin = new JButton("Masuk");
    
    public LoginView() {
        setTitle("Aplikasi Gudang");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(440,250);
        setLocationRelativeTo(null); 
        
        add(lTitle);
        lTitle.setBounds(40, 20, 150, 20);
        add(lUsername);
        lUsername.setBounds(40, 70, 80, 20);
        add(lPassword);
        lPassword.setBounds(40, 100, 80, 20);
        
        add(tfUsername);
        tfUsername.setBounds(160, 70, 200, 20);
        add(tfPassword);
        tfPassword.setBounds(160, 100, 200, 20);
        
        add(btnLogin);
        btnLogin.setBounds(40, 150, 160, 30);
        
    }
    
    public String getUsername(){
        return tfUsername.getText();
    }
    
    public String getPassword(){
        return tfPassword.getText();
    }
    
    public void setHide(){
        this.setVisible(false);
    }
    
    public void setVisible(){
        this.setVisible(true);
    }
}
