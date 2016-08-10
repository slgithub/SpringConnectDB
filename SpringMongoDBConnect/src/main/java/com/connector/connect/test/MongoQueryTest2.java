package com.connector.connect.test;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.QueryBuilder;

public class MongoQueryTest2 {
	
	public static void main(String[] args) {
		
		DBCursor cur=null;
		try {
			
			MongoClient mclient= new MongoClient();
			DB course = mclient.getDB("course");
			DBCollection collection = course.getCollection("stdtbl");
			System.out.println("Using QueryBuilder");
			DBObject query = new QueryBuilder()
			         .start()
			         .and(new QueryBuilder().start().put("lname").is("Ford").get(),
			             new QueryBuilder().start().put("marks.english")
			                 .greaterThan(35).get()).get();
		    System.out.println("Count:::\n");
		    System.out.println(collection.count(query));
		    System.out.println("FindALL\n");
			cur = collection.find(query);
			while(cur.hasNext()){
				System.out.println(cur.next());
				
			}
		    
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(cur!=null)
			cur.close();
		}
	}
}


