package pe.edu.upc.trabajogrupo2.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajogrupo2.dtos.BoticaDTO;
import pe.edu.upc.trabajogrupo2.entities.Botica;
import pe.edu.upc.trabajogrupo2.serviceinterfaces.IBoticaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/boticas")
public class BoticaController {

    @Autowired
    private IBoticaService bS;

    @GetMapping
    public List<BoticaDTO> listar(){
        return bS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,BoticaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody BoticaDTO dto){
        ModelMapper m = new ModelMapper();
        Botica b = m.map(dto, Botica.class);
        bS.insert(b);
    }

    @GetMapping("/{id}")
    public BoticaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        BoticaDTO dto = m.map(bS.listId(id), BoticaDTO.class);

        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody BoticaDTO dto){
        ModelMapper m = new ModelMapper();
        Botica b = m.map(dto, Botica.class);
        bS.update(b);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        bS.delete(id);
    }
}
