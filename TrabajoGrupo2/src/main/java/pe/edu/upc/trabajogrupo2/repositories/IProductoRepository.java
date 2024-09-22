package pe.edu.upc.trabajogrupo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajogrupo2.entities.Producto;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

    @Query(value = "SELECT p.marca_producto, COUNT(p) as total \n" +
            " FROM producto p \n" +
            " GROUP BY p.marca_producto \n" +
            " ORDER BY total DESC",nativeQuery = true)
    public List<String[]> listarMarcaMasRegistrada();
}
