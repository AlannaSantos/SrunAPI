package br.com.srun.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.srun.model.User;
import br.com.srun.repository.UserRepository;
import br.com.srun.service.TokenService;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    
    @Autowired
    UserRepository daoUser;

    @Autowired
    TokenService tokenService;

    @PostMapping("/{email}/{password}")
    public User login(@PathVariable String email, @PathVariable String password){
        
        User user = daoUser.findByEmail(email);
        System.out.println(user); 
        String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes());

        if(!encodedPassword.equals(user.getPassword())) return null;
        //Adicionar aqui posteriormente, verificação do status do usuário
        
        String userToken = tokenService.getUserToken(user);
        user.setToken(userToken); 
        user.setPassword(null);

        return user;
    }
}
