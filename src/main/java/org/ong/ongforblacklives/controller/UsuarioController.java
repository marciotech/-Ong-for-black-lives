package org.ong.ongforblacklives.controller;

import org.ong.ongforblacklives.model.UsuarioModel;
import org.ong.ongforblacklives.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;



@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/usuarios")
    public List<UsuarioModel> listAll() {

        List<UsuarioModel> usuarios = repository.findAll();
        return usuarios;
    }

    @GetMapping("/usuarios/{id}")
    public UsuarioModel getUsuarioById(@PathVariable("id") String id) {

        UsuarioModel getUsuario = repository.findById(id).get();
        return getUsuario;
    }

    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioModel save(@Valid @RequestBody UsuarioModel usuarios) {
        System.out.println("Cheguei aqui");
        return repository.save(usuarios);
    }

    @DeleteMapping("/usuarios/{id}")
    public UsuarioModel deleteUsuarioById(@PathVariable("id") String id) {
        UsuarioModel usuario = repository.findById(id).get();
        repository.delete(usuario);
        return usuario;
    }

}



