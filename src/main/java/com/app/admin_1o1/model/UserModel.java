package com.app.admin_1o1.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "users")
@Data
public class UserModel {
	private String userId;
	private String name;
	private String email;
	private String password;
	private String roleId;
}
