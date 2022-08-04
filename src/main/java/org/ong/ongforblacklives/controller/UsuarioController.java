package org.ong.ongforblacklives.controller;

import org.ong.ongforblacklives.model.UsuarioModel;
import org.ong.ongforblacklives.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

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
    public UsuarioModel save(@Valid @RequestBody UsuarioModel usuarios) {
        return repository.save(usuarios);
    }

    @DeleteMapping("/usuarios/{id}")
    public UsuarioModel deleteUsuarioById(@PathVariable("id") String id) {
        UsuarioModel usuario = repository.findById(id).get();
        repository.delete(usuario);
        return usuario;
    }

    public Object Errors;

    @GetMapping(path = "/api/status")
    public String check() {
        return "usuario";
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handValidationException(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((Consumer<? super ObjectError>) Errors);
        {
            String fieldName = ((FieldError) errors).getField();
            String errorMessage = ((FieldError) errors).getDefaultMessage();
            errors.put(fieldName, errorMessage);
        };

        return errors;
    }
}
