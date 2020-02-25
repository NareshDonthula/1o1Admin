package com.app.admin_1o1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Calender")
public class CalenderModal {
	@Id
	private String fileId;
	private String programId;
	private String userId;
	private String days;
	private String calenderId;
	
	public String getCalenderId() {
		return calenderId;
	}
	public void setCalenderId(String calenderId) {
		this.calenderId = calenderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getProgramId() {
		return programId;
	}
	public void setProgramId(String programId) {
		this.programId = programId;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
}
