package com.app.admin_1o1.controller;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.admin_1o1.model.ExerciseModal;
import com.app.admin_1o1.trainer.repo.Exercise;
import com.app.admin_1o1.trainer.repo.ExerciseRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/exercise")
@Api(value = "fitness", description = "CRUD operations on exercise")
@CrossOrigin
public class ExerciseController extends Throwable {

	private static final long serialVersionUID = 1L;
	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final ExerciseRepository exerciseRepository;
	private final Exercise exercise;

	public ExerciseController(ExerciseRepository exerciseRepository, Exercise exercise) {
		this.exerciseRepository = exerciseRepository;
		this.exercise = exercise;

	}

	// Create an exercise (or) Update an exercise
//	@RequestMapping(value = "", method = RequestMethod.POST)
//	public ExerciseModal addExercise(@RequestBody ExerciseModal inputExercise) {
//		String exerciseId = inputExercise.getExerciseId();
//		ExerciseModal result = exercise.getExerciseByExerciseId(exerciseId);
//		if (result != null) {
//			return exercise.UpdateExercise(exerciseId, inputExercise);
//		}
//		return exerciseRepository.save(inputExercise);
//	}

	// Get an exercise by exercise id
	@RequestMapping(value = "/{exercise_id}", method = RequestMethod.GET)
	public ExerciseModal getExercise(@PathVariable String exercise_id) {
		return exercise.getExerciseByExerciseId(exercise_id);
	}

	// Get all exercises created by a trainer by trainer id
	@RequestMapping(value = "/trainer/{trainer_id}", method = RequestMethod.GET)
	public List<ExerciseModal> getAllExerciseById(@PathVariable String trainer_id) {
		return exercise.getAllExerciseById(trainer_id);
	}

	@RequestMapping(value = "/delete/", method = RequestMethod.POST)
	public Object deleteExercise(@RequestBody String exercise_id) {
		return exerciseRepository.deleteByExerciseId(exercise_id);
	}

	@ExceptionHandler({ ExerciseController.class })
	public void handleException() {
		System.out.println(getMessage());
	}
}
