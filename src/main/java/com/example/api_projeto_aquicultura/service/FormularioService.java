package com.example.api_projeto_aquicultura.service;

import com.example.api_projeto_aquicultura.model.Formulario;
import com.example.api_projeto_aquicultura.model.campos.*;
import com.example.api_projeto_aquicultura.repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormularioService {

    @Autowired
    private FormularioRepository formularioRepository;

    public Formulario salvarFormulario(Formulario formulario) {
        if (formulario.getAquisicoesFormaJovem() != null) {
            for (AquisicaoJovem aquisicaoJovem : formulario.getAquisicoesFormaJovem()) {
                aquisicaoJovem.setFormulario(formulario);
            }
        }
        if (formulario.getAquisicoesRacao() != null) {
            for (AquisicaoRacao aquisicaoRacao : formulario.getAquisicoesRacao()) {
                aquisicaoRacao.setFormulario(formulario);
            }
        }
        if (formulario.getComercializacaoEspecie() != null) {
            for (Comercializacao comercializacao : formulario.getComercializacaoEspecie()) {
                comercializacao.setFormulario(formulario);
            }
        }
        if (formulario.getFormasJovem() != null) {
            for (FormaJovem formaJovem : formulario.getFormasJovem()) {
                formaJovem.setFormulario(formulario);
            }
        }
        if (formulario.getProducoes() != null) {
            for (Producao producao : formulario.getProducoes()) {
                producao.setFormulario(formulario);
            }
        }
        if (formulario.getProducoesOrnamentais() != null) {
            for (ProducaoOrnamentais producao : formulario.getProducoesOrnamentais()) {
                producao.setFormulario(formulario);
            }
        }
        if (formulario.getProducoesOrnamental() != null) {
            for (ProducaoOrnamental producao : formulario.getProducoesOrnamental()) {
                producao.setFormulario(formulario);
            }
        }
        return formularioRepository.save(formulario);
    }

    public List<Formulario> getFormularios(){
        return formularioRepository.findAll();
    }

    public Formulario findById(Long id) {
        return formularioRepository.findById(id).get();
    }
}
