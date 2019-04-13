/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.TipoCompetencias;

import Modelos.TipoCompetencia;
import java.util.List;

/**
 *
 * @author Apango
 */
public interface IOperacionesTipoCompetencias {
    public boolean Create(TipoCompetencia tc);
    public boolean Edit(TipoCompetencia tc);
    public boolean Delete(byte id);
    public List<TipoCompetencia> GetTipoCompetencias();
    public TipoCompetencia GetTipoCompetencia(byte Id);
}
