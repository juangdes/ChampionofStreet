package com.cotemig.championsOfStreet.championsOfStreet.Service;

import com.cotemig.championsOfStreet.championsOfStreet.Model.Campeonato;

import java.util.List;
import java.util.Optional;

public interface CampeonatoService {

    List<Campeonato> getAllCampeonato();

    Optional<Campeonato> getCampeonatoById(Integer id);
    void deleteCampeonatoById(Integer id);
    void updateCampeonato(Campeonato campeonato);
    void insertCampeonato(Campeonato campeonato);
}







