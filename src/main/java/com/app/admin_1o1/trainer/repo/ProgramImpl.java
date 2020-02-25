package com.app.admin_1o1.trainer.repo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.app.admin_1o1.MultipleMongoConfig;
import com.app.admin_1o1.model.ProgramModel;
import com.app.admin_1o1.model.TrainerModel;


@Repository
public class ProgramImpl implements Program {
	@Autowired
	private MultipleMongoConfig mongoTemplate;

	@Override
	public List<ProgramModel> getAllProgramsById(String userId) {
		List<ProgramModel> result = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		try {
			result = mongoTemplate.trainerMongoTemplate().find(query,ProgramModel.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void updateProgram(ProgramModel model) {
		Query query = new Query();
		//query.addCriteria(Criteria.where("userId").is(model.getUserId()));
		query.addCriteria(Criteria.where("programId").is(model.getProgramId()));
		Update update = new Update();
		update.set("adminStatus", model.getAdminStatus());
		try {
			mongoTemplate.trainerMongoTemplate().findAndModify(query, update, ProgramModel.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ProgramModel getProgramByProgramId(String programId) {
		ProgramModel result = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("programId").is(programId));
		try {
			result = mongoTemplate.trainerMongoTemplate().findOne(query, ProgramModel.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	/*
	 * @Override public ProgramModel getProgramByProgramId(String programId) { Query
	 * query = new Query();
	 * query.addCriteria(Criteria.where("programId").is(programId)); return
	 * mongoTemplate.findOne(query, ProgramModel.class); }
	 * 
	 * @Override public ProgramModel UpdateMyprogram(String programId, ProgramModel
	 * data) { Query query = new Query();
	 * query.addCriteria(Criteria.where("programId").is(programId));
	 * 
	 * Update update = new Update();
	 * 
	 * if(data.getStatus() != null) update.set("status", data.getStatus());
	 * 
	 * if(data.getProgramName() != null && !data.getProgramName().isEmpty())
	 * update.set("programName", data.getProgramName());
	 * 
	 * if(data.getPlans() != null) update.set("plans", data.getPlans());
	 * 
	 * if(data.getWeeks() != null) update.set("weeks", data.getWeeks());
	 * 
	 * if(data.getProgramDuration() != null && !data.getProgramDuration().isEmpty())
	 * update.set("programDuration", data.getProgramDuration());
	 * 
	 * update.set("price", data.getPrice());
	 * 
	 * if(data.getNutrition() != null && !data.getNutrition().isEmpty())
	 * update.set("nutrition", data.getNutrition());
	 * 
	 * if(data.getPackageType() != null && !data.getPackageType().isEmpty())
	 * update.set("packageType", data.getPackageType());
	 * 
	 * if(data.getProgramImg() != null && !data.getProgramImg().isEmpty())
	 * update.set("programImg", data.getProgramImg());
	 * 
	 * if(data.getImgPath() != null && !data.getImgPath().isEmpty())
	 * update.set("imgPath", data.getImgPath());
	 * 
	 * if(data.getDescription() != null && !data.getDescription().isEmpty())
	 * update.set("description", data.getDescription());
	 * 
	 * if(data.getCurrency() != null && data.getCurrency().length !=0)
	 * update.set("currency", data.getCurrency()); return
	 * mongoTemplate.findAndModify(query, update, ProgramModel.class);
	 * 
	 * }
	 */

}
