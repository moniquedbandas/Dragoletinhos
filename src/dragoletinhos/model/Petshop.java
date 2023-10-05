package dragoletinhos.model;

import dragoletinhos.view.TelaLogin;
import javax.swing.JFrame;

public class Petshop {
   
    public static void main(String[] args) {        
        TelaLogin telLog = new TelaLogin();
        telLog.setVisible(true);
        telLog.setSize(400,500);        
        telLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }    
}
