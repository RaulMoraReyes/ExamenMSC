/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Estatus;

import Modelos.Carrera;
import Modelos.Estatus;
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
public class OperacionesEstatus implements IOperacionesEstatus {

    @Override
    public boolean Create(Estatus e) {
           boolean registrar = false;
        Connection con = null;
        String sql = "INSERT INTO Estatus (Nombre_Estatus) values (?)";

        try {
            con = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setString(1, e.getNombre_Estatus());
            preparedStmt.executeUpdate();
            registrar = true;
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        return registrar;
    }

    @Override
    public boolean Edit(Estatus e) {
          Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        String sql = "update Estatus set Nombre_Estatus=? where Id=?";
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setByte(2, e.getId());
            preparedStmt.setString(1, e.getNombre_Estatus());
            preparedStmt.executeUpdate();
            actualizar = true;
        } catch (SQLException ex) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
        }
        return actualizar;
    }

    @Override
    public boolean Delete(byte id) {
          Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        String sql = "delete from Estatus where Id=?";
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setByte(1, id);
            preparedStmt.executeUpdate();
            actualizar = true;
        } catch (SQLException ex) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
        }
        return actualizar;
    }

    @Override
    public List<Estatus> GetEstatus() {
          List<Estatus> lista = new ArrayList<>();
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Estatus";
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Estatus e = new Estatus();
                e.setId(rs.getByte(1));
                e.setNombre_Estatus(rs.getString(2));
                lista.add(e);
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
    public Estatus GetStatus(byte Id) {
            Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        Estatus e = null;
        String sql = "SELECT * FROM Estatus where Id="+Id;
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            rs.next();
            e = new Estatus();
          e.setId(rs.getByte("Id"));
          e.setNombre_Estatus(rs.getString("Nombre_Estatus"));
            stm.close();
            rs.close();
            co.close();
            System.out.println("YA regresé");
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return e;
    }
    
}
