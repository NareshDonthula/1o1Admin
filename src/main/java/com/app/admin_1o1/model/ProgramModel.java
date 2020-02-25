package com.app.admin_1o1.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document(collection = "MyPrograms")
public class ProgramModel {
	@Id
	private String fileId;
	private String programName;
	private Integer plans;
	private Integer weeks;	
	private String programDuration;
	private float price;
	private String nutrition;
	private Object[] currency;
	private String packageType;
	private Date date;
	private String description;
	private String userId;
	private String programId;
	private String programImg;
	private String imgPath;
	private String status;
	private String adminStatus;
}
