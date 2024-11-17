package enterprise_signup.signup.model;

import java.time.LocalDate;

public class UpdateEnterpriseModel extends SignupEnterpriseModel {


    public UpdateEnterpriseModel() {}

    public UpdateEnterpriseModel(String nome,
    String password,
    String inscricaoEstadual,
    LocalDate dataFundacao,
    String endereco,
    String bairro,
    String cidade,
    String estado,
    String cep,
    String telefone,
    String email,
    String site,
    String regimeTributario,
    String inscricaoMunicipal,
    String naturezaJuridica,
    String nomeFantasia,
    String ramoAtividade,
    Double capitalSocial,
    Integer quantidadeFuncionarios,
    String descricao,
    String status,
    LocalDate dataRegistro,
    LocalDate ultimaAtualizacao
) {

    this.nome = nome;
    this.inscricaoEstadual = inscricaoEstadual;
    this.dataFundacao = dataFundacao;
    this.endereco = endereco;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.cep = cep;
    this.telefone = telefone;
    this.site = site;
    this.regimeTributario = regimeTributario;
    this.inscricaoMunicipal = inscricaoMunicipal;
    this.naturezaJuridica = naturezaJuridica;
    this.nomeFantasia = nomeFantasia;
    this.ramoAtividade = ramoAtividade;
    this.capitalSocial = capitalSocial;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.descricao = descricao;
    this.status = status;
    this.ultimaAtualizacao = ultimaAtualizacao;
} 
    
}
