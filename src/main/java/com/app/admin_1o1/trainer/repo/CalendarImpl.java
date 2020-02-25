package com.app.admin_1o1.trainer.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.app.admin_1o1.MultipleMongoConfig;
import com.app.admin_1o1.model.CalenderModal;

@Repository
public class CalendarImpl implements Calendar{
	
	@Autowired
	private MultipleMongoConfig mongoTemplate;

	@Override
	public CalenderModal getDataByProgramId(String programId) {
		CalenderModal result = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("programId").is(programId));
		try {
			result =  mongoTemplate.trainerMongoTemplate().findOne(query, CalenderModal.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
