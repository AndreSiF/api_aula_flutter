package com.example.api_aula_flutter.model.campos;

import com.example.api_aula_flutter.model.Formulario;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "aquisicao_jovem")
public class AquisicaoJovem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uuid_aquisicao_jovem")
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "uuid_formulario_aquisicao_jovem", referencedColumnName = "uuid_formulario")
    private Formulario formulario;

    @Column(name = "uf_origem_aquisicao_jovem")
    private String ufOrigem;

    @Column(name = "especie_aquisicao_jovem")
    private String especie;

    @Column(name = "milheiros_aquisicao_jovem")
    private Double milheiros;

}
