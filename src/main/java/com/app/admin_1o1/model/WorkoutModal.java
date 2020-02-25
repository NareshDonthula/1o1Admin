
package com.app.admin_1o1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Workouts")
public class WorkoutModal {
	@Id
	private String fileId;
	private String workoutId;
	private String userId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	private String workoutName;
	private String customWorkoutName;
	private String workoutExercises;
	
	public String getWorkoutExercises() {
		return workoutExercises;
	}
	public void setWorkoutExercises(String workoutExercises) {
		this.workoutExercises = workoutExercises;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	
	public String getWorkoutId() {
		return workoutId;
	}
	public void setWorkoutId(String workoutId) {
		this.workoutId = workoutId;
	}
	public String getWorkoutName() {
		return workoutName;
	}
	public void setWorkoutName(String workoutName) {
		this.workoutName = workoutName;
	}
	public String getCustomWorkoutName() {
		return customWorkoutName;
	}
	public void setCustomWorkoutName(String customWorkoutName) {
		this.customWorkoutName = customWorkoutName;
	}
	
}
