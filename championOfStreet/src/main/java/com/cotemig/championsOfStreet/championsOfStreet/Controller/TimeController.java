package com.cotemig.championsOfStreet.championsOfStreet.Controller;

import com.cotemig.championsOfStreet.championsOfStreet.Model.Time;
import com.cotemig.championsOfStreet.championsOfStreet.Service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TimeController {

    @Autowired
    TimeService timeService;

    @RequestMapping(value = "/time/select", method = RequestMethod.GET)
    public ModelAndView formselectall() {
        ModelAndView mav = new ModelAndView("SelectTime");
        mav.addObject("time", timeService.getAllTime());
        mav.addObject("obj", timeService.getAllTime());
        return mav;
    }

    @RequestMapping(value = "/time/insert", method = RequestMethod.GET)
    public ModelAndView formselect() {
        ModelAndView mav = new ModelAndView("InsertTime","Time", new Time());
        return mav;
    }

    @RequestMapping(value = "/time/insert", method = RequestMethod.POST)
    public String submitInsert(@ModelAttribute("time") Time time, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        timeService.insertTime(time);
        return "redirect:/time/select";
    }

    @RequestMapping(value = "/time/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        ModelAndView mav = new ModelAndView("UpdateTime");
        mav.addObject("time", timeService.getTimeById(id).get());
        return mav;

    }

    @RequestMapping(value = "/time/update", method = RequestMethod.POST)
    public String submitUpdate(@ModelAttribute("time") Time time, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        timeService.updateTime(time);
        return "redirect:/time/select";
    }

    @RequestMapping(value = "/time/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        ModelAndView mav = new ModelAndView("DeleteTime");
        mav.addObject("time", timeService.getTimeById(id).get());
        return mav;

    }

    @RequestMapping(value = "/time/delete", method = RequestMethod.POST)
    public String submitDelete(@ModelAttribute("time") Time time, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        timeService.deleteTimeById(time.getId());
        return "redirect:/time/select";
    }


}
