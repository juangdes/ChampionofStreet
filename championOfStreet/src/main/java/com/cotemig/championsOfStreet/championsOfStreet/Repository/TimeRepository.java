package com.cotemig.championsOfStreet.championsOfStreet.Repository;

import com.cotemig.championsOfStreet.championsOfStreet.Model.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("timeRepository")
public interface TimeRepository extends JpaRepository<Time, Integer> {
}
