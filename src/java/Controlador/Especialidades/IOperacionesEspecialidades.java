/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Especialidades;

import Modelos.Especialidad;
import java.util.List;

/**
 *
 * @author Marko
 */
public interface IOperacionesEspecialidades {
    public boolean Create(Especialidad e);
    public boolean Edit(Especialidad e);
    public boolean Delete(byte Id);
    public List<Especialidad> GetEspecialidades();
    public Especialidad GetEspecialidad(byte Id);
}
