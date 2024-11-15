package candidate_signup.signup.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import candidate_signup.signup.model.SignupModel;
import candidate_signup.signup.service.SignupService;

@RestController
@RequestMapping("api/auth")
@CrossOrigin(origins = "")
public class SignupController {
    private SignupService userSignupService;
    
    @Autowired
    public SignupController(SignupService userSignupService) {
        this.userSignupService = userSignupService;
    }

    @PostMapping("/signup")
    public ResponseEntity<Map<String, String>> singup(@RequestBody SignupModel userSignupModel) {
        Map<String, String> response = new HashMap<>();

        try {
            userSignupService.signup(userSignupModel);
            response.put("message", "Usuário registrado com sucesso");
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (Exception e) {
        response.put("error", e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
    }
}
