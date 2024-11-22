package crud_register.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import crud_register.register.model.DeleteCompanyModel;

public interface DeleteCompanyRepository extends JpaRepository<DeleteCompanyModel, Long> {
    DeleteCompanyModel findById(long id);
    DeleteCompanyModel findByEmail(String email);
}
