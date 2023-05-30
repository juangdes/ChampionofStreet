package com.cotemig.championsOfStreet.championsOfStreet.Service;


import com.cotemig.championsOfStreet.championsOfStreet.Model.Esporte;

import java.util.List;
import java.util.Optional;

public interface EsporteService {

    List<Esporte> getAllEsporte();

    Optional<Esporte> getEsporteById(Integer id);
    void deleteEsporteById(Integer id);
    void updateEsporte(Esporte esporte);
    void insertEsporte(Esporte esporte);

}
