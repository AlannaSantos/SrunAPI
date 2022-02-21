package br.com.srun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.srun.model.ActivityRhythm;
import br.com.srun.service.ActivityRhythmService;

@RestController
@RequestMapping("/srun/users/activitys/rhythms")
public class ActivityRhythmController {

	@Autowired
	ActivityRhythmService activityRhythmService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ActivityRhythm> listAll() {
		
		return activityRhythmService.listAll();
	}
}
