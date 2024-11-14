package candidate_signup.signup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import candidate_signup.signup.model.SignupModel;

public interface SignupRepository extends JpaRepository<SignupModel, Long> {
    boolean existByEmail(String email);
}
