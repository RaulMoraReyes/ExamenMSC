/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Alumno;

import Modelos.Alumno;
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
public class OperacionesAlumno implements IOperacionesAlumno {

    @Override
    public boolean Create(Alumno a) {
        boolean registrar = false;
        Connection con = null;
        String sql = "INSERT INTO Alumnos values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            con = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = con.prepareStatement(sql);

            preparedStmt.setString(1, a.getNoControl());
            preparedStmt.setString(2, a.getNombre());
            preparedStmt.setString(3, a.getApepat());
            preparedStmt.setString(4, a.getApemat());
            preparedStmt.setByte(5, a.getId_Carrera());
            preparedStmt.setByte(6, a.getSemestre());
            preparedStmt.setByte(7, a.getId_status());
            preparedStmt.setByte(8, a.getId_Especialidad());
            preparedStmt.setString(9, a.getGrupo());
            preparedStmt.setString(10, a.getSexo());
            preparedStmt.setString(11, a.getCURP());
            preparedStmt.setByte(12, a.getId_Modalidad());
            preparedStmt.setString(13, a.getPwd());

            preparedStmt.executeUpdate();
            registrar = true;
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar un alumno: " + e.getMessage());
        }
        return registrar;
    }

    @Override
    public boolean Edit(Alumno a) {
        Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        String sql = "update Alumnos set Nombre=?, Apepat=?, Apemat=?, Id_Carrera=?, Semestre=?, Id_Status=?, Id_Especialidad=?, Grupo=?, Sexo=?, CURP=?, Id_Modalidad=?, Pwd=? where NoControl=?";
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setString(1, a.getNombre());
            preparedStmt.setString(2, a.getApepat());
            preparedStmt.setString(3, a.getApemat());
            preparedStmt.setByte(4, a.getId_Carrera());
            preparedStmt.setByte(5, a.getSemestre());
            preparedStmt.setByte(6, a.getId_status());
            preparedStmt.setByte(7, a.getId_Especialidad());
            preparedStmt.setString(8, a.getGrupo());
            preparedStmt.setString(9, a.getSexo());
            preparedStmt.setString(10, a.getCURP());
            preparedStmt.setByte(11, a.getId_Modalidad());
            preparedStmt.setString(12, a.getPwd());
            preparedStmt.setString(13, a.getNoControl());
            preparedStmt.executeUpdate();
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
        }
        return actualizar;
    }

    @Override
    public boolean Delete(String nocontrol) {
         Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        String sql = "delete from Alumnos where NoControl=?";
        try {
            connect = Conexion.conexion.conectar();
            PreparedStatement preparedStmt = connect.prepareStatement(sql);
            preparedStmt.setString(1, nocontrol);
            preparedStmt.executeUpdate();
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
        }
        return actualizar;
    }

    @Override
    public List<Alumno> GetAlumnos() {
        List<Alumno> lista = new ArrayList<>();
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Alumnos";
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Alumno a = new Alumno();
                a.setNoControl(rs.getString("NoControl"));
                a.setNombre(rs.getString("Nombre"));
                a.setApepat(rs.getString("Apepat"));
                a.setApemat(rs.getString("Apemat"));
                a.setId_Carrera(rs.getByte("Id_Carrera"));
                a.setSemestre(rs.getByte("Semestre"));
                a.setId_status(rs.getByte("Id_Status"));
                a.setId_Especialidad(rs.getByte("Id_Especialidad"));
                a.setGrupo(rs.getString("Grupo"));
                a.setSexo(rs.getString("Sexo"));
                a.setCURP(rs.getString("CURP"));
                a.setId_Modalidad(rs.getByte("Id_Modalidad"));
                a.setPwd(rs.getString("Pwd"));
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
    public Alumno GetAlumnno(String NoControl) {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        Alumno a = null;
        String sql = "SELECT * FROM Alumnos where NoControl='" + NoControl + "'";
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            rs.next();
            a = new Alumno();
            a.setNoControl(rs.getString("NoControl"));
            a.setNombre(rs.getString("Nombre"));
            a.setApepat(rs.getString("Apepat"));
            a.setApemat(rs.getString("Apemat"));
            a.setId_Carrera(rs.getByte("Id_Carrera"));
            a.setSemestre(rs.getByte("Semestre"));
            a.setId_status(rs.getByte("Id_Status"));
            a.setId_Especialidad(rs.getByte("Id_Especialidad"));
            a.setGrupo(rs.getString("Grupo"));
            a.setSexo(rs.getString("Sexo"));
            a.setCURP(rs.getString("CURP"));
            a.setId_Modalidad(rs.getByte("Id_Modalidad"));
            a.setPwd(rs.getString("Pwd"));
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return a;
    }

    @Override
    public AlumnoCompleto GetAlumnoCompleto(String NoControl) {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        AlumnoCompleto a = null;
        String sql = "select a.*, c.Nombre_Carrera, e.Nombre_Estatus, esp.Nombre_Especialidad, m.Nombre_Modalidad from Alumnos as a inner join Carreras as c on a.Id_Carrera = c.Id inner join Estatus as e on a.Id_Status = e.Id inner join Especialidades as esp on a.Id_Especialidad = esp.Id inner join Modalidades as m on a.Id_Modalidad = m.Id where a.NoControl='" + NoControl + "'";
        try {
            co = Conexion.conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            rs.next();
            a = new AlumnoCompleto();
            a.setNoControl(rs.getString("NoControl"));
            a.setNombre(rs.getString("Nombre"));
            a.setApepat(rs.getString("Apepat"));
            a.setApemat(rs.getString("Apemat"));
            a.setId_Carrera(rs.getByte("Id_Carrera"));
            a.setSemestre(rs.getByte("Semestre"));
            a.setId_status(rs.getByte("Id_Status"));
            a.setId_Especialidad(rs.getByte("Id_Especialidad"));
            a.setGrupo(rs.getString("Grupo"));
            a.setSexo(rs.getString("Sexo"));
            a.setCURP(rs.getString("CURP"));
            a.setId_Modalidad(rs.getByte("Id_Modalidad"));
            a.setPwd(rs.getString("Pwd"));
            a.setCarrera(rs.getString("Nombre_Carrera"));
            a.setEstatus(rs.getString("Nombre_Estatus"));
            a.setEspecialidad(rs.getString("Nombre_Especialidad"));
            a.setModalidad(rs.getString("Nombre_Modalidad"));
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return a;
    }

}
