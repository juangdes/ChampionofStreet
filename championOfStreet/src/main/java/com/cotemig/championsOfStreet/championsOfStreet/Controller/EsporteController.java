package com.cotemig.championsOfStreet.championsOfStreet.Controller;

import com.cotemig.championsOfStreet.championsOfStreet.Model.Esporte;

import com.cotemig.championsOfStreet.championsOfStreet.Model.Time;
import com.cotemig.championsOfStreet.championsOfStreet.Service.EsporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EsporteController {

    @Autowired
    EsporteService esporteService;

    @RequestMapping(value = "/esporte/select", method = RequestMethod.GET)
    public ModelAndView formselectall() {
        ModelAndView mav = new ModelAndView("SelectEsporte");
        mav.addObject("esporte", esporteService.getAllEsporte());
        mav.addObject("obj", esporteService.getAllEsporte());
        return mav;
    }

    @RequestMapping(value = "/esporte/insert", method = RequestMethod.GET)
    public ModelAndView formselect() {
        ModelAndView mav = new ModelAndView("InsertEsporte","Esporte", new Esporte());
        return mav;
    }

    @RequestMapping(value = "/esporte/insert", method = RequestMethod.POST)
    public String submitInsert(@ModelAttribute("esporte") Esporte esporte, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        esporteService.insertEsporte(esporte);
        return "redirect:/esporte/select";
    }

    @RequestMapping(value = "/esporte/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        ModelAndView mav = new ModelAndView("UpdateEsporte");
        mav.addObject("esporte", esporteService.getEsporteById(id).get());
        return mav;

    }

    @RequestMapping(value = "/esporte/update", method = RequestMethod.POST)
    public String submitUpdate(@ModelAttribute("esporte") Esporte esporte, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        esporteService.updateEsporte(esporte);
        return "redirect:/esporte/select";
    }

    @RequestMapping(value = "/esporte/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        ModelAndView mav = new ModelAndView("DeleteEsporte");
        mav.addObject("esporte", esporteService.getEsporteById(id).get());
        return mav;

    }

    @RequestMapping(value = "/esporte/delete", method = RequestMethod.POST)
    public String submitDelete(@ModelAttribute("esporte") Esporte esporte, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        esporteService.deleteEsporteById(esporte.getId());
        return "redirect:/time/select";
    }


}
