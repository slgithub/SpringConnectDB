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
public class DocRepresentation2Insert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBObject doc = new BasicDBObject();
		/*{"sid" : 1,"fname" : "Tom","lname" : "Ford","marks" : [ {"english" : 48}, {"maths" : 49}, {"science" : 50}]}
		{"sid" : 2,"fname" : "Tim","lname" : "Walker","marks" : [ {"english" : 35}, {"maths" : 42}, {"science" : 37}]}
		{"sid" : 3,"fname" : "John","lname" : "Ward","marks" : [ {"english" : 45}, {"maths" : 41}, {"science" : 37}]}*/
		doc.put("sid",2);
		doc.put("fname" , "john");
		doc.put("lname", "ward");		
		doc.put("marks", Arrays.asList(new BasicDBObject("english",45)
				.append("maths", 41)
				.append("science", 37)));
		
		try {
			MongoClient mclient= new MongoClient();
			DB course = mclient.getDB("course");
			DBCollection collection = course.getCollection("stdtbl");
			System.out.println(doc);
			collection.insert(doc);
			System.out.println(doc);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
