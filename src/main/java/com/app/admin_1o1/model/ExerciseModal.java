package com.app.admin_1o1.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ExerciseVideos")
public class ExerciseModal {
	@Id
	private String fileId;
	private String exerciseName;
	private String otherWorkoutType;
	private String workoutType;
	private String mechanicalType;
	private String otherMechanicalType;
	private String mainMuscleWorkout;
	private String otherMainMuscleWorkout;
	private String otherMuscleWorkout;
	private String level;
	private String sport;
	private String equipment;
	private String force;
	private Integer setsVal;
	private Integer weightsVal;
	private Integer repsVal;
	private Integer restPeriodVal;
	private String instructions;
	private String mp4Destination;
	private String thumbnailDestination;
	private String videoName;
	private String sourceUrl;
	private String youtubeUrl;
	private String userId;
	private String destVideoCheck;
	private String exerciseId;
	private String activeUrl;
	private String youtubeThumbnail;
	private boolean isBasic;
	
    public boolean getIsBasic() {
		return isBasic;
	}

	public void setIsBasic(boolean isBasic) {
		this.isBasic = isBasic;
	}


	public String getActiveUrl() {
		return activeUrl;
	}

	public void setActiveUrl(String activeUrl) {
		this.activeUrl = activeUrl;
	}

	private Date creationDate = new Date();
	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getExerciseName() {
		return exerciseName;
	}

	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}

	public String getOtherWorkoutType() {
		return otherWorkoutType;
	}

	public void setOtherWorkoutType(String otherWorkoutType) {
		this.otherWorkoutType = otherWorkoutType;
	}

	public String getWorkoutType() {
		return workoutType;
	}

	public void setWorkoutType(String workoutType) {
		this.workoutType = workoutType;
	}

	public String getMechanicalType() {
		return mechanicalType;
	}

	public void setMechanicalType(String mechanicalType) {
		this.mechanicalType = mechanicalType;
	}
	public String getOtherMechanicalType() {
		return otherMechanicalType;
	}

	public void setOtherMechanicalType(String otherMechanicalType) {
		this.otherMechanicalType = otherMechanicalType;
	}
	public String getMainMuscleWorkout() {
		return mainMuscleWorkout;
	}

	public void setMainMuscleWorkout(String mainMuscleWorkout) {
		this.mainMuscleWorkout = mainMuscleWorkout;
	}

	public String getOtherMainMuscleWorkout() {
		return otherMainMuscleWorkout;
	}

	public void setOtherMainMuscleWorkout(String otherMainMuscleWorkout) {
		this.otherMainMuscleWorkout = otherMainMuscleWorkout;
	}


	public String getOtherMuscleWorkout() {
		return otherMuscleWorkout;
	}

	public void setOtherMuscleWorkout(String otherMuscleWorkout) {
		this.otherMuscleWorkout = otherMuscleWorkout;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getForce() {
		return force;
	}

	public void setForce(String force) {
		this.force = force;
	}

	public Integer  getSetsVal() {
		return setsVal;
	}

	public void setSetsVal(Integer  setsVal) {
		this.setsVal = setsVal;
	}
	public Integer getWeightsVal() {
		return weightsVal;
	}

	public void setWeightsVal(Integer weightsVal) {
		this.weightsVal = weightsVal;
	}
	public Integer  getRepsVal() {
		return repsVal;
	}

	public void setRepsVal(Integer  repsVal) {
		this.repsVal = repsVal;
	}

	public Integer  getRestPeriodVal() {
		return restPeriodVal;
	}

	public void setRestPeriodVal(Integer  restPeriodVal) {
		this.restPeriodVal = restPeriodVal;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getMp4Destination() {
		return mp4Destination;
	}

	public void setMp4Destination(String mp4Destination) {
		this.mp4Destination = mp4Destination;
	}

	public String getThumbnailDestination() {
		return thumbnailDestination;
	}

	public void setThumbnailDestination(String thumbnailDestination) {
		this.thumbnailDestination = thumbnailDestination;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getDestVideoCheck() {
		return destVideoCheck;
	}

	public void setDestVideoCheck(String destVideoCheck) {
		this.destVideoCheck = destVideoCheck;
	}
	public String getYoutubeUrl() {
		return youtubeUrl;
	}

	public void setYoutubeUrl(String youtubeUrl) {
		this.youtubeUrl = youtubeUrl;
	}
	public String getExerciseId() {
		return exerciseId;
	}
	public void setExerciseId(String exerciseId) {
		this.exerciseId = exerciseId;
	}
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getYoutubeThumbnail() {
		return youtubeThumbnail;
	}

	public void setYoutubeThumbnail(String youtubeThumbnail) {
		this.youtubeThumbnail = youtubeThumbnail;
	}

}
