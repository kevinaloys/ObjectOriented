import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 * 
 * @author Kevin Aloysius
 * 
 */
public class Driver {
	private DB db;
	private DBCollection col;
	String month[] = {"January", "February", "March", "April",
			"May", "June", "July", "August", "September", "October",
			"November", "December"};
	public String currentMonth = month[11];
	
	//Constructors to Connect to MongoDB
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
	
	
	/**
	 * Increments the Expenses Document(MongoDB) by the said amount.
	 * @param userid Unique ID of the Campus Cafe User.
	 * @param amount Amount that needs to be added to the fund.
	 * @return
	 */
	public boolean incFund(int userid, int amount)
	{
		
		col = db.getCollection("user");
		//Funds increment
		
		BasicDBObject query = new BasicDBObject("id", userid);
		BasicDBObject dbobject = new BasicDBObject()
		.append("$inc", new BasicDBObject("expenses." + currentMonth, amount));
		col.update(query, dbobject);
		return true;
		
		
	}
	
	
	/**
	 * Decrements the Expenses Document(MongoDB) by the said amount.
	 * @param userid Unique ID of the Campus Cafe User.
	 * @param amount Amount that needs to be reduced from the fund.
	 * @return
	 */
	public boolean decFund(int userid, int amount)
	{
		col = db.getCollection("user");
		BasicDBObject getcurrent = new BasicDBObject("id", userid);
		DBObject obj = col.findOne(getcurrent);
		String current = ((DBObject)obj.get("expenses")).get(currentMonth).toString();
		double newamount;
		newamount = Double.parseDouble(current);
		newamount = newamount - amount;
		
		if(newamount <= 0)
		{
			return false;
		}
		else
		{
			col = db.getCollection("user");
			BasicDBObject query = new BasicDBObject("id", userid);
			BasicDBObject dbobject = new BasicDBObject()
			.append("$inc", new BasicDBObject("expenses." + currentMonth, (amount * -1)));
			col.update(query, dbobject);
			return true;
		}
		
	}
	
	/**
	 * Increments the Calories in the Document(MongoDB) by the said calories.
	 * @param userid Unique ID of the Campus Cafe User.
	 * @param calories Caloric Value that needs to be incremented
	 * @return
	 */
	public boolean incCalories(int userid, int calories)
	{
		col = db.getCollection("user");
		BasicDBObject query = new BasicDBObject("id", userid);
		BasicDBObject dbobject = new BasicDBObject()
		.append("$inc", new BasicDBObject("calories." + currentMonth, calories));
		col.update(query, dbobject);
		return true;
	}
	
	public void setSpecialNeed(String need)
	{
		
	}
	
	public void addCaloriePerDay(int userid, int calories)
	{
		
	}
}

