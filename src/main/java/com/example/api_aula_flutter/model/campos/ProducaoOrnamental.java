package com.example.api_aula_flutter.model.campos;

import com.example.api_aula_flutter.model.Formulario;
import lombok.*;
import jakarta.persistence.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "producao_ornamental")
public class ProducaoOrnamental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uuid_producao_ornamental")
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "uuid_formulario_producao_ornamental", referencedColumnName = "uuid_formulario")
    private Formulario formulario;

    @Column(name = "especie_producao_ornamental")
    private String especie;

    @Column(name = "producao_kg_producao_ornamental")
    private Double producaoKg;

    @Column(name = "unidades_producao_ornamental")
    private Integer unidades;
}
