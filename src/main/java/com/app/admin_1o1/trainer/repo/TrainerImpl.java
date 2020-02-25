package com.app.admin_1o1.trainer.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import com.app.admin_1o1.MultipleMongoConfig;
import com.app.admin_1o1.model.TrainerModel;

@Repository
public class TrainerImpl implements Trainer {

	@Autowired
	private MultipleMongoConfig mongoTemplate;

	@Override
	public TrainerModel getByUserName(String userId) {
		TrainerModel result = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("userName").is(userId));
		try {
			result = mongoTemplate.trainerMongoTemplate().findOne(query, TrainerModel.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<TrainerModel> getAllTrainers(String Ids) {
		List<TrainerModel> resultlist = null;
		String[] array = Ids.split(",");
		List<String> list = new ArrayList<String>(Arrays.asList(array));
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").in(list));
		try {
			resultlist = mongoTemplate.trainerMongoTemplate().find(query, TrainerModel.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultlist;
	}

	@Override
	public List<TrainerModel> getLimitedFields() {
		List<TrainerModel> resultlist = null;
		Query query = new Query();
		query.fields().include("userId");
		query.fields().include("imgPath");
		query.fields().include("firstName");
		query.fields().include("lastName");
		query.fields().include("mp4Destination");
		query.fields().include("thumbnailDestination");
		query.fields().include("city");
		query.fields().include("category");
		try {
			resultlist = mongoTemplate.trainerMongoTemplate().find(query, TrainerModel.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultlist;
	}

	@Override
	public void updateTrainer(TrainerModel model) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(model.getUserId()));
		Update update = new Update();
		update.set("adminStatus", model.getAdminStatus());
		try {
			mongoTemplate.trainerMongoTemplate().findAndModify(query, update, TrainerModel.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
