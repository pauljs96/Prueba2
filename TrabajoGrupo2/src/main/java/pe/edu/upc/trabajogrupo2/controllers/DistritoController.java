package pe.edu.upc.trabajogrupo2.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajogrupo2.dtos.DistritoDTO;
import pe.edu.upc.trabajogrupo2.entities.Distrito;
import pe.edu.upc.trabajogrupo2.serviceinterfaces.IDistritoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/distrito")
public class DistritoController {

    @Autowired
    private IDistritoService rS;

    @GetMapping
    public List<DistritoDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,DistritoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody DistritoDTO dto){
        ModelMapper m = new ModelMapper();
        Distrito d = m.map(dto, Distrito.class);
        rS.insert(d);
    }

    @GetMapping("/{id}")
    public DistritoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        DistritoDTO dto = m.map(rS.listId(id), DistritoDTO.class);

        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody DistritoDTO dto){
        ModelMapper m = new ModelMapper();
        Distrito d = m.map(dto, Distrito.class);
        rS.update(d);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rS.delete(id);
    }

}
