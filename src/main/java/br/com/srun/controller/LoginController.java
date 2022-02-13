package br.com.srun.controller;

import java.time.LocalDate;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.srun.config.JWTConfig;
import br.com.srun.model.User;
import br.com.srun.repository.UserRepository;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    
    @Autowired
    UserRepository daoUser;

    @PostMapping("/{email}/{password}")
    public User login(@PathVariable String email, @PathVariable String password){
        
        User user = daoUser.findByEmail(email); 
        String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes());

        if(!encodedPassword.equals(user.getPassword())) return null;
        //Adicionar aqui posteriormente, verificação do status do usuário
        
        String userToken = getUserToken(user);
        user.setToken(userToken);
        
        return user;
    }

    private String getUserToken(User user){
        Map<String, Object> headerClaims = new HashMap<>();

        headerClaims.put("email", user.getEmail());
        headerClaims.put("id", user.getId());
        headerClaims.put("firstname", user.getFirstname());
        headerClaims.put("lastname", user.getLastname());
        headerClaims.put("dataToken", LocalDate.now().toString());

        String jwtToken = JWTConfig.createToken(headerClaims);
        return jwtToken;
    }
}
