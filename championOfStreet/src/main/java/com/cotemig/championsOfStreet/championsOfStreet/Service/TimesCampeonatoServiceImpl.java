package com.cotemig.championsOfStreet.championsOfStreet.Service;


import com.cotemig.championsOfStreet.championsOfStreet.Model.TimesCampeonato;
import com.cotemig.championsOfStreet.championsOfStreet.Repository.TimesCampeonatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("timesCampeonatoService")
public class TimesCampeonatoServiceImpl implements TimesCampeonatoService {

    @Autowired
    TimesCampeonatoRepository timesCampeonatoRepository;

    @Override
    public List<TimesCampeonato> getAllTimesCampeonato() {
        return timesCampeonatoRepository.findAll();
    }

    @Override
    public Optional<TimesCampeonato> getTimesCampeonatoById(Integer id) {
        return timesCampeonatoRepository.findById(id);
    }

    @Override
    public void deleteTimesCampeonatoById(Integer id) {
        timesCampeonatoRepository.deleteById(id);
    }

    @Override
    public void updateTimesCampeonato(TimesCampeonato timesCampeonato) {
        timesCampeonatoRepository.save(timesCampeonato);
    }

    @Override
    public void insertTimesCampeonato(TimesCampeonato timesCampeonato) {
        timesCampeonatoRepository.save(timesCampeonato);
    }
}
