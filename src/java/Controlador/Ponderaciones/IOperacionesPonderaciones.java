
package Controlador.Ponderaciones;
import Modelos.Ponderaciones;
import java.util.List;

public interface IOperacionesPonderaciones {
    public boolean Create(Ponderaciones p);
    public boolean Edit(Ponderaciones p);
    public boolean Delete(byte id);
    public List<Ponderaciones> GetPonderaciones();
    public Ponderaciones getPonderaciones(byte Id);
}
