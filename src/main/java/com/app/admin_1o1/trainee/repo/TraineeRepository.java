package com.app.admin_1o1.trainee.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.app.admin_1o1.model.TraineeModal;


public interface TraineeRepository extends MongoRepository<TraineeModal, String>{

}
