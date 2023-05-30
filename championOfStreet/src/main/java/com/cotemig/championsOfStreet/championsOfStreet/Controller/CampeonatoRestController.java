package com.cotemig.championsOfStreet.championsOfStreet.Controller;


import com.cotemig.championsOfStreet.championsOfStreet.Model.Campeonato;
import com.cotemig.championsOfStreet.championsOfStreet.Service.CampeonatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import java.util.List;

@RestController
public class CampeonatoRestController {

    @Autowired
    CampeonatoService campeonatoService;

    @RequestMapping(value = "/campeonatos", method = RequestMethod.GET)
    public List<Campeonato> getAll(){
        return campeonatoService.getAllCampeonato();
    }

    @RequestMapping(value = "/campeonatos/{id}", method = RequestMethod.GET)
    public Optional<Campeonato> get(@PathVariable Integer id){
        return campeonatoService.getCampeonatoById(id);
    }

    @RequestMapping(value ="/campeonatos", method = RequestMethod.POST)
        public void post(@RequestBody Campeonato campeonato){
            campeonatoService.insertCampeonato(campeonato);
        }
    @RequestMapping(value = "/campeonatos/{id}", method = RequestMethod.DELETE)
        public void delete(@PathVariable Integer id){
            campeonatoService.deleteCampeonatoById(id);
    }

    @RequestMapping(value = "/campeonatos", method = RequestMethod.PUT)
    public void put(@RequestBody Campeonato campeonato){
        campeonatoService.updateCampeonato(campeonato);
    }
}
