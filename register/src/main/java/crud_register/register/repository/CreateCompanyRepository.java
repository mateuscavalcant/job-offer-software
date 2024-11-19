package crud_register.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import crud_register.register.model.CreateCompanyModel;

public interface CreateCompanyRepository extends JpaRepository<CreateCompanyModel, Long> {
    boolean existByEmail(String email);
    boolean existByCNPJ(String cnpj);
}
