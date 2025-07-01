package com.example.api_aula_flutter.model;

import com.example.api_aula_flutter.model.campos.*;
import lombok.*;
import jakarta.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "formulario")
public class Formulario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uuid_formulario")
    private String uuid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uuid_pessoa_formulario", referencedColumnName = "uuid_pessoa")
    private Pessoa pessoa;

    // Responsável Técnico
    @Column(name = "has_responsavel_tecnico")
    private Boolean hasResponsavelTecnico;

    @Column(name = "nome_responsavel_tecnico")
    private String nomeResponsavelTecnico;

    @Column(name = "registro_responsavel_tecnico")
    private String registroResponsavelTecnico;

    @Column(name = "telefone_responsavel_tecnico")
    private String telefoneResponsavelTecnico;

    @Column(name = "email_responsavel_tecnico")
    private String emailResponsavelTecnico;

    // Empreendimento
    @Column(name = "endereco_empreendimento")
    private String enderecoEmpreendimento;

    @Column(name = "municipio_empreendimento")
    private String municipioEmpreendimento;

    @Column(name = "uf_empreendimento")
    private String ufEmpreendimento;

    // Coordenadas Geográficas
    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    // Documentação
    @Column(name = "has_dap")
    private Boolean hasDap;

    @Column(name = "dap")
    private Integer dap;

    @Column(name = "has_licenca_ambiental")
    private Boolean hasLicencaAmbiental;

    @Column(name = "licenca_ambiental")
    private Integer licencaAmbiental;

    @Column(name = "has_outorga")
    private Boolean hasOutorga;

    @Column(name = "outorga")
    private String outorga;

    @Column(name = "has_ctf")
    private Boolean hasCtf;

    @Column(name = "ctf")
    private Integer ctf;

    @Column(name = "has_car")
    private Boolean hasCar;

    @Column(name = "car")
    private String car;

    @Column(name = "has_oesa")
    private Boolean hasOesa;

    @Column(name = "oesa")
    private Integer oesa;

    @Column(name = "has_assistencia_tecnica")
    private Boolean hasAssistenciaTecnica;

    @Column(name = "atendimentos_ano")
    private Integer atendimentosAno;

    // Modelo e Produção
    @Column(name = "has_viveiro")
    private Boolean hasViveiro;

    @Column(name = "tipo_viveiro")
    private String tipoViveiro;

    @Column(name = "area_viveiro")
    private Double areaViveiro;

    // Tanque Rede
    @Column(name = "has_tanque_rede")
    private Boolean hasTanqueRede;

    @Column(name = "area_tanque_rede")
    private Double areaTanqueRede;

    // Sistema Fechado
    @Column(name = "has_sistema_fechado")
    private Boolean hasSistemaFechado;

    @Column(name = "tipo_sistema_fechado")
    private String tipoSistemaFechado;

    @Column(name = "area_sistema_fechado")
    private Double areaSistemaFechado;

    // Raceway
    @Column(name = "has_raceway")
    private Boolean hasRaceway;

    @Column(name = "area_raceway")
    private Double areaRaceway;

    // Produção
    @OneToMany(mappedBy = "formulario", cascade = CascadeType.ALL)
    private List<Producao> producoes;

    // Forma Jovem
    @Column(name = "area_forma_jovem")
    private Double areaFormaJovem;

    @OneToMany(mappedBy = "formulario", cascade = CascadeType.ALL)
    private List<FormaJovem> formasJovem;

    // Ornamental
    @OneToMany(mappedBy = "formulario", cascade = CascadeType.ALL)
    private List<ProducaoOrnamental> producoesOrnamental;

    // Aquisição de formas jovens
    @OneToMany(mappedBy = "formulario", cascade = CascadeType.ALL)
    private List<AquisicaoJovem> aquisicoesFormaJovem;

    // Aquisição de Ração
    @OneToMany(mappedBy = "formulario", cascade = CascadeType.ALL)
    private List<AquisicaoRacao> aquisicoesRacao;

    // Comercialização por espécie
    @OneToMany(mappedBy = "formulario", cascade = CascadeType.ALL)
    private List<Comercializacao> comercializacaoEspecie;

    // Produção de Ornamentais
    @OneToMany(mappedBy = "formulario", cascade = CascadeType.ALL)
    private List<ProducaoOrnamentais> producoesOrnamentais;
}
