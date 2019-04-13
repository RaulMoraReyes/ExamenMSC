/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Apango
 */
public class TipoCompetencia {
    
    private byte Id;
    private String tipocompetencia;

    /**
     * @return the Id
     */
    public byte getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(byte Id) {
        this.Id = Id;
    }

    /**
     * @return the tipocompetencia
     */
    public String getTipocompetencia() {
        return tipocompetencia;
    }

    /**
     * @param tipocompetencia the tipocompetencia to set
     */
    public void setTipocompetencia(String tipocompetencia) {
        this.tipocompetencia = tipocompetencia;
    }
    
}
