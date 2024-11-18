package enterprise_signup.signup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import enterprise_signup.signup.model.UpdateEnterpriseModel;

public interface UpdateEnterpriseRepository extends JpaRepository<UpdateEnterpriseModel, Long> {
    UpdateEnterpriseModel finById(long id);
}
