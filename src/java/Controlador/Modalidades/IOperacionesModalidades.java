/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Modalidades;

import Modelos.Especialidad;
import Modelos.Modalidad;
import java.util.List;

/**
 *
 * @author Marko
 */
public interface IOperacionesModalidades {
    public boolean Create(Modalidad m);
    public boolean Edit(Modalidad m);
    public boolean Delete(byte id);
    public List<Modalidad> GetModalidades();
    public Modalidad GetModalidad(byte Id);
}
