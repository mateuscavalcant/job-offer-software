package crud_register.register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import crud_register.register.model.CreateCompanyModel;
import crud_register.register.repository.CreateCompanyRepository;

public class CreateCompanyService {
    private final CreateCompanyRepository companyRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public CreateCompanyService(CreateCompanyRepository companyRepository,
    BCryptPasswordEncoder passwordEncoder) {
        this.companyRepository = companyRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public CreateCompanyModel signup(CreateCompanyModel companyCreate) throws Exception {
        if (companyRepository.existByCNPJ(companyCreate.getEmail())) {
            throw new Exception("Este CNPJ já está em uso.");
        }
        if (companyRepository.existByEmail(companyCreate.getEmail())) {
            throw new Exception("Este Email já está em uso.");
        }

        String encodedPassword = passwordEncoder.encode(companyCreate.getPassword());

        CreateCompanyModel newCompany = new CreateCompanyModel(companyCreate.getId(),
        companyCreate.getNome(),
        encodedPassword,
        companyCreate.getCnpj(),
        companyCreate.getDataFundacao(),
        companyCreate.getEndereco(),
        companyCreate.getBairro(),
        companyCreate.getCidade(),
        companyCreate.getEstado(),
        companyCreate.getCep(),
        companyCreate.getTelefone(),
        companyCreate.getEmail()
        );

        return companyRepository.save(newCompany);
    }
    
}
