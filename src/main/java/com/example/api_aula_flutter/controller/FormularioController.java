package com.example.api_aula_flutter.controller;

import com.example.api_aula_flutter.model.Formulario;
import com.example.api_aula_flutter.model.campos.Producao;
import com.example.api_aula_flutter.repository.FormularioRepository;
import com.example.api_aula_flutter.service.FormularioService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formularios")
public class FormularioController {

    @Autowired
    private FormularioService formularioService;

    @GetMapping
    public List<Formulario> getAllFormularios() {
        return formularioService.getFormularios();
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Formulario> salvar(@RequestBody Formulario formulario) {
        Formulario salvo = formularioService.salvarFormulario(formulario);
        return ResponseEntity.ok(salvo);
    }
}