/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Modalidades;

import Modelos.Carrera;
import Modelos.Especialidad;
import Modelos.Modalidad;
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
public class OperacionesModalidades implements IOperacionesModalidades{

    @Override
    public boolean Create(Modalidad m) {
          boolean registrar = false;
        Connection con = null;
        String sql = "INSERT INTO Modalidades (Nombre_Modalidad) values (?)";

        try {
            con = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setString(1, m.getNombre_modalidad());
            preparedStmt.executeUpdate();
            registrar = true;
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        return registrar;
    }


    @Override
    public List<Modalidad> GetModalidades() {
        List<Modalidad> lista = new ArrayList<>();
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Modalidades";
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Modalidad m = new Modalidad();
                m.setId(rs.getByte(1));
                m.setNombre_modalidad(rs.getString(2));
                lista.add(m);
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
    public boolean Delete(byte id) {
           Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        String sql = "delete from Modalidades where Id=?";
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
    public Modalidad GetModalidad(byte Id) {
            Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        Modalidad m = null;
        String sql = "SELECT * FROM Modalidades where Id="+Id;
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            rs.next();
            m = new Modalidad();
          m.setId(rs.getByte("Id"));
          m.setNombre_modalidad(rs.getString("Nombre_Modalidad"));
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return m;
    }

    @Override
    public boolean Edit(Modalidad m) {
         Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        String sql = "update Modalidades set Nombre_Modalidad=? where Id=?";
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setByte(2, m.getId());
            preparedStmt.setString(1, m.getNombre_modalidad());
            preparedStmt.executeUpdate();
            actualizar = true;
        } catch (SQLException ex) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
        }
        return actualizar;
    }
    
}
