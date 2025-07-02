package com.example.api_projeto_aquicultura.model.campos;

import com.example.api_projeto_aquicultura.model.Formulario;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "producao_ornamental")
public class ProducaoOrnamental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producao_ornamental", updatable = false, nullable = false)
    private Long id;

    @UuidGenerator
    @Column(name = "uuid_producao_ornamental")
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "id_formulario_producao_ornamental", referencedColumnName = "id_formulario")
    @JsonBackReference
    private Formulario formulario;

    @Column(name = "especie_producao_ornamental")
    private String especie;

    @Column(name = "producao_kg_producao_ornamental")
    private Double producaoKg;

    @Column(name = "unidades_producao_ornamental")
    private Integer unidades;
}
