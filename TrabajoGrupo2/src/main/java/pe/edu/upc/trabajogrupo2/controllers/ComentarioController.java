package pe.edu.upc.trabajogrupo2.controllers;
//comentariode desarrollador
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajogrupo2.dtos.ComentarioDTO;
import pe.edu.upc.trabajogrupo2.dtos.ProductoDTO;
import pe.edu.upc.trabajogrupo2.dtos.UsuarioComentarioDTO;
import pe.edu.upc.trabajogrupo2.entities.Comentario;
import pe.edu.upc.trabajogrupo2.entities.Producto;
import pe.edu.upc.trabajogrupo2.serviceinterfaces.IComentarioService;
import pe.edu.upc.trabajogrupo2.serviceinterfaces.IProductoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired
    private IComentarioService ICServ;

    @PreAuthorize("hasAuthority('Administrador') or hasAuthority('Cliente')")
    @GetMapping
    public List<ComentarioDTO> listar(){
        return ICServ.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioDTO.class);
        }).collect(Collectors.toList());
    }


    @PreAuthorize("hasAuthority('Administrador') or hasAuthority('Cliente')")
    @PostMapping
    public void registrar(@RequestBody ComentarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Comentario com = m.map(dto, Comentario.class);
        ICServ.insert(com);
    }

    @PreAuthorize("hasAuthority('Administrador') or hasAuthority('Cliente')")
    @GetMapping("/{id}")
    public ComentarioDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ComentarioDTO dto = m.map(ICServ.listId(id), ComentarioDTO.class);

        return dto;
    }

    @PreAuthorize("hasAuthority('Administrador') or hasAuthority('Cliente')")
    @PutMapping
    public void modificar(@RequestBody ComentarioDTO dto){
        ModelMapper m = new ModelMapper();
        Comentario comen = m.map(dto, Comentario.class);
        ICServ.update(comen);
    }

    @PreAuthorize("hasAuthority('DBotica') or hasAuthority('Administrador')")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        ICServ.delete(id);
    }

    @GetMapping("/ComentarioDeProductos}")
    public List<ComentarioDTO> listarComentariosPorProductoxBotica(@PathVariable("idProductoxBotica") Integer idProductoxBotica) {
        ModelMapper m = new ModelMapper();
        return ICServ.listarComentariosPorProductoxBotica(idProductoxBotica).stream()
                .map(x -> m.map(x, ComentarioDTO.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/usuariosmascomentarios")
    public List<UsuarioComentarioDTO> listarUsuariosConMasComentariosController() {

        List<Object[]> lista = ICServ.listarUsuariosConMasComentarios();
        List<UsuarioComentarioDTO> listaDTO = new ArrayList<>();

        for (Object[] x : lista) {
            UsuarioComentarioDTO dto = new UsuarioComentarioDTO();
            dto.setIdUsuario((Integer) x[0]);
            dto.setNomUsuario((String) x[1]);
            dto.setTotalComentarios((Long) x[2]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
