package com.app.admin_1o1.trainer.repo;
import java.util.List;
import com.app.admin_1o1.model.ExerciseModal;


public interface Exercise {

	List<ExerciseModal> getAllExerciseById(String userId);
	//ExerciseModal addNewFile(ExerciseModal exercise);
	ExerciseModal getExerciseByExerciseId(String exercieId);
	//ExerciseModal UpdateExercise(String exerciseId, ExerciseModal data);
	public Object deleteObject(String id);
}
