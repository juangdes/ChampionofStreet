package com.cotemig.championsOfStreet.championsOfStreet.Service;

import com.cotemig.championsOfStreet.championsOfStreet.Model.Campeonato;
import com.cotemig.championsOfStreet.championsOfStreet.Repository.CampeonatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("campeonatoService")
public class CampeonatoServiceImpl implements CampeonatoService{

    @Autowired
    CampeonatoRepository campeonatoRepository;

    @Override
    public Optional<Campeonato> getCampeonatoById(Integer id) {
        return campeonatoRepository.findById(id);
    }

    @Override
    public List<Campeonato> getAllCampeonato() {
        return campeonatoRepository.findAll();
    }


    @Override
    public void deleteCampeonatoById(Integer id) {
        campeonatoRepository.deleteById(id);
    }


    @Override
    public void updateCampeonato(Campeonato campeonato) {
        campeonatoRepository.save(campeonato);
    }

    @Override
    public void insertCampeonato(Campeonato campeonato) {
        campeonatoRepository.save(campeonato);
    }



}
