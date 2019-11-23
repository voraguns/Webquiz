/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author GunPc
 */
public class BuildConnection {
    
    public static Connection getConnection(){
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Webquiz", "adminna", "web2019");
        } catch (SQLException ex) {            
            Logger.getLogger(BuildConnection.class.getName()).log(Level.SEVERE,null, ex);
        }
        return null;
    }
    
    public static void main(String[] args) {
        System.out.println(BuildConnection.getConnection());
    }
}
