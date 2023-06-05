package com.project.backend.service;

import com.project.backend.model.Usuario;

public interface UsuarioService {
    Usuario newUser(Usuario newUser);
    Iterable<Usuario> getAllUser();
    Usuario updateUser(Usuario user);
    Boolean deleteUser(int id);
    Usuario getUserById(int id);
}