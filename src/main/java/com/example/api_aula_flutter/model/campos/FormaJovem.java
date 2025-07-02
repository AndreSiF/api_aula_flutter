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
@Table(name = "forma_jovem")
public class FormaJovem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_forma_jovem", updatable = false, nullable = false)
    private Long id;

    @UuidGenerator
    @Column(name = "uuid_forma_jovem")
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "id_formulario_forma_jovem", referencedColumnName = "id_formulario")
    @JsonBackReference
    private Formulario formulario;

    @Column(name = "especie_forma_jovem")
    private String especie;

    @Column(name = "milheiros_forma_jovem")
    private Double milheiros;
}
