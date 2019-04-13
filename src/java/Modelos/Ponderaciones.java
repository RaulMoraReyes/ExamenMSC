
package Modelos;


public class Ponderaciones {

    private byte id;
    private int unidad;
    private byte porcentaje;
    private String id_Materia;

    
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
     * @return the unidad
     */
    public int getUnidad() {
        return unidad;
    }

    /**
     * @param unidad the unidad to set
     */
    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    /**
     * @return the porcentaje
     */
    public byte getPorcentaje() {
        return porcentaje;
    }

    /**
     * @param porcentaje the porcentaje to set
     */
    public void setPorcentaje(byte porcentaje) {
        this.porcentaje = porcentaje;
    }

    /**
     * @return the id_Materia
     */
    public String getId_Materia() {
        return id_Materia;
    }

    /**
     * @param id_Materia the id_Materia to set
     */
    public void setId_Materia(String id_Materia) {
        this.id_Materia = id_Materia;
    }



}
