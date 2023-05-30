package com.cotemig.championsOfStreet.championsOfStreet.Repository;

import com.cotemig.championsOfStreet.championsOfStreet.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}

