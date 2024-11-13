package candidate_login.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import candidate_login.login.model.LoginModel;
import candidate_login.login.repository.LoginRepository;


@Service
public class LoginService {

    @Autowired
    private LoginRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    public LoginModel authenticateUser(String email, String password) {
        LoginModel user = userRepository.findByEmail(email);

        if (user == null) {
            System.out.println("User not found" + email);
            throw new RuntimeException("Invalid credentials");
        }

        if (!passwordEncoder.matches(password, user.getPassword())) {
            System.out.println("Failed in encode password");
            throw new RuntimeException("Invalid password");
        }

        return user;
    }
    
}
