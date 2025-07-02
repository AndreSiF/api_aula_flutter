package com.example.api_projeto_aquicultura.controller;

import com.example.api_projeto_aquicultura.model.Formulario;
import com.example.api_projeto_aquicultura.service.FormularioService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formularios")
@CrossOrigin(origins = "http://localhost:4200")
public class FormularioController {

    @Autowired
    private FormularioService formularioService;

    @GetMapping
    public List<Formulario> getAllFormularios() {
        return formularioService.getFormularios();
    }

    @GetMapping("/{id}")
    public Formulario getFormulario(@PathVariable Long id) {
        return formularioService.findById(id);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Formulario> salvar(@RequestBody Formulario formulario) {
        Formulario salvo = formularioService.salvarFormulario(formulario);
        return ResponseEntity.ok(salvo);
    }
}