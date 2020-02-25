package com.app.admin_1o1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.admin_1o1.model.WorkoutModal;
import com.app.admin_1o1.trainer.repo.Workout;
import com.app.admin_1o1.trainer.repo.WorkoutRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/workout")
@Api(value = "1o1_admin", description = "CRUD operations on workout")
@CrossOrigin("*")
public class WorkoutController {
	private final WorkoutRepository workoutRepository;
	private final Workout workout;

	public WorkoutController(WorkoutRepository workoutRepository, Workout workout) {
		this.workoutRepository = workoutRepository;
		this.workout = workout;

	}
	// Get a workout by workout id
	@RequestMapping(value = "/{workout_id}", method = RequestMethod.GET)
	public WorkoutModal getWorkout(@PathVariable String workout_id) {

		return workout.getWorkoutByWorkoutId(workout_id);
	}

	// Get all workouts created by a trainer by trainer id
	@RequestMapping(value = "/trainer/{trainer_id}", method = RequestMethod.GET)
	public List<WorkoutModal> getAllWorkoutById(@PathVariable String trainer_id) {

		return workout.getAllWorkoutsById(trainer_id);
	}
}
