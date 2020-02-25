package com.app.admin_1o1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.app.admin_1o1.model.TrainerModel;
import com.app.admin_1o1.trainer.repo.Trainer;
import com.app.admin_1o1.trainer.repo.TrainerRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/trainer")
@Api(value = "1o1_admin", description = "CRUD operations on trainer")
@CrossOrigin("*")
public class TrainerController {
	private final TrainerRepository trainerRepository;
	private final Trainer trainer;

	public TrainerController(TrainerRepository trainerRepository, Trainer trainer) {
		this.trainerRepository = trainerRepository;
		this.trainer = trainer;
	}

	// get all trainers
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<TrainerModel> getAllTrainers() {
		return trainerRepository.findAll();
	}

	// Get a trainer by id or id's
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public List<TrainerModel> getTtainer(@PathVariable String id) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		boolean result = pat.matcher(id).matches();
		if (result == true) {
			List<TrainerModel> list = new ArrayList<TrainerModel>();
			list.add(trainer.getByUserName(id));
			return list;
		} else {
			return trainer.getAllTrainers(id);
		}
	}

	// Get trainer data with
	// userId,imgPath,firstName,lastName,mp4Destination,thumbnailDestination,city
	@RequestMapping(value = "/trainers", method = RequestMethod.GET)
	public List<TrainerModel> getTrainers() {
		return trainer.getLimitedFields();
	}

	// Update trainer status
	@RequestMapping(value = "/status", method = RequestMethod.POST)
	public void updateTrainer(@RequestBody TrainerModel model) {
		 trainer.updateTrainer(model);
	}
}
