/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Carreras;

import Modelos.Carrera;
import java.util.List;

/**
 *
 * @author Marko
 */
public interface IOperacionesCarreras {
    public boolean Create(Carrera c);
    public boolean Edit(Carrera c);
    public boolean Delete(byte id);
    public List<Carrera> GetCarreras();
     public Carrera GetCarrera(int id);
}
