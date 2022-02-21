package br.com.srun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.srun.model.Activity;
import br.com.srun.repository.ActivityRepository;

@Service
@Transactional
public class ActivityService {

	@Autowired
	ActivityRepository daoActivity;
	
	public List<Activity> listAll(){
		return daoActivity.findAll();
	}
}
