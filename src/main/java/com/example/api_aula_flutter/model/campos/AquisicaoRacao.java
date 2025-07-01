package com.example.api_aula_flutter.model.campos;

import com.example.api_aula_flutter.model.Formulario;
import lombok.*;
import jakarta.persistence.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "aquisicao_racao")
public class AquisicaoRacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uuid_aquisicao_racao")
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "uuid_formulario_aquisicao_racao", referencedColumnName = "uuid_formulario")
    private Formulario formulario;

    @Column(name = "uf_origem_aquisicao_racao")
    private String ufOrigem;

    @Column(name = "unidade_aquisicao_racao")
    private String unidade;

    @Column(name = "quantidade_aquisicao_racao")
    private Double quantidade;

}
