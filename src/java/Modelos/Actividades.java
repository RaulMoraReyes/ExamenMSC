
package Modelos;

public class Actividades {

    private byte id;
    private String descripcion;
    private byte valor;
    private int id_Competencia;
    private int id_Ponderacion;

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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the valor
     */
    public byte getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(byte valor) {
        this.valor = valor;
    }

    /**
     * @return the id_Competencia
     */
    public int getId_Competencia() {
        return id_Competencia;
    }

    /**
     * @param id_Competencia the id_Competencia to set
     */
    public void setId_Competencia(int id_Competencia) {
        this.id_Competencia = id_Competencia;
    }

    /**
     * @return the id_Ponderacion
     */
    public int getId_Ponderacion() {
        return id_Ponderacion;
    }

    /**
     * @param id_Ponderacion the id_Ponderacion to set
     */
    public void setId_Ponderacion(int id_Ponderacion) {
        this.id_Ponderacion = id_Ponderacion;
    }

}
