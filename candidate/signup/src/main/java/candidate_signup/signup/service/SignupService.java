package candidate_signup.signup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import candidate_signup.signup.model.SignupModel;
import candidate_signup.signup.repository.SignupRepository;

@Service
public class SignupService {
    private final SignupRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public SignupService(SignupRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public SignupModel signup(SignupModel userSignup) throws Exception {
        if (userRepository.existByEmail(userSignup.getEmail())) {
        throw new Exception("Este E-mail já está em uso!");
        }

        String encodedPassword = passwordEncoder.encode(userSignup.getPassword());
        SignupModel user = new SignupModel(userSignup.getName(), userSignup.getLastName(), userSignup.getAge(), userSignup.getEmail(), encodedPassword);
        return userRepository.save(user);
    }
     
}
