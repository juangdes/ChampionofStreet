package com.cotemig.championsOfStreet.championsOfStreet.Service;


import com.cotemig.championsOfStreet.championsOfStreet.Model.TimesCampeonato;

import java.util.List;
import java.util.Optional;

public interface TimesCampeonatoService {

    List<TimesCampeonato> getAllTimesCampeonato();

    Optional<TimesCampeonato> getTimesCampeonatoById(Integer id);
    void deleteTimesCampeonatoById(Integer id);
    void updateTimesCampeonato(TimesCampeonato timesCampeonato);
    void insertTimesCampeonato(TimesCampeonato timesCampeonato);

}
