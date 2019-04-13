/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;
import java.util.List;
import CRUD.Docentes;
import java.util.ArrayList;
/**
 *
 * @author miguel
 */
public interface IDocentesDAO 
{
    public boolean registrar(Docentes docentes);
    public List<Docentes> obtener();
     public ArrayList<Docentes> obtenerDocentes();
    public boolean actualizar(Docentes docentes);
    public boolean eliminar(Docentes docentes);
    public Docentes getDocente(int id);
}
