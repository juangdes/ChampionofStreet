package com.cotemig.championsOfStreet.championsOfStreet.Controller;

import com.cotemig.championsOfStreet.championsOfStreet.Model.TimesCampeonato;
import com.cotemig.championsOfStreet.championsOfStreet.Service.TimesCampeonatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TimesCampeonatoController {

    @Autowired
    TimesCampeonatoService timesCampeonatoService;

    @RequestMapping(value = "/timescampeonato/select", method = RequestMethod.GET)
    public ModelAndView formselectall() {
        ModelAndView mav = new ModelAndView("SelectTimesCampeonato");
        mav.addObject("timescampeonato", timesCampeonatoService.getAllTimesCampeonato());
        mav.addObject("obj", timesCampeonatoService.getAllTimesCampeonato());
        return mav;
    }

    @RequestMapping(value = "/timescampeonato/insert", method = RequestMethod.GET)
    public ModelAndView formselect() {
        ModelAndView mav = new ModelAndView("InsertTimesCampeonato","TimesCampeonato", new TimesCampeonato());
        return mav;
    }

    @RequestMapping(value = "/timescampeonato/insert", method = RequestMethod.POST)
    public String submitInsert(@ModelAttribute("timescampeonato") TimesCampeonato timesCampeonato, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        timesCampeonatoService.insertTimesCampeonato(timesCampeonato);
        return "redirect:/timescampeonato/select";
    }

    @RequestMapping(value = "/timescampeonato/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        ModelAndView mav = new ModelAndView("UpdateTimesCampeonato");
        mav.addObject("timescampeonato", timesCampeonatoService.getTimesCampeonatoById(id).get());
        return mav;

    }

    @RequestMapping(value = "/timescampeonato/update", method = RequestMethod.POST)
    public String submitUpdate(@ModelAttribute("timescampeonato") TimesCampeonato timesCampeonato, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        timesCampeonatoService.updateTimesCampeonato(timesCampeonato);
        return "redirect:/timescampeonato/select";
    }

    @RequestMapping(value = "/timescampeonato/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        ModelAndView mav = new ModelAndView("DeleteTimesCampeonato");
        mav.addObject("timescampeonato", timesCampeonatoService.getTimesCampeonatoById(id).get());
        return mav;

    }

    @RequestMapping(value = "/timescampeonato/delete", method = RequestMethod.POST)
    public String submitDelete(@ModelAttribute("timescampeonato") TimesCampeonato timesCampeonato, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        timesCampeonatoService.deleteTimesCampeonatoById(timesCampeonato.getId());
        return "redirect:/timescampeonato/select";
    }




}
