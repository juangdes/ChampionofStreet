package com.cotemig.championsOfStreet.championsOfStreet.Service;

import com.cotemig.championsOfStreet.championsOfStreet.Model.Campeonato;
import com.cotemig.championsOfStreet.championsOfStreet.Model.Esporte;
import com.cotemig.championsOfStreet.championsOfStreet.Repository.CampeonatoRepository;
import com.cotemig.championsOfStreet.championsOfStreet.Repository.EsporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service("esporteService")
public class EsporteServiceImpl implements EsporteService{

    @Autowired
    EsporteRepository esporteRepository;

    @Override
    public List<Esporte> getAllEsporte() {

        return esporteRepository.findAll();
    }

    @Override
    public Optional<Esporte> getEsporteById(Integer id) {

        return esporteRepository.findById(id);
    }

    @Override
    public void deleteEsporteById(Integer id) {
         esporteRepository.deleteById(id);

    }

    @Override
    public void updateEsporte(Esporte esporte) {

        esporteRepository.save(esporte);
    }

    @Override
    public void insertEsporte(Esporte esporte) {

        esporteRepository.save(esporte);
    }
}



