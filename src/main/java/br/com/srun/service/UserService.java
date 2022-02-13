package br.com.srun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.srun.model.User;
import br.com.srun.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserRepository daoUser;
	
	public User save(User user) {
		return daoUser.save(user);
	}
	
	public User findByEmail(String email) {
		if(email == null) throw new IllegalArgumentException("O Email do usuário está nulo.");
		
		return daoUser.findByEmail(email);
	}
	
	public List<User> listAll() { //Busca todos os Usuários cadastrados.
		
		return daoUser.findAll();
	}
}
