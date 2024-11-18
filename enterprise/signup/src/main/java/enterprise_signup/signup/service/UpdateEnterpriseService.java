package enterprise_signup.signup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enterprise_signup.signup.model.UpdateEnterpriseModel;
import enterprise_signup.signup.repository.UpdateEnterpriseRepository;

@Service
public class UpdateEnterpriseService {

    private final UpdateEnterpriseRepository updateEnterpriseRepository;

    @Autowired
    public UpdateEnterpriseService(UpdateEnterpriseRepository updateEnterpriseRepository) {
        this.updateEnterpriseRepository = updateEnterpriseRepository;
    }

    public UpdateEnterpriseModel update(UpdateEnterpriseModel enterpriseUpdate) {
        // Busca a entidade existente no banco de dados
        UpdateEnterpriseModel existingEnterprise = updateEnterpriseRepository.findById(enterpriseUpdate.getId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        // Atualiza os campos do objeto existente
        existingEnterprise.setNome(enterpriseUpdate.getNome());
        existingEnterprise.setInscricaoEstadual(enterpriseUpdate.getInscricaoEstadual());
        existingEnterprise.setDataFundacao(enterpriseUpdate.getDataFundacao());
        existingEnterprise.setEndereco(enterpriseUpdate.getEndereco());
        existingEnterprise.setBairro(enterpriseUpdate.getBairro());
        existingEnterprise.setCidade(enterpriseUpdate.getCidade());
        existingEnterprise.setEstado(enterpriseUpdate.getEstado());
        existingEnterprise.setCep(enterpriseUpdate.getCep());
        existingEnterprise.setTelefone(enterpriseUpdate.getTelefone());
        existingEnterprise.setSite(enterpriseUpdate.getSite());
        existingEnterprise.setRegimeTributario(enterpriseUpdate.getRegimeTributario());
        existingEnterprise.setInscricaoMunicipal(enterpriseUpdate.getInscricaoMunicipal());
        existingEnterprise.setNaturezaJuridica(enterpriseUpdate.getNaturezaJuridica());
        existingEnterprise.setNomeFantasia(enterpriseUpdate.getNomeFantasia());
        existingEnterprise.setRamoAtividade(enterpriseUpdate.getRamoAtividade());
        existingEnterprise.setCapitalSocial(enterpriseUpdate.getCapitalSocial());
        existingEnterprise.setQuantidadeFuncionarios(enterpriseUpdate.getQuantidadeFuncionarios());
        existingEnterprise.setDescricao(enterpriseUpdate.getDescricao());
        existingEnterprise.setStatus(enterpriseUpdate.getStatus());
        existingEnterprise.setUltimaAtualizacao(enterpriseUpdate.getUltimaAtualizacao());

        // Salva e retorna a entidade atualizada
        return updateEnterpriseRepository.save(existingEnterprise);
    }
}
