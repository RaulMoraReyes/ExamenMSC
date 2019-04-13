/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;
import java.util.List;
import java.util.ArrayList;
import CRUD.Docentes;
import CRUD.IDocentesDAO;
import CRUD.DocentesDaoImpl;
import CRUD.ViewDocentes;

/**
 *
 * @author miguel
 */
public class ControllerDocentes 
{
  private ViewDocentes vista= new ViewDocentes();
	
	public ControllerDocentes() 
        {
	}
	
	//llama al DAO para guardar un docente
	public void registrar(Docentes docentes) 
        {
		IDocentesDAO dao= new DocentesDaoImpl();
		dao.registrar(docentes);
	}
	
	//llama al DAO para actualizar un docente
	public void actualizar(Docentes docentes) 
        {
		IDocentesDAO dao= new DocentesDaoImpl();
		dao.actualizar(docentes);
	}
	
	//llama al DAO para eliminar un docente
	public void eliminar(Docentes docentes)
        {
		IDocentesDAO dao= new DocentesDaoImpl();
		dao.eliminar(docentes);
	}
	
	//llama al DAO para obtener todos los clientes y luego los muestra en la vista
	public void verDocentes(){
		List<Docentes> docentes = new ArrayList<Docentes>();
		IDocentesDAO dao= new DocentesDaoImpl();
		docentes=dao.obtener();
		vista.verDocentes(docentes);
	}
        
        
        public ArrayList<Docentes> verListaDocentes(){
		ArrayList<Docentes> docentes = new ArrayList<Docentes>();
		IDocentesDAO dao= new DocentesDaoImpl();
		docentes=dao.obtenerDocentes();
		//vista.verDocentes(docentes);
                return docentes;
	}
        
        public Docentes verDocente(int id){
		
		IDocentesDAO dao= new DocentesDaoImpl();
		Docentes d = dao.getDocente(id);
                
		return d;
	}
        
        
}
