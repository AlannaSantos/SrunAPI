package br.com.srun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.srun.model.Activity;
import br.com.srun.service.ActivityService;

@RestController
@RequestMapping("/srun/users/activitys")
public class ActivityController {

	@Autowired
	ActivityService activityService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Activity> listAll() {
		
		return activityService.listAll();
	}
}
