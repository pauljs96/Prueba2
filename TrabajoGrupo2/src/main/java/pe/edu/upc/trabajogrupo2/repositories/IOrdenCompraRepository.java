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

    @Query(value = "SELECT o.id_usuario,u.nom_usuario, COUNT(o) as totalOrdenes \n" +
            " FROM orden_compra o INNER JOIN usuario u\n" +
            " on o.id_usuario=u.id_usuario\n" +
            " GROUP BY o.id_usuario,u.nom_usuario\n" +
            " ORDER BY totalOrdenes DESC",nativeQuery = true)
    public List<String[]> listarUsuariosConMasOrdenes();
}
