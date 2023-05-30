package com.cotemig.championsOfStreet.championsOfStreet.Service;


import com.cotemig.championsOfStreet.championsOfStreet.Model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuario> getAllUsuario();

    Optional<Usuario> getUsuarioById(Integer id);
    void deleteUsuarioById(Integer id);
    void updateUsuario(Usuario Usuario);
    void insertUsuario(Usuario Usuario);

}
