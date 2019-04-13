/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

/**
 *
 * @author miguel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DocentesDaoImpl d = new DocentesDaoImpl();
        for(Docentes doc : d.obtenerDocentes()){
            System.out.println(doc.getNombre() );
    }
    }
    
}
