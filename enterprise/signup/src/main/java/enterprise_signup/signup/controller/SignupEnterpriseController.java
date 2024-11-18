package enterprise_signup.signup.controller;

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

import enterprise_signup.signup.model.SignupEnterpriseModel;
import enterprise_signup.signup.service.SignupEnterpriseService;


@RestController
@RequestMapping("/api/auth")
@CrossOrigin("")
public class SignupEnterpriseController {
    private final SignupEnterpriseService enterpriseService;


    @Autowired
    public SignupEnterpriseController(SignupEnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }


    @PostMapping("/enterprise/signup")
    public ResponseEntity<Map<String, String>> signup(@RequestBody SignupEnterpriseModel enterpriseSignup) {
        Map<String, String> response = new HashMap<>();

        try {
        enterpriseService.signup(enterpriseSignup);
        response.put("message", "Usuário registrado com sucesso.");
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

        } catch (Exception e) {
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }

    }
    
}
