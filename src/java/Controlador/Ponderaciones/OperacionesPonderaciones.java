
package Controlador.Actividades;

import Controlador.Ponderaciones.*;
import Modelos.Ponderaciones;
import Controlador.Materias.*;
import Modelos.Materias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class OperacionesPonderaciones implements IOperacionesPonderaciones {


    public List<Ponderaciones> getPonderacioneses() {
        List<Ponderaciones> lista = new ArrayList<>();
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM ponderaciones";
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Ponderaciones a = new Ponderaciones();
                a.setUnidad(rs.getByte(4));
                a.setPorcentaje(rs.getByte(4));
                a.setId_Materia(rs.getString(10));
                lista.add(a);
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
    public boolean Create(Ponderaciones a) {
         boolean registrar = false;
        Connection con = null;
        String sql="insert into ponderaciones(Unidad,Porcentaje,Id_Materia)values(???)";

        try {
            con = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = con.prepareStatement(sql);

            preparedStmt.setInt(1,a.getUnidad());
            preparedStmt.setByte(2,a.getPorcentaje());
            preparedStmt.setString(3,a.getId_Materia());
            preparedStmt.executeUpdate();
            registrar = true;
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar una ponderación: " + e.getMessage());
        }
        return registrar;
    }

    @Override
    public boolean Edit(Ponderaciones a) {
          Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        String sql="update ponderaciones set Unidad=?,Porcentaje=?,Id_Materia=? where Id=?";
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setInt(1, a.getUnidad());
            preparedStmt.setByte(2,a.getPorcentaje());
            preparedStmt.setString(3,a.getId_Materia());
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
        String sql = "delete from ponderaciones where Id=?";
        
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setByte(1, id);
            preparedStmt.executeUpdate();
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: eliminar ponderación");
        }
        return actualizar;
    }

    
    public Ponderaciones GetPonderaciones(int id) {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        Ponderaciones a = null;
        String sql = "select * from ponderaciones where Id=" + id;
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            rs.next();
            a=new Ponderaciones();
            
            a.setId(rs.getByte(1));
            a.setUnidad(rs.getInt(2));
            a.setPorcentaje(rs.getByte(4));
            a.setId_Materia(rs.getString("descripcion"));
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return a;
    }

    @Override
    public List<Ponderaciones> GetPonderaciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ponderaciones getPonderaciones(byte Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}