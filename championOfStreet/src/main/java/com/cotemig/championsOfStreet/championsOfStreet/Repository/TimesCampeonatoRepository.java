package com.cotemig.championsOfStreet.championsOfStreet.Repository;

import com.cotemig.championsOfStreet.championsOfStreet.Model.TimesCampeonato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("timesCampeonatoRepository")
public interface TimesCampeonatoRepository extends JpaRepository<TimesCampeonato, Integer> {
}
