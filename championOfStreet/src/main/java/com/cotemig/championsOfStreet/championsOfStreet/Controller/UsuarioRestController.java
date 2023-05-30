package com.cotemig.championsOfStreet.championsOfStreet.Controller;

import com.cotemig.championsOfStreet.championsOfStreet.Model.Usuario;
import com.cotemig.championsOfStreet.championsOfStreet.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioRestController {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
    public List<Usuario> getAll(){
        return usuarioService.getAllUsuario();
    }

    @RequestMapping(value = "/usuarios/{id}", method = RequestMethod.GET)
    public Optional<Usuario> get(@PathVariable Integer id){
        return usuarioService.getUsuarioById(id);
    }

    @RequestMapping(value ="/usuarios", method = RequestMethod.POST)
    public void post(@RequestBody Usuario usuario){
        usuarioService.insertUsuario(usuario);
    }

    @RequestMapping(value = "/usuarios/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id){
        usuarioService.deleteUsuarioById(id);
    }

    @RequestMapping(value = "/usuarios", method = RequestMethod.PUT)
    public void put(@RequestBody Usuario usuario){
        usuarioService.updateUsuario(usuario);
    }
}
