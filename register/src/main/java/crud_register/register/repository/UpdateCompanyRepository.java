package crud_register.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import crud_register.register.model.UpdateCompanyModel;

public interface UpdateCompanyRepository extends JpaRepository<UpdateCompanyModel, Long> {
    UpdateCompanyModel existById(long id);
}
