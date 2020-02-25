package com.app.admin_1o1.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.admin_1o1.model.RoleModel;

public interface RoleRepository extends MongoRepository<RoleModel, String> {

}
