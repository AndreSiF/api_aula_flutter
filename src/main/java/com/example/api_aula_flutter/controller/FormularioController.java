package com.example.api_aula_flutter.controller;

import com.example.api_aula_flutter.model.Formulario;
import com.example.api_aula_flutter.repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formularios")
public class FormularioController {

    @Autowired
    private FormularioRepository formularioRepository;

    @GetMapping
    public List<Formulario> getAllFormularios() {
        return formularioRepository.findAll();
    }

    @PostMapping
    public Formulario createFormulario(@RequestBody Formulario formulario) {
        return formularioRepository.save(formulario);
    }
}