package pe.edu.upc.trabajogrupo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajogrupo2.entities.OrdenCompra;

import java.util.List;

@Repository
public interface IOrdenCompraRepository extends JpaRepository<OrdenCompra, Integer> {
    @Query("SELECT o FROM OrdenCompra o WHERE o.usuario.nomUsuario LIKE %:nombre%")
    public List<OrdenCompra> buscarPorUsuario(@Param("nombre") String nombre);

    @Query("SELECT o.usuario, COUNT(o) as totalOrdenes FROM OrdenCompra o GROUP BY o.usuario ORDER BY totalOrdenes DESC")
    public List<Object[]> listarUsuariosConMasOrdenes();
}
