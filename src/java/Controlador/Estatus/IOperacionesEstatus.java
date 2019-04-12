/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Estatus;

import Modelos.Estatus;
import java.util.List;

/**
 *
 * @author Marko
 */
public interface IOperacionesEstatus {
    public boolean Create(Estatus e);
    public boolean Edit(Estatus e);
    public boolean Delete(byte Id);
    public List<Estatus> GetEstatus();
    public Estatus GetStatus(byte Id);
}
