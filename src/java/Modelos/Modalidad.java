/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Marko
 */
public class Modalidad {
    private byte id;
    private String nombre_modalidad;

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getNombre_modalidad() {
        return nombre_modalidad;
    }

    public void setNombre_modalidad(String nombre_modalidad) {
        this.nombre_modalidad = nombre_modalidad;
    }
}
