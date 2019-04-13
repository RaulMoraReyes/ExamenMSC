/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractList;
import java.util.List;

import CRUD.Conexion;
import CRUD.IDocentesDAO;
import CRUD.Docentes;
import java.util.ArrayList;



/**
 *
 * @author miguel
 */
public class DocentesDaoImpl implements IDocentesDAO
{
    @Override
    public boolean registrar(Docentes docentes)
    {
        boolean registrar = false;
        Statement stm=null;
        Connection con=null;
        String sql="INSERT INTO Docentes (nombre, apellido_pat, apellido_mat, id_nombramiento, id_carrera, sexo," +
"					  horasclase, horasapoyo, pwd) values ('"+
                   docentes.getNombre()+"','"+docentes.getApellido_pat()+"','"+docentes.getApellido_mat()
                   +"','"+docentes.getId_nombramiento()+"','"+docentes.getId_carrera()+"','"+docentes.getSexo()+"','"+
                   docentes.getHorasclase()+"','"+docentes.getHorasapoyo()+"','"+docentes.getPwd()+"')";
                   //Agregar -> +"','"+docentes.getPwd() en caso de que se necesite el password
        
        try
        {
            con=Conexion.conectar();
            stm= con.createStatement();
            stm.execute(sql);
            
        }
        catch (SQLException e)
        {
            System.out.println("Error: La clase DocentesDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }
    
    @Override
    public List<Docentes> obtener()
    {
        Connection co=null;
        Statement stm=null;
        ResultSet rs=null;

        String sql="SELECT * FROM DOCENTES ORDER BY ID";
    
        List<Docentes> listaDocentes=new ArrayList<Docentes>();
    
        try
        {
            co=Conexion.conectar();
            stm= co.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next())
            {
                Docentes d=new Docentes();
                d.setId(rs.getInt(1));
                d.setNombre(rs.getString(2));
                d.setApellido_pat(rs.getString(3));
                d.setApellido_mat(rs.getString(4));
                d.setId_nombramiento(rs.getInt(5));
                d.setId_carrera(rs.getInt(6));
                d.setSexo(rs.getString(7).charAt(0));
                d.setHorasclase(rs.getInt(8));
                d.setHorasapoyo(rs.getInt(9));
               //-> d.setPwd(rs.getString(10));
               listaDocentes.add(d);
            }
            stm.close();
            rs.close();
            co.close();
        }
        catch(SQLException e)
        {
            System.out.println("Error: Clase DocentesDaoImpl, método obtener");
        }
             
        return listaDocentes;
}
 
    @Override
    public boolean actualizar(Docentes docentes) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connect=null;
        Statement stm=null;
        
        boolean actualizar=false;
        String sql="UPDATE Docentes SET nombre='"+docentes.getNombre()
                              +"', apellido_pat='"+docentes.getApellido_pat()
                              +"', apellido_mat='"+docentes.getApellido_mat()
                              +"', id_nombramiento='"+docentes.getId_nombramiento()
                              +"', id_carrera='"+docentes.getId_carrera()
                              +"', sexo='"+docentes.getSexo()
                              +"', horasclase='"+docentes.getHorasclase()
                              +"', horasapoyo='"+docentes.getHorasapoyo()
                              +"'" + "WHERE id="+docentes.getId();
        try
        {
            connect=Conexion.conectar();
            stm=connect.createStatement();
	    stm.execute(sql);
	    actualizar=true;
        } 
        catch (SQLException e) 
        {
                System.out.println("Error: Clase DocentesDaoImpl, método actualizar");
                e.printStackTrace();
        }		
        return actualizar;
        }
     @Override
    public boolean eliminar(Docentes docentes) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connect=null;
        Statement stm=null;
        boolean eliminar=false;
        String sql="DELETE FROM Docentes WHERE ID="+docentes.getId();
        try 
        {
            connect=Conexion.conectar();
            stm=connect.createStatement();
            stm.execute(sql);
            eliminar=true;
	} 
        catch (SQLException e) 
        {
            System.out.println("Error: Docente DocentesDaoImple, método eliminar");
            e.printStackTrace();
	}		
        return eliminar;
                
    }

    @Override
    public Docentes getDocente(int id) {
        Connection co=null;
        Statement stm=null;
        ResultSet rs=null;

        String sql="SELECT * FROM Docentes WHERE id="+id;
    
       Docentes d = null;
    
        try
        {
            co=Conexion.conectar();
            stm= co.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next())
            {
                d = new Docentes();
                d.setId(rs.getInt(1));
                d.setNombre(rs.getString(2));
                d.setApellido_pat(rs.getString(3));
                d.setApellido_mat(rs.getString(4));
                d.setId_nombramiento(rs.getInt(5));
                d.setId_carrera(rs.getInt(6));
                d.setSexo(rs.getString(7).charAt(0));
                d.setHorasclase(rs.getInt(8));
                d.setHorasapoyo(rs.getInt(9));
               //-> d.setPwd(rs.getString(10));
               //listaDocentes.add(d);
            }
            stm.close();
            rs.close();
            co.close();
        }
        catch(SQLException e)
        {
            System.out.println("Error: Clase DocentesDaoImpl, método obtener");
        }
             
        return d;
    }

    @Override
    public ArrayList<Docentes> obtenerDocentes() {
         Connection co=null;
        Statement stm=null;
        ResultSet rs=null;

        String sql="SELECT * FROM DOCENTES ORDER BY ID";
    
        ArrayList<Docentes> listaDocentes=new ArrayList<Docentes>();
    
        try
        {
            co=Conexion.conectar();
            stm= co.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next())
            {
                Docentes d=new Docentes();
                d.setId(rs.getInt(1));
                d.setNombre(rs.getString(2));
                d.setApellido_pat(rs.getString(3));
                d.setApellido_mat(rs.getString(4));
                d.setId_nombramiento(rs.getInt(5));
                d.setId_carrera(rs.getInt(6));
                d.setSexo(rs.getString(7).charAt(0));
                d.setHorasclase(rs.getInt(8));
                d.setHorasapoyo(rs.getInt(9));
               //-> d.setPwd(rs.getString(10));
               listaDocentes.add(d);
            }
            stm.close();
            rs.close();
            co.close();
        }
        catch(SQLException e)
        {
            System.out.println("Error: Clase DocentesDaoImpl, método obtener");
        }
             
        return listaDocentes;
    }
}

   
    



