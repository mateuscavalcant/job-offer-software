package company_login.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import company_login.login.model.LoginCompanyModel;

public interface LoginCompanyRepository extends JpaRepository<LoginCompanyModel, Long>{
    LoginCompanyModel findByEmail(String email);
}
