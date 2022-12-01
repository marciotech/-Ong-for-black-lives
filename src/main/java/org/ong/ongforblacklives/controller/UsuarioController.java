package org.ong.ongforblacklives.controller;

import org.ong.ongforblacklives.model.UsuarioModel;
import org.ong.ongforblacklives.repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioController.class); // Utilo em todas as rotas

    @GetMapping("/usuarios")
    public List<UsuarioModel> listAll() {

        List<UsuarioModel> usuarios = repository.findAll();
        return usuarios;
    }

    @GetMapping("/usuarios/{id}")
    public UsuarioModel getUsuarioById(@PathVariable("id") String id) {



        UsuarioModel getUsuario = new UsuarioModel();
        try {
            getUsuario = repository.findById(id).get();
            LOGGER.info(" Aplicacao executada com sucesso"+ id);
        } catch ( Exception e ) {

            LOGGER.error(e.getMessage() );
        }
        return getUsuario;
    }

    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioModel save(@Valid @RequestBody UsuarioModel usuarios) {

        try {
            System.out.println("Cheguei aqui");
            LOGGER.info(" Aplicacao executada com sucesso"+ usuarios);
        } catch ( Exception e ) {

            LOGGER.error(e.getMessage() );
        }


        return repository.save(usuarios);
    }

    @DeleteMapping("/usuarios/{id}")
    public UsuarioModel deleteUsuarioById(@PathVariable("id") String id) {
        UsuarioModel usuario = repository.findById(id).get();
        repository.delete(usuario);
        return usuario;
    }

}



