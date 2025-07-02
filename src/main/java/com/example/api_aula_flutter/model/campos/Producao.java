package com.example.api_aula_flutter.model.campos;

import com.example.api_aula_flutter.model.Formulario;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "producao")
public class Producao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producao", updatable = false, nullable = false)
    private Long id;

    @UuidGenerator
    @Column(name = "uuid_producao")
    private UUID uuid;

    @Column(name = "especie_producao")
    private String especie;

    @Column(name = "producao_kg_producao")
    private Double producaoKg;

    @Column(name = "unidades_producao")
    private Integer unidades;

    @ManyToOne
    @JoinColumn(name = "id_formulario_producao", referencedColumnName = "id_formulario")
    @JsonBackReference
    private Formulario formulario;
}
