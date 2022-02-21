package br.com.srun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.srun.model.ActivityRoute;
import br.com.srun.repository.ActivityRouteRepository;

@Service
@Transactional
public class ActivityRouteService {

	@Autowired
	ActivityRouteRepository daoActivityRoute;
	
	public List<ActivityRoute> listAll(){
		return daoActivityRoute.findAll();
	}
}
