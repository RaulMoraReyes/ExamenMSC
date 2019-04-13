/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.TipoCompetencias;

import Modelos.TipoCompetencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Apango
 */
public class OperacionesTipoCompetencias implements IOperacionesTipoCompetencias{

    @Override
    public boolean Create(TipoCompetencia tc) {
          boolean registrar = false;
        Connection con = null;
        String sql = "INSERT INTO tipocompetencia (Nombre_TipoCompetencia) values (?)";

        try {
            con = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setString(1, tc.getTipocompetencia());
            preparedStmt.executeUpdate();
            registrar = true;
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar el Tipo de Competencia: " + ex.getMessage());
        }
        return registrar;
    }


    @Override
    public List<TipoCompetencia> GetTipoCompetencias() {
        List<TipoCompetencia> lista = new ArrayList<>();
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM tipocompetencia";
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                TipoCompetencia tc = new TipoCompetencia();
                tc.setId(rs.getByte(1));
                tc.setTipocompetencia(rs.getString(2));
                lista.add(tc);
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
        String sql = "delete from tipocomptencia where Id=?";
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
    public TipoCompetencia GetTipoCompetencia(byte Id) {
            Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        TipoCompetencia tc = null;
        String sql = "SELECT * FROM tipocompetencia where Id="+Id;
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            rs.next();
            tc = new TipoCompetencia();
          tc.setId(rs.getByte("Id"));
          tc.setTipocompetencia(rs.getString("TipoCompetencia"));
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return tc;
    }

    @Override
    public boolean Edit(TipoCompetencia tc) {
         Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        String sql = "update Modalidades set TipoCompetencia=? where Id=?";
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setByte(2, tc.getId());
            preparedStmt.setString(1, tc.getTipocompetencia());
            preparedStmt.executeUpdate();
            actualizar = true;
        } catch (SQLException ex) {
            System.out.println("Error:");
        }
        return actualizar;
    }
}
