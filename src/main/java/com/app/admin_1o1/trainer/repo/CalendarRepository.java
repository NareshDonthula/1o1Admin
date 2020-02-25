package com.app.admin_1o1.trainer.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.admin_1o1.model.CalenderModal;

public interface CalendarRepository extends MongoRepository<CalenderModal, String> {

}
