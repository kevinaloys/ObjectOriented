import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/**
 * 
 * @author Kevin Aloysius
 *
 */
public class Driver {
	private DB db;
	private DBCollection col;
	Driver()
	{	
		try
		{
			db = (new MongoClient("localhost", 27017)).getDB("campuscafeinc");
	
		}
		catch(UnknownHostException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void insert(BasicDBObject object, String collection)
	{
		DBCollection col = db.getCollection(collection);
		col.insert(object);
	}
	
	
	public void incFund(String userid, String amount)
	{
		
	}
	
	public void decFund(String userid, String amount)
	{
		
	}
	
	public void incCalories(String userid, String calories)
	{
		
	}
	
	public void setSpecialNeeds(String needs)
	{
		
	}
	
	public void addBoundaryCalories(String userid, String calories)
	{
		
	}
}

