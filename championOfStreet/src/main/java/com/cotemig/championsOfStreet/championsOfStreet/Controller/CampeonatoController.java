package com.cotemig.championsOfStreet.championsOfStreet.Controller;


import com.cotemig.championsOfStreet.championsOfStreet.Model.Campeonato;
import com.cotemig.championsOfStreet.championsOfStreet.Model.Esporte;
import com.cotemig.championsOfStreet.championsOfStreet.Service.CampeonatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CampeonatoController {

    @Autowired
    CampeonatoService campeonatoService;

    @RequestMapping(value = "/campeonato/select", method = RequestMethod.GET)
    public ModelAndView formselectall() {
        ModelAndView mav = new ModelAndView("SelectCampeonato");
        mav.addObject("campeonato", campeonatoService.getAllCampeonato());
        mav.addObject("obj", campeonatoService.getAllCampeonato());
        return mav;
    }

    @RequestMapping(value = "/campeonato/insert", method = RequestMethod.GET)
    public ModelAndView formselect() {
        ModelAndView mav = new ModelAndView("InsertCampeonato","Campeonato", new Campeonato());
        return mav;
    }

    @RequestMapping(value = "/campeonato/insert", method = RequestMethod.POST)
    public String submitInsert(@ModelAttribute("campeonato") Campeonato campeonato, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        campeonatoService.insertCampeonato(campeonato);
        return "redirect:/campeonato/select";
    }

    @RequestMapping(value = "/campeonato/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        ModelAndView mav = new ModelAndView("UpdateCampeonato");
        mav.addObject("campeonato", campeonatoService.getCampeonatoById(id).get());
        return mav;

    }

    @RequestMapping(value = "/campeonato/update", method = RequestMethod.POST)
    public String submitUpdate(@ModelAttribute("campeonato") Campeonato campeonato, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        campeonatoService.updateCampeonato(campeonato);
        return "redirect:/campeonato/select";
    }

    @RequestMapping(value = "/campeonato/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        ModelAndView mav = new ModelAndView("DeleteCampeonato");
        mav.addObject("campeonato", campeonatoService.getCampeonatoById(id).get());
        return mav;

    }

    @RequestMapping(value = "/campeonato/delete", method = RequestMethod.POST)
    public String submitDelete(@ModelAttribute("campeonato") Campeonato campeonato, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        campeonatoService.deleteCampeonatoById(campeonato.getId());
        return "redirect:/campeonato/select";
    }


}
