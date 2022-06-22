package Ong.ongforblacklives.controller;

import Ong.ongforblacklives.model.UsuarioModel;
import Ong.ongforblacklives.repository.UsuarioRepository;
import model.Usuarios;
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

}

