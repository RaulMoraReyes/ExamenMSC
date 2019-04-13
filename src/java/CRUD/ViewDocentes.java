/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;
import java.util.List;
import CRUD.Docentes;


/**
 *
 * @author miguel
 */
public class ViewDocentes 
{
    public void verDocentes(Docentes docente)
    {
        System.out.println("Datos del Docente: "+docente);
    }
    public void verDocentes(List<Docentes> docentes)
    {
        for (Docentes docente: docentes)
        {
            System.out.println("Datos del Docente: "+docente);
        }
    }
}
