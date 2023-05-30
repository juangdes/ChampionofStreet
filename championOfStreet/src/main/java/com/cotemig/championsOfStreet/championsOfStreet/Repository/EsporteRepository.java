package com.cotemig.championsOfStreet.championsOfStreet.Repository;

import com.cotemig.championsOfStreet.championsOfStreet.Model.Esporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("esporteRepository")
public interface EsporteRepository extends JpaRepository<Esporte, Integer> {
}
