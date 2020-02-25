package com.app.admin_1o1.trainer.repo;
import java.util.List;
import com.app.admin_1o1.model.TrainerModel;


public interface Trainer {
	TrainerModel getByUserName(String userId);
	List<TrainerModel> getAllTrainers(String Ids);
	List<TrainerModel> getLimitedFields();
	void updateTrainer(TrainerModel model);
}
