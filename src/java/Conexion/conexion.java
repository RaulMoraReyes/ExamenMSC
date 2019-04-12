/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Marko
 */
public class conexion {
    
    public static Connection conectar() {
        Connection con = null;

        String password = "...";
        String usuario = "root";
        String url = "jdbc:mysql://localhost:3306/BDMaestria?user=" + usuario
                + "&password=" + password+"&useSSL=false";
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
