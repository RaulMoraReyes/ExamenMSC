
package Controlador.Actividades;

import Controlador.Actividades.*;
import Modelos.Actividades;
import java.util.List;

public interface IOperacionesActividades {
    public boolean Create(Actividades a);
    public boolean Edit(Actividades a);
    public boolean Delete(byte id);
    public List<Actividades> GetActividades();
     public Actividades GetActividades(int id);
}
