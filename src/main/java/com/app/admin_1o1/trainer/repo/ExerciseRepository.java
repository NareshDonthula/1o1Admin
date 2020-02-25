package com.app.admin_1o1.trainer.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.admin_1o1.model.ExerciseModal;


public interface ExerciseRepository extends MongoRepository<ExerciseModal, String> {
	ExerciseModal findByUserId(String  String);
	Object deleteByExerciseId(String  String);
}
