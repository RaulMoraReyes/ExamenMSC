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
public class Alumno {
    private String noControl;
    private String nombre;
    private String apepat;
    private String apemat;
    private byte id_Carrera;
    private byte semestre;
    private byte id_status;
    private byte id_Especialidad;
    private String grupo;
    private String sexo;
    private String CURP;
    private byte id_Modalidad;
    private String pwd;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public byte getId_Carrera() {
        return id_Carrera;
    }

    public void setId_Carrera(byte id_Carrera) {
        this.id_Carrera = id_Carrera;
    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }

    public byte getId_status() {
        return id_status;
    }

    public void setId_status(byte id_status) {
        this.id_status = id_status;
    }

    public byte getId_Especialidad() {
        return id_Especialidad;
    }

    public void setId_Especialidad(byte id_Especialidad) {
        this.id_Especialidad = id_Especialidad;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public byte getId_Modalidad() {
        return id_Modalidad;
    }

    public void setId_Modalidad(byte id_Modalidad) {
        this.id_Modalidad = id_Modalidad;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
