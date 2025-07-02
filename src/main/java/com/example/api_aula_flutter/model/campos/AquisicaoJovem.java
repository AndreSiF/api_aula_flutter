package com.example.api_aula_flutter.model.campos;

import com.example.api_aula_flutter.model.Formulario;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "aquisicao_jovem")
public class AquisicaoJovem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aquisicao_jovem", updatable = false, nullable = false)
    private Long id;

    @UuidGenerator
    @Column(name = "uuid_aquisicao_jovem")
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "id_formulario_aquisicao_jovem", referencedColumnName = "id_formulario")
    @JsonBackReference
    private Formulario formulario;

    @Column(name = "uf_origem_aquisicao_jovem")
    private String ufOrigem;

    @Column(name = "especie_aquisicao_jovem")
    private String especie;

    @Column(name = "milheiros_aquisicao_jovem")
    private Double milheiros;

}
