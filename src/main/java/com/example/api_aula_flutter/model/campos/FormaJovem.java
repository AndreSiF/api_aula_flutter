package com.example.api_aula_flutter.model.campos;

import com.example.api_aula_flutter.model.Formulario;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "forma_jovem")
public class FormaJovem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uuid_forma_jovem")
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "uuid_formulario_forma_jovem", referencedColumnName = "uuid_formulario")
    private Formulario formulario;

    @Column(name = "especie_forma_jovem")
    private String especie;

    @Column(name = "milheiros_forma_jovem")
    private Double milheiros;
}
