package com.project.backend.service;

import com.project.backend.model.Usuario;
import com.project.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public Usuario newUser(Usuario newUser) {
        return usuarioRepository.save(newUser);
    }

    @Override
    public Iterable<Usuario> getAllUser() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public Usuario updateUser(Usuario user) {
        Optional<Usuario> userSearch = this.usuarioRepository.findById(user.getId_u());
        if (userSearch.get() != null) {
            userSearch.get().setNombre_u(user.getNombre_u());
            userSearch.get().setApellido_u(user.getApellido_u());
            userSearch.get().setCorreo_u(user.getCorreo_u());
            userSearch.get().setTelefono_u(user.getTelefono_u());

            return this.newUser(userSearch.get());
        }

        return null;
    }

    @Override
    public Boolean deleteUser(int id) {
        this.usuarioRepository.deleteById(id);
        return true;
    }

    @Override
    public Usuario getUserById(int id) {
        Optional<Usuario> userSearch = this.usuarioRepository.findById(id);
        if (userSearch.get() != null) {
            return userSearch.get();
        }

        return null;
    }
}
