package com.example.api_aula_flutter.model.campos;

import com.example.api_aula_flutter.model.Formulario;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.scheduling.support.SimpleTriggerContext;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pessoa", updatable = false, nullable = false)
    private Long id;

    @UuidGenerator
    @Column(name = "uuid_pessoa")
    private UUID uuid;

    @OneToOne(mappedBy = "pessoa", cascade = CascadeType.ALL)
    @JsonBackReference
    private Formulario formulario;

    @Column(name = "nome_pessoa")
    private String nome;

    @Column(name = "cpf_pessoa")
    private String cpf;

    @Column(name = "telefone_pessoa")
    private String telefone;

    @Column(name = "email_pessoa")
    private String email;

    @Column(name = "rgp_pessoa")
    private String rgp;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "uf")
    private String uf;

    @Column(name = "municipio")
    private String municipio;

    @Column(name = "razao_social")
    private String razaoSocial;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "cnae")
    private String cnae;

    @Column(name = "responsavel_legal")
    private String responsavelLegal;

    @Column(name = "cpf_responsavel_legal")
    private String cpfResponsavelLegal;

    @Column(name = "rgp_responsavel_legal")
    private String rgpResponsavelLegal;

    @Column(name = "telefone_responsavel_legal")
    private String telefoneResponsavelLegal;

    @Column(name = "email_responsavel_legal")
    private String emailResponsavelLegal;
}