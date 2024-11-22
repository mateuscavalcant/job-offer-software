package company_login.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import company_login.login.model.LoginCompanyModel;
import company_login.login.repository.LoginCompanyRepository;

@Service
public class LoginCompanyService {
    @Autowired
    private LoginCompanyRepository companyRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public LoginCompanyModel authCompany(String email, String password) {
        LoginCompanyModel company = companyRepository.findByEmail(email);

        if (company == null) {
            System.out.println("User not found" + email);
            throw new RuntimeException("Invalid credentials");
        }

        if (!passwordEncoder.matches(password, company.getPassword())) {
            System.out.println("Failed in encode password");
            throw new RuntimeException("Invalid password");
        }

        return company;
    }
    
}
