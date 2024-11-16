package enterprise_signup.signup.model;

import java.time.LocalDate;

public class SignupEnterpriseModel {

    // Atributos básicos
    private Long id;
    private String nome;
    private String cnpj;
    private String inscricaoEstadual;
    private LocalDate dataFundacao;

    // Endereço
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    // Contato
    private String telefone;
    private String email;
    private String site;

    // Dados fiscais
    private String regimeTributario;
    private String inscricaoMunicipal;
    private String naturezaJuridica;

    // Informações adicionais
    private String nomeFantasia;
    private String ramoAtividade;
    private Double capitalSocial;
    private Integer quantidadeFuncionarios;
    private String descricao;

    // Status
    private String status;
    private LocalDate dataRegistro;
    private LocalDate ultimaAtualizacao;


    public SignupEnterpriseModel() {}

    public SignupEnterpriseModel(Long id,
    String nome,
    String cnpj,
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
    this.id = id;
    this.nome = nome;
    this.cnpj = cnpj;
    this.inscricaoEstadual = inscricaoEstadual;
    this.dataFundacao = dataFundacao;
    this.endereco = endereco;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.cep = cep;
    this.telefone = telefone;
    this.email = email;
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
    this.dataRegistro = dataRegistro;
    this.ultimaAtualizacao = ultimaAtualizacao;
}


    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(LocalDate dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getRegimeTributario() {
        return regimeTributario;
    }

    public void setRegimeTributario(String regimeTributario) {
        this.regimeTributario = regimeTributario;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getNaturezaJuridica() {
        return naturezaJuridica;
    }

    public void setNaturezaJuridica(String naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRamoAtividade() {
        return ramoAtividade;
    }

    public void setRamoAtividade(String ramoAtividade) {
        this.ramoAtividade = ramoAtividade;
    }

    public Double getCapitalSocial() {
        return capitalSocial;
    }

    public void setCapitalSocial(Double capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public Integer getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDate getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDate ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    
}
