package pe.edu.upc.trabajogrupo2.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajogrupo2.entities.Distrito;
import pe.edu.upc.trabajogrupo2.repositories.IDistritoRepository;
import pe.edu.upc.trabajogrupo2.serviceinterfaces.IDistritoService;

import java.util.List;

@Service
public class DistritoServiceImplement implements IDistritoService {

    @Autowired
    private IDistritoRepository dR;

    public List<Distrito> list() {
        return dR.findAll();
    }

    @Override
    public void insert(Distrito distrito) {
        dR.save(distrito);
    }

    @Override
    public Distrito listId(int id) {
        return dR.findById(id).orElse(new Distrito());
    }

    @Override
    public void update(Distrito distrito) {
        dR.save(distrito);
    }

    @Override
    public void delete(int id) {
        dR.deleteById(id);
    }
}
