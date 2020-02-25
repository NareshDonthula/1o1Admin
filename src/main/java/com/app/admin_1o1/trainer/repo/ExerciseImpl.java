package com.app.admin_1o1.trainer.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.app.admin_1o1.MultipleMongoConfig;
import com.app.admin_1o1.model.ExerciseModal;

@Repository
public class ExerciseImpl implements Exercise{

	@Autowired
	private MultipleMongoConfig mongoTemplate;

	@Override
	public List<ExerciseModal> getAllExerciseById(String userId) {
		List<ExerciseModal> result = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		try {
			result =  mongoTemplate.trainerMongoTemplate().find(query,ExerciseModal.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public Object deleteObject(String exerciseId) {
		Object result = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("exerciseId").is(exerciseId));
		try {
			result =  mongoTemplate.trainerMongoTemplate().remove(query, ExerciseModal.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public ExerciseModal getExerciseByExerciseId(String exerciseId) {
		ExerciseModal result = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("exerciseId").is(exerciseId));
		try {
			result =  mongoTemplate.trainerMongoTemplate().findOne(query, ExerciseModal.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
//	@Override
//	public ExerciseModal UpdateExercise(String exerciseId, ExerciseModal data) {
//		Query query = new Query();
//		query.addCriteria(Criteria.where("exerciseId").is(exerciseId));
//
//		Update update = new Update();
//		
//		update.set("isBasic", data.getIsBasic());
//		
//		if(data.getExerciseName() != null && !data.getExerciseName().isEmpty())
//			update.set("exerciseName", data.getExerciseName());
//
//		if(data.getWorkoutType() != null && !data.getWorkoutType().isEmpty())
//			update.set("workoutType", data.getWorkoutType());
//
//		if(data.getOtherWorkoutType() != null && !data.getOtherWorkoutType().isEmpty())
//			update.set("otherWorkoutType", data.getOtherWorkoutType());
//
//
//		if(data.getMechanicalType() != null && !data.getMechanicalType().isEmpty())
//			update.set("mechanicalType", data.getMechanicalType());
//
//		if(data.getOtherMechanicalType() != null && !data.getOtherMechanicalType().isEmpty())
//			update.set("otherMechanicalType", data.getOtherMechanicalType());
//
//		if(data.getMainMuscleWorkout() != null && !data.getMainMuscleWorkout().isEmpty())
//			update.set("mainMuscleWorkout", data.getMainMuscleWorkout());
//
//		if(data.getOtherMainMuscleWorkout() != null && !data.getOtherMainMuscleWorkout().isEmpty())
//			update.set("otherMainMuscleWorkout", data.getOtherMainMuscleWorkout());
//
//		if(data.getOtherMuscleWorkout() != null && !data.getOtherMuscleWorkout().isEmpty())
//			update.set("otherMuscleWorkout", data.getOtherMuscleWorkout());
//
//		if(data.getLevel() != null && !data.getLevel().isEmpty())
//			update.set("level", data.getLevel());
//
//		if(data.getSport() != null && !data.getSport().isEmpty())
//			update.set("sport", data.getSport());
//
//		if(data.getEquipment() != null && !data.getEquipment().isEmpty())
//			update.set("equipment", data.getEquipment());
//
//		if(data.getForce() != null && !data.getForce().isEmpty())
//			update.set("force", data.getForce());
//
//		if(data.getSetsVal() != null )
//			update.set("setsVal", data.getSetsVal());
//
//
//		if(data.getWeightsVal() != null )
//			update.set("weightsVal", data.getWeightsVal());
//
//		if(data.getRepsVal() != null)
//			update.set("repsVal", data.getRepsVal());
//
//		if(data.getRestPeriodVal() != null)
//			update.set("restPeriodVal", data.getRestPeriodVal());
//
//		if(data.getInstructions() != null && !data.getInstructions().isEmpty())
//			update.set("instructions", data.getInstructions());
//
//
//		if(data.getMp4Destination() != null && !data.getMp4Destination().isEmpty())
//			update.set("mp4Destination", data.getMp4Destination());
//
//		if(data.getThumbnailDestination() != null && !data.getThumbnailDestination().isEmpty())
//			update.set("thumbnailDestination", data.getThumbnailDestination());
//
//		if(data.getVideoName() != null && !data.getVideoName().isEmpty())
//			update.set("videoName", data.getVideoName());
//
//		if(data.getSourceUrl() != null && !data.getSourceUrl().isEmpty())
//			update.set("sourceUrl", data.getSourceUrl());
//
//		if(data.getDestVideoCheck() != null && !data.getDestVideoCheck().isEmpty())
//			update.set("destVideoCheck", data.getDestVideoCheck());
//
//		if(data.getYoutubeUrl() != null && !data.getYoutubeUrl().isEmpty())
//			update.set("youtubeUrl", data.getYoutubeUrl());
//
//		if(data.getActiveUrl() != null && !data.getActiveUrl().isEmpty())
//			update.set("activeUrl", data.getActiveUrl());
//
//		if(data.getYoutubeThumbnail() != null && !data.getYoutubeThumbnail().isEmpty())
//			update.set("youtubeThumbnail", data.getYoutubeThumbnail());
//		
//		
//		
//		
//		return mongoTemplate.findAndModify(query,  update, ExerciseModal.class);
//	}

}
