package company_login.login.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import company_login.login.jwt.LoginJwt;
import company_login.login.service.LoginCompanyService;

@RestController
@RequestMapping("/api/auth")
public class LoginCompanyController {
    @Autowired
    private LoginCompanyService companyService;

    @Autowired
    private LoginJwt loginJwt;

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> loginData) {
        String email = loginData.get("email");
        String password = loginData.get("password");

        companyService.authCompany(email, password);

        Map<String, String> response = new HashMap<>();

        String token = loginJwt.generateToken(email);

        response.put("message", "Login Successful");
        response.put("token", token);

        return ResponseEntity.ok(response);
    }
    
}
