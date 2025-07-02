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
@Table(name = "producao_ornamentais")
public class ProducaoOrnamentais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producao_ornamentais", updatable = false, nullable = false)
    private Long id;

    @UuidGenerator
    @Column(name = "uuid_producao_ornamentais")
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "id_formulario_producao_ornamentais", referencedColumnName = "id_formulario")
    @JsonBackReference
    private Formulario formulario;

    @Column(name = "uf_origem_producao_ornamentais")
    private String ufOrigem;

    @Column(name = "unidades_producao_ornamentais")
    private Integer unidades;

    @Column(name = "quantidade_producao_ornamentais")
    private Double quantidade;
}
