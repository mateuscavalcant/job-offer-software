package candidate_login.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import candidate_login.login.model.LoginModel;


public interface LoginRepository extends JpaRepository<LoginModel, Long> {
    LoginModel findByEmail(String email);
    
}
