package com.cotemig.championsOfStreet.championsOfStreet.Service;

import com.cotemig.championsOfStreet.championsOfStreet.Model.Time;
import com.cotemig.championsOfStreet.championsOfStreet.Repository.EsporteRepository;
import com.cotemig.championsOfStreet.championsOfStreet.Repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("timeService")
public class TimeServiceImpl implements TimeService {


    @Autowired
    TimeRepository timeRepository;

    @Override
    public List<Time> getAllTime() {
        return timeRepository.findAll();
    }

    @Override
    public Optional<Time> getTimeById(Integer id) {
        return timeRepository.findById(id);
    }

    @Override
    public void deleteTimeById(Integer id) {
        timeRepository.deleteById(id);

    }

    @Override
    public void updateTime(Time time) {
        timeRepository.save(time);

    }

    @Override
    public void insertTime(Time time) {
        timeRepository.save(time);

    }
}
