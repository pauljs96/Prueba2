package pe.edu.upc.trabajogrupo2.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajogrupo2.dtos.ProductoDTO;
import pe.edu.upc.trabajogrupo2.entities.Producto;
import pe.edu.upc.trabajogrupo2.serviceinterfaces.IProductoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private IProductoService pS;

    @GetMapping
    public List<ProductoDTO> listar(){
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProductoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody ProductoDTO dto) {
        ModelMapper m = new ModelMapper();
        Producto pr = m.map(dto, Producto.class);
        pS.insert(pr);
    }
}
