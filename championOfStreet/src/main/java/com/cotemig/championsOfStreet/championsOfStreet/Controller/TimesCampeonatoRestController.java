package com.cotemig.championsOfStreet.championsOfStreet.Controller;


import com.cotemig.championsOfStreet.championsOfStreet.Model.TimesCampeonato;
import com.cotemig.championsOfStreet.championsOfStreet.Service.TimesCampeonatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TimesCampeonatoRestController {

    @Autowired
    TimesCampeonatoService timesCampeonatoService;

    @RequestMapping(value = "/timescampeonato", method = RequestMethod.GET)
    public List<TimesCampeonato> getAll(){
        return timesCampeonatoService.getAllTimesCampeonato();
    }

    @RequestMapping(value = "/timescampeonato/{id}", method = RequestMethod.GET)
    public Optional<TimesCampeonato> get(@PathVariable Integer id){
        return timesCampeonatoService.getTimesCampeonatoById(id);
    }

    @RequestMapping(value ="/timescampeonato", method = RequestMethod.POST)
    public void post(@RequestBody TimesCampeonato timesCampeonato){
        timesCampeonatoService.insertTimesCampeonato(timesCampeonato);
    }
    @RequestMapping(value = "/timescampeonato/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id){
        timesCampeonatoService.deleteTimesCampeonatoById(id);
    }

    @RequestMapping(value = "/timescampeonato", method = RequestMethod.PUT)
    public void put(@RequestBody TimesCampeonato timesCampeonato){
        timesCampeonatoService.updateTimesCampeonato(timesCampeonato);
    }


}
