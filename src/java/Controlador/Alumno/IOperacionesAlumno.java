/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Alumno;
import Modelos.Alumno;
import java.util.List;
/**
 *
 * @author Marko
 */
public interface IOperacionesAlumno {
    public boolean Create(Alumno a);
    public boolean Edit(Alumno a);
    public boolean Delete(String nocontrol);
    public List<Alumno> GetAlumnos();
    public Alumno GetAlumnno(String NoControl);
    public AlumnoCompleto GetAlumnoCompleto(String NoControl);
}
