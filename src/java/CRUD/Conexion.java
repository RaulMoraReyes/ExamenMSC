/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

/**
 *
 * @author miguel
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Conexion {
	public static Connection conectar() {
		Connection con = null;
		
		String password = "Miguel.060390";
		String usuario = "root";
		String url = "jdbc:mysql://localhost:3306/BdMaestria?user=" + usuario
				+ "&password=" + password;
		try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url);
			if (con != null) {
				System.out.println("Conectado");
			}
		} catch (Exception e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		return con;
	}
}