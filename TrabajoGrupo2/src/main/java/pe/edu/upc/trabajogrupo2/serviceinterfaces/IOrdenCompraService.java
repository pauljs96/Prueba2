package pe.edu.upc.trabajogrupo2.serviceinterfaces;

import pe.edu.upc.trabajogrupo2.entities.OrdenCompra;

import java.util.List;

public interface IOrdenCompraService {
    public List<OrdenCompra> list();
    public void insert(OrdenCompra ordenCompra);
    public OrdenCompra listId(int id);
    public void update(OrdenCompra ordenCompra);
    public void delete(int id);
    public List<OrdenCompra> buscar(String usuario);

    public List<String[]> listarUsuariosConMasOrdenes();
}
