package com.connector.connect.test;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.QueryBuilder;

public class MongoQueryTest3 {
	
	public static void main(String[] args) {
		
		DBCursor cur=null;
		try {
			
			MongoClient mclient= new MongoClient();
			DB course = mclient.getDB("test");
			DBCollection collection = course.getCollection("scores");
			System.out.println("Using QueryBuilder");
			DBObject query = new QueryBuilder()
			         .start()
			         .and(new QueryBuilder().start().put("type").is("exam").get(),
			             new QueryBuilder().start().put("score")
			                 .greaterThan(90).get(),new QueryBuilder().start().put("score").lessThan(98).get()).get();
		    System.out.println("Count:::\n");
		    System.out.println(collection.count(query));
		    System.out.println("FindALL\n");
			cur = collection.find(query,new BasicDBObject("_id",false)).sort(new BasicDBObject("score",-1).append("student", 1)).skip(6);
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


