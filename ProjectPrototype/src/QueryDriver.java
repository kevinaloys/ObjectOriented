import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;


public class QueryDriver {
	public static void main(String args[])throws UnknownHostException
	{
		DB db = (new MongoClient("localhost", 27017)).getDB("campusdining");
		DBCollection col  = db.getCollection("user");
		BasicDBObject dbObject = new BasicDBObject();
		dbObject.put("name", "Kevin");
		DBCursor dbCursor = col.find(dbObject);
		while(dbCursor.hasNext())
		{
			System.out.println(dbCursor.next());
		}
	}
}
