
package Controlador.Actividades;

import Controlador.Actividades.*;
import Modelos.Actividades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class OperacionesActividades implements IOperacionesActividades {


    @Override
    public List<Actividades> GetActividades() {
        List<Actividades> lista = new ArrayList<>();
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Actividades";
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Actividades a = new Actividades();
                a.setDescripcion(rs.getString(45));
                a.setValor(rs.getByte(2));
                a.setId_Competencia(rs.getByte(1));
                a.setId_Ponderacion(rs.getByte(1));
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
    public boolean Create(Actividades a) {
         boolean registrar = false;
        Connection con = null;
        String sql = "insert into actividades(Descripcion, Valor, Id_Competencia, Id_Ponderacion)values(????)";

        try {
            con = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = con.prepareStatement(sql);

            preparedStmt.setString(1, a.getDescripcion());
            preparedStmt.setByte(2,a.getValor());
            preparedStmt.setInt(3,a.getId_Competencia());
            preparedStmt.setInt(4, a.getId_Ponderacion());
            preparedStmt.executeUpdate();
            registrar = true;
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar una actividad: " + e.getMessage());
        }
        return registrar;
    }

    @Override
    public boolean Edit(Actividades a) {
          Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        String sql = "update actividades set Descripcion=?, Valor=?, Id_Competencia=?, Id_Ponderacion=? where Id=?";        
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setString(1, a.getDescripcion());
            preparedStmt.setByte(2,a.getValor());
            preparedStmt.setInt(3,a.getId_Competencia());
            preparedStmt.setInt(4, a.getId_Ponderacion());
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
        String sql = "delete from actividades where Id=?";
        
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setByte(1, id);
            preparedStmt.executeUpdate();
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: eliminar actividad");
        }
        return actualizar;
    }

    @Override
    public Actividades GetActividades(int id) {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        Actividades a = null;
        String sql = "select * from actividades where Id=" + id;
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            rs.next();
            a=new Actividades();
            
            a.setId(rs.getByte(1));
            a.setDescripcion(rs.getString("descripcion"));
            a.setValor(rs.getByte(2));
            a.setId_Competencia(rs.getByte(1));
            a.setId_Ponderacion(rs.getByte(1));
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return a;
    }

}