package Ong.ongforblacklives.controller;

import Ong.ongforblacklives.model.UsuarioModel;
import Ong.ongforblacklives.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/usuarios")
    public List<UsuarioModel> listusuarios() {

        return repository.findAll();


    }

    @GetMapping("/usuarios/{id}")
    public UsuarioModel getTutorialById(@PathVariable() String id) {

        UsuarioModel getUsuario = (UsuarioModel) repository.findById(id).get();

        return getUsuario;

    }

    @PostMapping("/usuarios")
    public String saveUsuario(@RequestBody UsuarioModel usuarios) {
        repository.save(usuarios);

        return "Added Successfully";
    }


    @DeleteMapping("/usuarios/{id}")
    public UsuarioModel deleteUsuarioById(@PathVariable() String id) {

        UsuarioModel usuario = (UsuarioModel) repository.findById(id).get();
       repository.delete(usuario);


        return usuario;

    }
}
