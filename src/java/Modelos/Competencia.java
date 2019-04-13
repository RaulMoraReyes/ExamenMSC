/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author EdgarDegante
 */
public class Competencia {
    private byte id;
    private String nombre;
    private byte valormaxino;
    private byte id_tipocompetencia;

    /**
     * @return the id
     */
    public byte getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(byte id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the valormaxino
     */
    public byte getValormaxino() {
        return valormaxino;
    }

    /**
     * @param valormaxino the valormaxino to set
     */
    public void setValormaxino(byte valormaxino) {
        this.valormaxino = valormaxino;
    }

    /**
     * @return the id_tipocompetencia
     */
    public byte getId_tipocompetencia() {
        return id_tipocompetencia;
    }

    /**
     * @param id_tipocompetencia the id_tipocompetencia to set
     */
    public void setId_tipocompetencia(byte id_tipocompetencia) {
        this.id_tipocompetencia = id_tipocompetencia;
    }
}
