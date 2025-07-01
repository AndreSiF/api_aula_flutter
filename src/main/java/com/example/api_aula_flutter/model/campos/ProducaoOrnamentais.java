package com.example.api_aula_flutter.model.campos;

import com.example.api_aula_flutter.model.Formulario;
import lombok.*;
import jakarta.persistence.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "producao_ornamentais")
public class ProducaoOrnamentais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uuid_producao_ornamentais")
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "uuid_formulario_producao_ornamentais", referencedColumnName = "uuid_formulario")
    private Formulario formulario;

    @Column(name = "uf_origem_producao_ornamentais")
    private String ufOrigem;

    @Column(name = "unidades_producao_ornamentais")
    private Integer unidades;

    @Column(name = "quantidade_producao_ornamentais")
    private Double quantidade;
}
