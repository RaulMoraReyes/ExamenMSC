/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Competencias;

import Controlador.Competencias.*;
//import Modelos.TipoCompetencia;
import Modelos.Competencia;
import java.util.List;

/**
 *
 * @author EdgarDegante
 */
public interface IOperacionesCompetencias {
    public boolean Create(Competencia c);
    public boolean Edit(Competencia c);
    public boolean Delete(byte id);
    public List<Competencia> GetCompetencias();
    public Competencia GetCompetencia(byte Id);
}
