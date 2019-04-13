/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

/**
 *
 * @author miguel
 */
public class Docentes 
{
    private int id;
    private String nombre;
    private String apellido_pat;
    private String apellido_mat;
    private int id_nombramiento;
    private int id_carrera;
    private char sexo;
    private int horasclase;
    private int horasapoyo;
    private String pwd; 
    /**
     * @return the pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd the pwd to set
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    
    
    public Docentes()
    {
        
    }
    public Docentes(/*int id,*/ String nombre, String apellido_pat, String apellido_mat,
                    int id_nombramiento, int id_carrera, char sexo, int horasclase,
                    int horasapoyo, String pwd)
    {
        this.id = id;
        this.nombre=nombre;
        this.apellido_pat=apellido_pat;
        this.apellido_mat=apellido_mat;
        this.id_nombramiento=id_nombramiento;
        this.id_carrera=id_carrera;
        this.sexo=sexo;
        this.horasclase=horasclase;
        this.horasapoyo=horasapoyo;
        this.pwd=pwd;
    }
    {
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
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
     * @return the apellido_pat
     */
    public String getApellido_pat() {
        return apellido_pat;
    }

    /**
     * @param apellido_pat the apellido_pat to set
     */
    public void setApellido_pat(String apellido_pat) {
        this.apellido_pat = apellido_pat;
    }

    /**
     * @return the apellido_mat
     */
    public String getApellido_mat() {
        return apellido_mat;
    }

    /**
     * @param apellido_mat the apellido_mat to set
     */
    public void setApellido_mat(String apellido_mat) {
        this.apellido_mat = apellido_mat;
    }

    /**
     * @return the id_nombramiento
     */
    public int getId_nombramiento() {
        return id_nombramiento;
    }

    /**
     * @param id_nombramiento the id_nombramiento to set
     */
    public void setId_nombramiento(int id_nombramiento) {
        this.id_nombramiento = id_nombramiento;
    }

    /**
     * @return the id_carrera
     */
    public int getId_carrera() {
        return id_carrera;
    }

    /**
     * @param id_carrera the id_carrera to set
     */
    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the horasclase
     */
    public int getHorasclase() {
        return horasclase;
    }

    /**
     * @param horasclase the horasclase to set
     */
    public void setHorasclase(int horasclase) {
        this.horasclase = horasclase;
    }

    /**
     * @return the horasapoyo
     */
    public int getHorasapoyo() {
        return horasapoyo;
    }

    /**
     * @param horasapoyo the horasapoyo to set
     */
    public void setHorasapoyo(int horasapoyo) {
        this.horasapoyo = horasapoyo;
    }
    
    @Override
    public String toString()
    {
        return this.getId()+", "+this.getNombre()+", "+this.getApellido_pat()+", "+this.getApellido_mat()+", "+this.getId_nombramiento()
               +", "+this.getId_carrera()+", "+this.getSexo()+", "+this.getHorasclase()+", "+this.getHorasapoyo()+", "+this.getPwd();
    }
    
}
