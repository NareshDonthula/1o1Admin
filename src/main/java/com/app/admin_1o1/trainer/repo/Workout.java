package com.app.admin_1o1.trainer.repo;

import java.util.List;

import com.app.admin_1o1.model.WorkoutModal;

public interface Workout {
	List<WorkoutModal> getAllWorkoutsById(String uesrId);

	WorkoutModal getWorkoutByWorkoutId(String workoutId);

	WorkoutModal UpdateWorkout(String workoutId, WorkoutModal data);
}
