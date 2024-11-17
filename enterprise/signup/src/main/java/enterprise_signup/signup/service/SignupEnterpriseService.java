package enterprise_signup.signup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import enterprise_signup.signup.model.SignupEnterpriseModel;
import enterprise_signup.signup.repository.SignupEnterpriseRepository;

@Service
public class SignupEnterpriseService {
    private final SignupEnterpriseRepository enterpriseRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public SignupEnterpriseService(SignupEnterpriseRepository enterpriseRepository,
    BCryptPasswordEncoder passwordEncoder) {
        this.enterpriseRepository = enterpriseRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public SignupEnterpriseModel signup(SignupEnterpriseModel enterpriseSignup) throws Exception {
        if (enterpriseRepository.existCNPJ(enterpriseSignup.getEmail())) {
            throw new Exception("Este CNPJ já está em uso.");
        }
        if (enterpriseRepository.existEmail(enterpriseSignup.getEmail())) {
            throw new Exception("Este Email já está em uso.");
        }

        String encodedPassword = passwordEncoder.encode(enterpriseSignup.getPassword());

        SignupEnterpriseModel enterprise = new SignupEnterpriseModel(enterpriseSignup.getId(),
        enterpriseSignup.getNome(),
        encodedPassword,
        enterpriseSignup.getCnpj(),
        enterpriseSignup.getDataFundacao(),
        enterpriseSignup.getEndereco(),
        enterpriseSignup.getBairro(),
        enterpriseSignup.getCidade(),
        enterpriseSignup.getEstado(),
        enterpriseSignup.getCep(),
        enterpriseSignup.getTelefone(),
        enterpriseSignup.getEmail()
        );

        return enterpriseRepository.save(enterprise);
    }
    
}
