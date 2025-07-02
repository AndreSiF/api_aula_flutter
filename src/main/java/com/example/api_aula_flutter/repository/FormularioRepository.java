package com.example.api_aula_flutter.repository;

import com.example.api_aula_flutter.model.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormularioRepository extends JpaRepository<Formulario, Long> {
}
