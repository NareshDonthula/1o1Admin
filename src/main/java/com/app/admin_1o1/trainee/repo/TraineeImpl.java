package com.app.admin_1o1.trainee.repo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.admin_1o1.MultipleMongoConfig;
import com.app.admin_1o1.model.TraineeModal;

@Repository
public class TraineeImpl implements Trainee{
	@Autowired
	private MultipleMongoConfig mongoTemplate;
	@Override
	public List<TraineeModal> getTrainees() {
		 List<TraineeModal> result=  null;
		try {
			result = mongoTemplate.traineeMongoTemplate().findAll(TraineeModal.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
