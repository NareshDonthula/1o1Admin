package com.app.admin_1o1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document(collection = "trainee")
public class TraineeModal {
	@Id
	private String id;
	private String lastName;
	private String email;
	private String gender;
	private int age;
	private double weight;
	private String height;
	private String activityLevel;
	private String primaryGoal;
	private String routineFocusedOn;
	private String workoutRoutineIndays;
	private String workoutTime;
	private String foodAllergies;
	private Object[] days;
	private Object detaryHabbits;  
	private String typesOfMeats;
	private Object alcohal;
	private boolean workoutHistory;
	private String firstName;
	private String mobile;
	private String image_url;
}
