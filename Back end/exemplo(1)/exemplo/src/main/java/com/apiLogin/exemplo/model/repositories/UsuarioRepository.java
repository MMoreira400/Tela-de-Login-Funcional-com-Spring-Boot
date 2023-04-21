package com.apiLogin.exemplo.model.repositories;

import com.apiLogin.exemplo.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    Optional<Usuario> findByEmailOrUsername(String email,String username);

}
