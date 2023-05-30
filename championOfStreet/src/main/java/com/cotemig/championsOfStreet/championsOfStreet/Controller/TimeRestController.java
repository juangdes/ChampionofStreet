package com.cotemig.championsOfStreet.championsOfStreet.Controller;

import com.cotemig.championsOfStreet.championsOfStreet.Model.Time;
import com.cotemig.championsOfStreet.championsOfStreet.Service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TimeRestController {

    @Autowired
    TimeService timeService;

    @RequestMapping(value = "/times", method = RequestMethod.GET)
    public List<Time> getAll(){
        return timeService.getAllTime();
    }

    @RequestMapping(value = "/times/{id}", method = RequestMethod.GET)
    public Optional<Time> get(@PathVariable Integer id){
        return timeService.getTimeById(id);
    }

    @RequestMapping(value ="/times", method = RequestMethod.POST)
    public void post(@RequestBody Time time){
        timeService.insertTime(time);
    }
    @RequestMapping(value = "/times/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id){
        timeService.deleteTimeById(id);
    }

    @RequestMapping(value = "/times", method = RequestMethod.PUT)
    public void put(@RequestBody Time time){
        timeService.updateTime(time);
    }
}
