package pe.edu.upc.trabajogrupo2.serviceinterfaces;

import pe.edu.upc.trabajogrupo2.entities.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> list();

    public void insert(Producto producto);
}
