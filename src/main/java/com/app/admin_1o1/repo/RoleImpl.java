package com.app.admin_1o1.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.app.admin_1o1.MultipleMongoConfig;
import com.app.admin_1o1.model.RoleModel;


@Repository
public class RoleImpl implements Role{
	@Autowired
	private MultipleMongoConfig mongoTemplate;

	@Override
	public RoleModel updateRole(RoleModel role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoleModel getRole(String roleId) {
		RoleModel result = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("roleId").is(roleId));
		try {
			result = mongoTemplate.userMongoTemplate().findOne(query, RoleModel.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	} 

}
