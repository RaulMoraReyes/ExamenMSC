/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Carreras;

import Modelos.Carrera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marko
 */
public class OperacionesCarreras implements IOperacionesCarreras {


    @Override
    public List<Carrera> GetCarreras() {
        List<Carrera> lista = new ArrayList<>();
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Carreras";
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Carrera c = new Carrera();
                c.setCreditos_Maximos(rs.getShort(4));
                c.setId(rs.getByte(1));
                c.setNombre_Carrera(rs.getString(2));
                c.setNombre_Corto(rs.getString(3));
                lista.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public boolean Create(Carrera c) {
         boolean registrar = false;
        Connection con = null;
        String sql = "INSERT INTO Carreras (Nombre_Carrera, Nombre_Corto, Creditos_Maximos) values (?,?,?)";

        try {
            con = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = con.prepareStatement(sql);

            preparedStmt.setString(1, c.getNombre_Carrera());
            preparedStmt.setString(2, c.getNombre_Corto());
            preparedStmt.setInt(3, c.getCreditos_Maximos());
            preparedStmt.executeUpdate();
            registrar = true;
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar un carrera: " + e.getMessage());
        }
        return registrar;
    }

    @Override
    public boolean Edit(Carrera c) {
          Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        String sql = "update Carreras set Nombre_Carrera=?, Nombre_Corto=?, Creditos_Maximos=? where Id=?";
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setString(1, c.getNombre_Carrera());
            preparedStmt.setString(2, c.getNombre_Corto());
            preparedStmt.setInt(3, c.getCreditos_Maximos());
            preparedStmt.setByte(4, c.getId());
            preparedStmt.executeUpdate();
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
        }
        return actualizar;
    }

    @Override
    public boolean Delete(byte id) {
           Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        String sql = "delete from Carreras where Id=?";
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setByte(1, id);
            preparedStmt.executeUpdate();
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: eliminar carrera");
        }
        return actualizar;
    }

    @Override
    public Carrera GetCarrera(int id) {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        Carrera c = null;
        String sql = "select * from Carreras where Id=" + id;
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            rs.next();
            c = new Carrera();
           c.setId(rs.getByte(1));
           c.setNombre_Carrera(rs.getString("Nombre_Carrera"));
           c.setNombre_Corto(rs.getString("Nombre_Corto"));
           c.setCreditos_Maximos(rs.getShort(4));
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return c;
    }

}
