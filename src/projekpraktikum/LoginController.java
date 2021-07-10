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
 * @author bayutri
 */
public class LoginController {
    LoginView loginView;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        
        loginView.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Login clicked");
                
                LoginModel loginModel = new LoginModel(loginView.getUsername(), loginView.getPassword());
                
                if(loginModel.getLoginStatus()){
                    MenuView menuView = new MenuView();
                    loginView.setHide();
                    MenuController menuController = new MenuController(menuView, loginView);
                }
            }
        });
    }
    
    
    
}
