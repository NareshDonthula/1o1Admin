package com.app.admin_1o1.repo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.app.admin_1o1.model.RoleModel;
import com.app.admin_1o1.model.UserModel;
import com.app.admin_1o1.MultipleMongoConfig;

@Repository
public class UserImpl implements User {

	@Autowired
	private MultipleMongoConfig mongoTemplate; 

	@Override
	public UserModel getUser(UserModel user) {
		UserModel result = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(user.getEmail()));
		query.addCriteria(Criteria.where("password").is(user.getPassword()));
		try {
			result = mongoTemplate.userMongoTemplate().findOne(query, UserModel.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<UserModel> getUsersByRoleId(String roleId) {
		List<UserModel>  result = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("roleId").is(roleId));
		try {
			result = mongoTemplate.userMongoTemplate().find(query, UserModel.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public UserModel checkUser(String mailId) {
		UserModel result = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(mailId));
		try {
			result = mongoTemplate.userMongoTemplate().findOne(query, UserModel.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public UserModel updateUser(UserModel userModel) {
		UserModel result = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(userModel.getEmail()));
		Update update = new Update();
		update.set("password", userModel.getPassword());
		try {
			result = mongoTemplate.userMongoTemplate().findAndModify(query, update, UserModel.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
