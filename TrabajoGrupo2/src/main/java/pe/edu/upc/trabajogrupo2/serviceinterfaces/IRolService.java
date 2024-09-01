package pe.edu.upc.trabajogrupo2.serviceinterfaces;

import pe.edu.upc.trabajogrupo2.entities.Rol;

import java.util.List;

public interface IRolService {
    public List<Rol> list();
    public void insert(Rol rol);
    public Rol listId(int id);
    public void update(Rol rol);
    public void delete(int id);
}
