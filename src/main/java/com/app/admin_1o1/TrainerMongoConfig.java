package com.app.admin_1o1;
import static com.app.admin_1o1.TrainerMongoConfig.MONGO_TEMPLATE;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.app.admin_1o1.trainer.repo",
        mongoTemplateRef = MONGO_TEMPLATE)
public class TrainerMongoConfig {

    protected static final String MONGO_TEMPLATE = "trainerMongoTemplate";
}
