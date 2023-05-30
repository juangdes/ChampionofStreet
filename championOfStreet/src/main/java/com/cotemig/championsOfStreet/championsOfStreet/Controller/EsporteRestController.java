package com.cotemig.championsOfStreet.championsOfStreet.Controller;

import com.cotemig.championsOfStreet.championsOfStreet.Model.Esporte;
import com.cotemig.championsOfStreet.championsOfStreet.Service.EsporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EsporteRestController {

    @Autowired
    EsporteService esporteService;

    @RequestMapping(value = "/esportes", method = RequestMethod.GET)
    public List<Esporte> getAll(){
        return esporteService.getAllEsporte();
    }

    @RequestMapping(value = "/esportes/{id}", method = RequestMethod.GET)
    public Optional<Esporte> get(@PathVariable Integer id){
        return esporteService.getEsporteById(id);
    }

    @RequestMapping(value ="/esportes", method = RequestMethod.POST)
    public void post(@RequestBody Esporte esporte){
        esporteService.insertEsporte(esporte);
    }

    @RequestMapping(value = "/esportes/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id){
        esporteService.deleteEsporteById(id);
    }

    @RequestMapping(value = "/esportes", method = RequestMethod.PUT)
    public void put(@RequestBody Esporte esporte){
        esporteService.updateEsporte(esporte);
    }
}
