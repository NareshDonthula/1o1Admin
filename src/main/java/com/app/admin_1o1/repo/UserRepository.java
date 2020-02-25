package com.app.admin_1o1.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.admin_1o1.model.UserModel;


public interface UserRepository extends MongoRepository<UserModel, String> {

}