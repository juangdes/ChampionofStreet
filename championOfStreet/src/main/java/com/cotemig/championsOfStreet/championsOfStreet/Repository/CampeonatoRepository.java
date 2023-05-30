package com.cotemig.championsOfStreet.championsOfStreet.Repository;

import com.cotemig.championsOfStreet.championsOfStreet.Model.Campeonato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("campeonatoRepository")
public interface CampeonatoRepository extends JpaRepository<Campeonato, Integer> {
}
