package br.com.srun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.srun.model.ActivityRhythm;
import br.com.srun.repository.ActivityRhythmRepository;

@Service
@Transactional
public class ActivityRhythmService {

	@Autowired
	ActivityRhythmRepository daoActivityRhythm;
	
	public List<ActivityRhythm> listAll(){
		return daoActivityRhythm.findAll();
	}
}
