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
public class Carrera {
    private byte id;
    private String nombre_Carrera;
    private String nombre_Corto;
    private short creditos_Maximos;

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getNombre_Carrera() {
        return nombre_Carrera;
    }

    public void setNombre_Carrera(String nombre_Carrera) {
        this.nombre_Carrera = nombre_Carrera;
    }

    public String getNombre_Corto() {
        return nombre_Corto;
    }

    public void setNombre_Corto(String nombre_Corto) {
        this.nombre_Corto = nombre_Corto;
    }

    public short getCreditos_Maximos() {
        return creditos_Maximos;
    }

    public void setCreditos_Maximos(short creditos_Maximos) {
        this.creditos_Maximos = creditos_Maximos;
    }

    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + ", nombre_Carrera=" + nombre_Carrera + ", nombre_Corto=" + nombre_Corto + ", creditos_Maximos=" + creditos_Maximos + '}';
    }
    
    
}
