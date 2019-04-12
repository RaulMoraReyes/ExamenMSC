/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Especialidades;

import Modelos.Especialidad;
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
public class OperacionesEspecialidades implements IOperacionesEspecialidades {

    @Override
    public boolean Create(Especialidad e) {
         boolean registrar = false;
        Connection con = null;
        String sql = "INSERT INTO Especialidades (Nombre_Especialidad) values (?)";

        try {
            con = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setString(1, e.getNombre_Especialidad());
            preparedStmt.executeUpdate();
            registrar = true;
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        return registrar;
    }

    @Override
    public boolean Edit(Especialidad e) {
         Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        String sql = "update Especialidades set Nombre_Especialidad=? where Id=?";
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setByte(2, e.getId());
            preparedStmt.setString(1, e.getNombre_Especialidad());
            preparedStmt.executeUpdate();
            actualizar = true;
        } catch (SQLException ex) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
        }
        return actualizar;
    }

    @Override
    public boolean Delete(byte Id) {
          Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        String sql = "delete from Especialidades where Id=?";
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setByte(1, Id);
            preparedStmt.executeUpdate();
            actualizar = true;
        } catch (SQLException ex) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
        }
        return actualizar;
    }

    @Override
    public List<Especialidad> GetEspecialidades() {
          List<Especialidad> lista = new ArrayList<>();
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Especialidades";
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Especialidad e = new Especialidad();
                e.setId(rs.getByte(1));
                e.setNombre_Especialidad(rs.getString(2));
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
    public Especialidad GetEspecialidad(byte Id) {
          Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        Especialidad e = null;
        String sql = "SELECT * FROM Especialidades where Id="+Id;
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            rs.next();
            e = new Especialidad();
          e.setId(rs.getByte("Id"));
          e.setNombre_Especialidad(rs.getString("Nombre_Especialidad"));
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return e;
    }
    
}
