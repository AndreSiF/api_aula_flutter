package com.example.api_aula_flutter.model.campos;

import com.example.api_aula_flutter.model.Formulario;
import lombok.*;
import jakarta.persistence.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comercializacao")
public class Comercializacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uuid_comercializacao")
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "uuid_formulario_comercializacao", referencedColumnName = "uuid_formulario")
    private Formulario formulario;

    @Column(name = "uf_origem_comercializacao")
    private String ufOrigem;

    @Column(name = "especie_comercializacao")
    private String especie;

    @Column(name = "producao_kg_comercializacao")
    private Double producaoKg;

    @Column(name = "quantidade_comercializacao")
    private Integer quantidade;

    @Column(name = "preco_medio_comercializacao")
    private Double precoMedio;

}