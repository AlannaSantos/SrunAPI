package br.com.srun.service;

import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
import br.com.srun.model.User;

import org.springframework.stereotype.Service;
import br.com.srun.config.JWTConfig;

@Service
public class TokenService {

    public String getUserToken(User user){
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
