package pe.edu.upc.trabajogrupo2.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajogrupo2.entities.OrdenCompra;
import pe.edu.upc.trabajogrupo2.repositories.IOrdenCompraRepository;
import pe.edu.upc.trabajogrupo2.serviceinterfaces.IOrdenCompraService;

import java.util.List;

@Service
public class OrdenCompraServiceImplement implements IOrdenCompraService {

    @Autowired
    private IOrdenCompraRepository oR;


    @Override
    public List<OrdenCompra> list() {
        return oR.findAll();
    }

    @Override
    public void insert(OrdenCompra ordenCompra) {
        oR.save(ordenCompra);
    }

    @Override
    public OrdenCompra listId(int id) {
        return oR.findById(id).orElse(new OrdenCompra());
    }

    @Override
    public void update(OrdenCompra ordenCompra) {
        oR.save(ordenCompra);
    }

    @Override
    public void delete(int id) {
        oR.deleteById(id);
    }

    @Override
    public List<OrdenCompra> buscar(String usuario) {
        return oR.buscarPorUsuario(usuario);
    }

    @Override
    public List<Object[]> listarUsuariosConMasOrdenes() {
        return oR.listarUsuariosConMasOrdenes();
    }
}
