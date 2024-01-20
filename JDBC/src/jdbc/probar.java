/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class probar {

     public static void main(String[] args) {
        try {
            cbdd c = new cbdd();
            System.out.println("-->  "+c.obtener().toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(probar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(probar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
