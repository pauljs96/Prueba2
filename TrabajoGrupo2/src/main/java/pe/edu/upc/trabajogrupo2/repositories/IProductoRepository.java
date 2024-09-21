package pe.edu.upc.trabajogrupo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajogrupo2.entities.Producto;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

    @Query("SELECT p.marcaProducto, COUNT(p) as total FROM Producto p GROUP BY p.marcaProducto ORDER BY total DESC")
    public List<Object[]> listarMarcaMasRegistrada();
}
