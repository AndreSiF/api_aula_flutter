package com.example.api_aula_flutter.model.campos;

import com.example.api_aula_flutter.model.Formulario;
import lombok.*;
import jakarta.persistence.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "producao")
public class Producao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uuid_producao")
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "uuid_formulario_producao", referencedColumnName = "uuid_formulario")
    private Formulario formulario;

    @Column(name = "especie_producao")
    private String especie;

    @Column(name = "producao_kg_producao")
    private Double producaoKg;

    @Column(name = "unidades_producao")
    private Integer unidades;
}
