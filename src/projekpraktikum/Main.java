/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpraktikum;

/**
 *
 * @author bayutri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBConnector conn = new DBConnector();
        LoginView loginView = new LoginView();
        LoginController loginController =  new LoginController(loginView);
    }
    
}
