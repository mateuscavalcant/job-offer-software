package enterprise_signup.signup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import enterprise_signup.signup.model.SignupEnterpriseModel;

public interface SignupEnterpriseRepository extends JpaRepository<SignupEnterpriseModel, Long> {
    boolean existCNPJ(String cnpj);
    boolean existEmail(String email);
}
