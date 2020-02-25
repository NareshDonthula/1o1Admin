package com.app.admin_1o1.trainer.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.admin_1o1.model.WorkoutModal;


public interface WorkoutRepository extends MongoRepository<WorkoutModal, String> {

	Object deleteByWorkoutId(String workoutId);

}
