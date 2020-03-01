package com.app.admin_1o1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.admin_1o1.model.TraineeModal;
import com.app.admin_1o1.trainee.repo.Trainee;
import com.app.admin_1o1.trainee.repo.TraineeRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/trainee")
@Api(value = "1o1_admin", description = "CRUD operations on trainee")
@CrossOrigin("*")
public class TraineeController {
	private final TraineeRepository traineeRepository;
	private final Trainee trainee;

	public TraineeController(TraineeRepository traineeRepository, Trainee trainee) {
		this.traineeRepository = traineeRepository;
		this.trainee = trainee;
	}
	// get all trainees
		@RequestMapping(value = "", method = RequestMethod.GET)
		public List<TraineeModal> getAllTrainees() {
			//return traineeRepository.findAll();
			return trainee.getTrainees();
		}
	
}
