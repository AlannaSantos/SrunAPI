package br.com.srun.repository;

//import java.util.List;
//import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.srun.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
	//boolean existsByEmail(String email);
	//public List<User> findAllByOrderName();
}
