package com.connector.connect.annotation.config;

/*This approach allows you to use the standard com.mongodb.Mongo API that you may already be used to using 
 * but also pollutes the code with the UnknownHostException checked exception. 
 * The use of the checked exception is not desirable as Java based bean metadata uses methods as a means to set object dependencies,
 *  making the calling code cluttered.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
public class SpringMongoConfig extends AbstractMongoConfiguration {

	@Override
	public String getDatabaseName() {
		return "TestMongoDB";
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient("127.0.0.1");
	}
}