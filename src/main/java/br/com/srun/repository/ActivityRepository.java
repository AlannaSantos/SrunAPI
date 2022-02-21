package br.com.srun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.srun.model.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long> {

	//Analisar opções de buscas
	
}
