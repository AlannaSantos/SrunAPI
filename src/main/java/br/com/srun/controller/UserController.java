package br.com.srun.controller;

import java.util.List;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.srun.model.User;
import br.com.srun.service.UserService;

@RestController
@RequestMapping("/srun/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User save(@RequestBody User user) {
		return userService.save(user);
	}
	
	/*@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public User findByEmail(@RequestBody User user) {
		User usuario = userService.findByEmail(user.getEmail());
		if(usuario != null) return usuario;
		else return null;
	}*/
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<User> listAll() { //Busca todos os Usuários cadastrados.
		
		return userService.listAll();
	}
}
