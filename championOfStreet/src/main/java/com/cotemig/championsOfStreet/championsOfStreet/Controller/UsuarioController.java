package com.cotemig.championsOfStreet.championsOfStreet.Controller;


import com.cotemig.championsOfStreet.championsOfStreet.Model.Usuario;
import com.cotemig.championsOfStreet.championsOfStreet.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(value = "/usuario/select", method = RequestMethod.GET)
    public ModelAndView formselectall() {
        ModelAndView mav = new ModelAndView("SelectUsuarios");
        mav.addObject("usuario", usuarioService.getAllUsuario());
        mav.addObject("obj", usuarioService.getAllUsuario());
        return mav;
    }

    @RequestMapping(value = "/usuario/insert", method = RequestMethod.GET)
    public ModelAndView formselect() {
        ModelAndView mav = new ModelAndView("InsertUsuario","Usuario", new Usuario());
        return mav;
    }


    @RequestMapping(value = "/usuario/insert", method = RequestMethod.POST)
    public String submitInsert(@ModelAttribute("usuario")Usuario usuario, BindingResult result, ModelMap model) {
       System.out.println(usuario.getDataNascimento());
        if (result.hasErrors()) {
            return "error";
        }
        usuarioService.insertUsuario(usuario);
        return "redirect:/usuario/select";
    }

    @RequestMapping(value = "/usuario/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        ModelAndView mav = new ModelAndView("UpdateUsuario");
        mav.addObject("usuario", usuarioService.getUsuarioById(id).get());
        return mav;

    }

    @RequestMapping(value = "/usuario/update", method = RequestMethod.POST)
    public String submitUpdate(@ModelAttribute("usuario")Usuario usuario, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        usuarioService.updateUsuario(usuario);
        return "redirect:/usuario/select";
    }

    @RequestMapping(value = "/usuario/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        ModelAndView mav = new ModelAndView("DeleteUsuario");
        mav.addObject("usuario", usuarioService.getUsuarioById(id).get());
        return mav;

    }

    @RequestMapping(value = "/usuario/delete", method = RequestMethod.POST)
    public String submitDelete(@ModelAttribute("usuario")Usuario usuario, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        usuarioService.deleteUsuarioById(usuario.getId());
        return "redirect:/usuario/select";
    }



}
