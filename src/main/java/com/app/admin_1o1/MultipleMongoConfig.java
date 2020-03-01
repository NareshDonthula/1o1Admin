package com.app.admin_1o1;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(MultipleMongoProperties.class)
public class MultipleMongoConfig {

	private final MultipleMongoProperties multipleMongoProperties;

	@Primary
	@Bean(name = "userMongoTemplate")
	public MongoTemplate userMongoTemplate() throws Exception {
		return new MongoTemplate(primaryFactory(this.multipleMongoProperties.getUser()));
	}

	@Bean(name = "trainerMongoTemplate")
	public MongoTemplate trainerMongoTemplate() throws Exception {
		return new MongoTemplate(secondaryFactory(this.multipleMongoProperties.getTrainer()));
	}
	
	@Bean(name = "traineeMongoTemplate")
	public MongoTemplate traineeMongoTemplate() throws Exception {
		return new MongoTemplate(traineeFactory(this.multipleMongoProperties.getTrainee()));
	}

	@Bean
	@Primary
	public MongoDbFactory primaryFactory(final MongoProperties mongo) throws Exception {
		return new SimpleMongoDbFactory(new MongoClient(mongo.getHost(), mongo.getPort()), mongo.getDatabase());
	}

	@Bean
	public MongoDbFactory secondaryFactory(final MongoProperties mongo) throws Exception {
		return new SimpleMongoDbFactory(new MongoClient(mongo.getHost(), mongo.getPort()), mongo.getDatabase());
	}
	
	@Bean
	public MongoDbFactory traineeFactory(final MongoProperties mongo) throws Exception {
		return new SimpleMongoDbFactory(new MongoClient(mongo.getHost(), mongo.getPort()), mongo.getDatabase());
	}
	
}
