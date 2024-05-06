package mysecondproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author RAIMY
 */
public class conexion {
    public String db = "drl_services";
    public String url = "jdbc:mysql://localhost/" + db;
    public String user = "root";
    public String pass = "123456";
    
    public Connection Conect(){
        Connection link = null;
    
             try{
                    link = DriverManager.getConnection(this.url,this.user, this.pass);
                }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,ex);
                 }
            return link;
    }
}
