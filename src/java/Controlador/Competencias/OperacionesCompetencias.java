/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Competencias;

import Controlador.Modalidades.*;
//import Modelos.Carrera;
//import Modelos.TipoCompetencia;
import Modelos.Competencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EdgarDegante
 */
public class OperacionesCompetencias implements IOperacionesCompetencias{

    @Override
    public boolean Create(Competencia c) {
          boolean registrar = false;
        Connection con = null;
        String sql = "INSERT INTO Competencias (Nombre, ValorMaxino, Id_TipoCompetencia) values (?, ?, ?)";

        try {
            con = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setString(1, c.getNombre());
            preparedStmt.setByte(2, c.getValormaxino());
            preparedStmt.setByte(3, c.getId_tipocompetencia());
            preparedStmt.executeUpdate();
            registrar = true;
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al registrar la competencia: " + ex.getMessage());
        }
        return registrar;
    }


    @Override
    public List<Competencia> GetCompetencias() {
        List<Competencia> lista = new ArrayList<>();
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Competencias";
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Competencia c = new Competencia();
                c.setId(rs.getByte(1));
                c.setNombre(rs.getString(2));
                c.setValormaxino(rs.getByte(3));
                c.setId_tipocompetencia(rs.getByte(4));
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
    public boolean Delete(byte id) {
           Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        String sql = "delete from Competencias where Id=?";
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setByte(1, id);
            preparedStmt.executeUpdate();
            actualizar = true;
        } catch (SQLException ex) {
            System.out.println("Error");
        }
        return actualizar;
    }

    @Override
    public Competencia GetCompetencia(byte Id) {
            Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        Competencia c = null;
        String sql = "SELECT * FROM Competencias where Id="+Id;
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            rs.next();
            c = new Competencia();
          
            c.setId(rs.getByte("Id"));
            c.setNombre(rs.getString("Nombre"));
            c.setValormaxino(rs.getByte("ValorMaxino"));
            c.setId_tipocompetencia(rs.getByte("Id_TipoCompetencia"));

            stm.close();
            rs.close();
            co.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return c;
    }

    @Override
    public boolean Edit(Competencia c) {
        Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        String sql = "update Coompetencias set Nombre=?, ValorMaxino=?, Id_TipoCompetencia=?, where Id=?";
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setByte(4, c.getId());
            preparedStmt.setString(3, c.getNombre());
            preparedStmt.setByte(2, c.getValormaxino());
            preparedStmt.setByte(1, c.getId_tipocompetencia());
            preparedStmt.executeUpdate();
            actualizar = true;
        } catch (SQLException ex) {
            System.out.println("Error al editar");
        }
        return actualizar;
    }
    
}
