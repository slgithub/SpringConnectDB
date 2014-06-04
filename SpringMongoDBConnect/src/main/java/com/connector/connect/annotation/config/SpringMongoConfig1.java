package com.connector.connect.annotation.config;

/*An alternative is to register an instance of com.mongodb.Mongo instance with the container using Spring's MongoFactoryBean. 
 * As compared to instantiating a com.mongodb.Mongo instance directly, the FactoryBean approach does not throw a checked exception and
 *  has the added advantage of also providing the container with an ExceptionTranslator implementation that translates MongoDB exceptions to exceptions 
 *  in Spring's portable DataAccessException hierarchy for data access classes annoated with the 
 * @Repository annotation. This hierarchy and use of @Repository is described in Spring's DAO support features.*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

@Configuration
public class SpringMongoConfig1 {

	public @Bean
	MongoDbFactory mongoDbFactory() throws Exception {
		return new SimpleMongoDbFactory(new MongoClient(), "TestMongoDB");
	}

	public @Bean
	MongoTemplate mongoTemplate() throws Exception {

		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());

		return mongoTemplate;

	}

}
