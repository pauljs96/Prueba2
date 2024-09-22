package pe.edu.upc.trabajogrupo2.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajogrupo2.entities.Distrito;
import pe.edu.upc.trabajogrupo2.entities.Producto;
import pe.edu.upc.trabajogrupo2.repositories.IProductoRepository;
import pe.edu.upc.trabajogrupo2.serviceinterfaces.IProductoService;

import java.util.List;

@Service
public class ProductoServiceImplement implements IProductoService {

    @Autowired
    private IProductoRepository pR;

    @Override
    public List<Producto> list() {
        return pR.findAll();
    }

    @Override
    public void insert(Producto producto) {
        pR.save(producto);
    }

    @Override
    public Producto listId(int id) {
        return pR.findById(id).orElse(new Producto());
    }

    @Override
    public void update(Producto producto) {
        pR.save(producto);
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public List<String[]> listarMarcaMasRegistrada() {
        return pR.listarMarcaMasRegistrada();
    }

}
