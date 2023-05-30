package com.cotemig.championsOfStreet.championsOfStreet.Service;


import com.cotemig.championsOfStreet.championsOfStreet.Model.Time;

import java.util.List;
import java.util.Optional;

public interface TimeService {

    List<Time> getAllTime();

    Optional<Time> getTimeById(Integer id);
    void deleteTimeById(Integer id);
    void updateTime(Time time);
    void insertTime(Time time);

}
