package pe.edu.upc.trabajogrupo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajogrupo2.entities.Comentario;

import java.util.List;

@Repository
public interface IComentarioRepository extends JpaRepository<Comentario, Integer>{

    @Query("SELECT c.usuario, COUNT(c) as totalComentarios FROM Comentario c GROUP BY c.usuario ORDER BY totalComentarios DESC")
    public List<Object[]> listarUsuariosConMasComentarios();

    @Query("SELECT c FROM Comentario c WHERE c.PxBotica.idProductoxBotica = :idProductoxBotica")
    List<Comentario> findByPxBoticaId(@Param("idProductoxBotica") int idProductoxBotica);
}
