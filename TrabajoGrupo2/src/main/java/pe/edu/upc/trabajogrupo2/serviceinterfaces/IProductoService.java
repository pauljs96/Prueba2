package pe.edu.upc.trabajogrupo2.serviceinterfaces;

import pe.edu.upc.trabajogrupo2.entities.Distrito;
import pe.edu.upc.trabajogrupo2.entities.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> list();
    public void insert(Producto producto);
    public Producto listId(int id);
    public void update(Producto producto);
    public void delete(int id);

    public List<String[]> listarMarcaMasRegistrada();
}
