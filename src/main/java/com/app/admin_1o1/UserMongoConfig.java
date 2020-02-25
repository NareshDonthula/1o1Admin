package com.app.admin_1o1;

import static com.app.admin_1o1.UserMongoConfig.MONGO_TEMPLATE;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.app.admin_1o1.repo",
        mongoTemplateRef = MONGO_TEMPLATE)
public class UserMongoConfig {

    protected static final String MONGO_TEMPLATE = "userMongoTemplate";
}
