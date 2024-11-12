package candidate_login.login.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import candidate_login.login.service.LoginService;


@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:8081")
public class LoginController {

    @Autowired
    private LoginService userService;


    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> loginData) {
        String email = loginData.get("email");
        String password = loginData.get("password");

        userService.authenticateUser(email, password);

        Map<String, String> response = new HashMap<>();

        response.put("message", "Login Successful");

        return ResponseEntity.ok(response);
    }



    
}
