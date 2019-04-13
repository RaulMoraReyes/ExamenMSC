/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;
import CRUD.Docentes;
import CRUD.ControllerDocentes;
import CRUD.Conexion;
import CRUD.IDocentesDAO;
import CRUD.DocentesDaoImpl;

/**
 *
 * @author miguel
 */
public class Probador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Conexion.conectar();
      Docentes docente = new Docentes();			
		
		//controlador
		ControllerDocentes controller = new ControllerDocentes();
 
		// guarda un docente a través del controlador
		//controller.registrar(docente);
                
		//ver docentes;
		controller.verDocentes(); 
                
		// editar un docente por medio del id
		//Docentes d = controller.verDocente(3);
                //if(d == null){
                //    System.out.println("No existe");
               // }
                //else{
                  //  d.setNombre("Alfredo");
                   // controller.actualizar(d);
               // }
 
		//eliminar un docente por medio del id
		//docente.setId(5);
		//controller.eliminar(docente);
               
    }
    
}
