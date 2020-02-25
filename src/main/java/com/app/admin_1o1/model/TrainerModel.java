package com.app.admin_1o1.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "TrainerProfile")
public class TrainerModel {

	@Id
	private String fileId;
	private String gender;
	private String category;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String country;
	private String pincode;
	private String websiteUrl;
	private String facebookId;
	private String twitterId;
	private String instagramId;
	private String trainingSince;
	private String servicesOffered;
	private String about;
	private String certification;
	private String achievements;
	private String imgName;
	private String imgPath;
	private String mp4Destination;
	private String thumbnailDestination;
	private String certificateUrl;
	private String uploadedCertificate;
	private String videoName;
	private String sourceUrl;
	private String userName;
	private String userId;
    private String destVideoCheck;
    private String profileStatus;
    private String adminStatus;
    private String registraionType;
    private String isNutritionist;
  
}

