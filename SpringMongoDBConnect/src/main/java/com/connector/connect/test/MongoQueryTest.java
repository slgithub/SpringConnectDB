package com.connector.connect.test;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class MongoQueryTest {
	
	public static void main(String[] args) {
		/*QueryBuilder qbuilder = new QueryBuilder();
		qbuilder.start("score").is("70")*/;
		DBCursor cur=null;
		try {
			/*MongoClient mclient= new MongoClient();
			DB course = mclient.getDB("test");
			DBCollection collection = course.getCollection("scores");
			System.out.println("---test--"+qbuilder.get().toMap().toString());
			
			System.out.println("Count:::\n");
			collection.count(qbuilder.get());
			System.out.println("FindALL\n");
			cur = collection.find(qbuilder.get());
			while(cur.hasNext()){
				//System.out.println(cur.next());
				
			}*/
			MongoClient mclient= new MongoClient();
			DB course = mclient.getDB("course");
			DBCollection collection = course.getCollection("stdtbl");
			DBObject query = new BasicDBObject();
		    List<BasicDBObject> andQuery = new ArrayList<BasicDBObject>();
		    andQuery.add(new BasicDBObject("lname", "Ford"));
		    andQuery.add(new BasicDBObject("marks.english", new BasicDBObject("$gt", 35)));
		    query.put("$and", andQuery); 
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


