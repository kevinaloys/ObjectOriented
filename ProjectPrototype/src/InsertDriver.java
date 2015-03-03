import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class InsertDriver {
	
	public static void main(String args[]) throws UnknownHostException
	{
		DB db = (new MongoClient("localhost", 27017)).getDB("campusdining");
		DBCollection col  = db.getCollection("user");
		BasicDBObject dbObject = new BasicDBObject("name","Kevin")
		.append("age", "22")
		.append("degree", new BasicDBObject("Bachelor", "Computer Science").append("Masters", "Hacking"))
		.append("works", "Google");
		col.insert(dbObject);
	}
}
