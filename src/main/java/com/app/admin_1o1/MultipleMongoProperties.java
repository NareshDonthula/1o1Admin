package com.app.admin_1o1;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "mongodb")
public class MultipleMongoProperties {
    private MongoProperties user = new MongoProperties();
	private MongoProperties trainer = new MongoProperties();
	private MongoProperties trainee = new MongoProperties();
}
