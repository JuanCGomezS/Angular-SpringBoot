package com.project.backend.controller;

import com.project.backend.model.Usuario;
import com.project.backend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/new")
    public Usuario newUser(@RequestBody Usuario newUser) {
        return this.usuarioService.newUser(newUser);
    }

    @GetMapping("/list")
    public Iterable<Usuario> getAllUser() {
        return usuarioService.getAllUser();
    }

    @PostMapping("/update")
    public Usuario updateUser(@RequestBody Usuario user) {
        return this.usuarioService.updateUser(user);
    }

    @PostMapping(value = "/{id}")
    public Boolean deleteUser(@PathVariable( value = "id") int id) {
        return this.usuarioService.deleteUser(id);
    }

    @GetMapping(value = "/{id}")
    public Usuario getUserById(@PathVariable(value = "id") int id) {
        return this.usuarioService.getUserById(id);
    }
}
