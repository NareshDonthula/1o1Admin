package com.app.admin_1o1;

import static com.app.admin_1o1.TraineeMongoConfig.MONGO_TEMPLATE;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration                           
@EnableMongoRepositories(basePackages = "com.app.admin_1o1.trainee.repo",
        mongoTemplateRef = MONGO_TEMPLATE)
public class TraineeMongoConfig {
	 protected static final String MONGO_TEMPLATE = "traineeMongoTemplate";
}
