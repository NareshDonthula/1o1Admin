package com.app.admin_1o1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "userRoles")
public class RoleModel {
	@Id
	private String roleId;
	private String roleName;
	private String roleDescription;
	private Object roleModules;
	private String createdBy;
}
