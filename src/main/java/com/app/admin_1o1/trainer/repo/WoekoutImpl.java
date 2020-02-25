package com.app.admin_1o1.trainer.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.app.admin_1o1.MultipleMongoConfig;
import com.app.admin_1o1.model.WorkoutModal;

@Repository
public class WoekoutImpl implements Workout {

	@Autowired
	private MultipleMongoConfig mongoTemplate;

	@Override
	public List<WorkoutModal> getAllWorkoutsById(String userId) {
		List<WorkoutModal> result = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		try {
			result = mongoTemplate.trainerMongoTemplate().find(query, WorkoutModal.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public WorkoutModal getWorkoutByWorkoutId(String workout) {
		WorkoutModal result = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("workoutId").is(workout));
		try {
			result = mongoTemplate.trainerMongoTemplate().findOne(query, WorkoutModal.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public WorkoutModal UpdateWorkout(String workoutId, WorkoutModal data) {
		WorkoutModal result = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("workoutId").is(workoutId));

		Update update = new Update();

		if (data.getWorkoutName() != null && !data.getWorkoutName().isEmpty())
			update.set("workoutName", data.getWorkoutName());

		if (data.getCustomWorkoutName() != null && !data.getCustomWorkoutName().isEmpty())
			update.set("customWorkoutName", data.getCustomWorkoutName());

		if (data.getWorkoutExercises() != null && !data.getWorkoutExercises().isEmpty())
			update.set("workoutExercises", data.getWorkoutExercises());

		try {
			result =  mongoTemplate.trainerMongoTemplate().findAndModify(query, update, WorkoutModal.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
