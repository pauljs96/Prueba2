package pe.edu.upc.trabajogrupo2.serviceinterfaces;

import pe.edu.upc.trabajogrupo2.entities.Distrito;

import java.util.List;

public interface IDistritoService {
    public List<Distrito> list();
    public void insert(Distrito distrito);
    public Distrito listId(int id);
    public void update(Distrito distrito);
    public void delete(int id);
}
