/**
 * 
 */
package com.connector.connect.test;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 * @author su828791
 *
 */
public class DocRepresentation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBObject doc = new BasicDBObject();
		doc.put("userName", "Jerick");
		doc.put("DOB", new Date(34299980));
		doc.put("programer",true);
		doc.put("age", 8);
		doc.put("languages", Arrays.asList("C++","JAVA"));
		doc.put("address", new BasicDBObject("street","2nd Cross")
				.append("town", "ELECTRONIC CITY")
				.append("zip", 560100));
		
		try {
			MongoClient mclient= new MongoClient();
			DB course = mclient.getDB("course");
			DBCollection collection = course.getCollection("insertTest");
			System.out.println(doc);
			collection.insert(doc);
			System.out.println(doc);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
