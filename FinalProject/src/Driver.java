import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 * 
 * @author Kevin Aloysius, Santa Clara University
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
		//Set collection to user collection.
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
	
	
	
	/**
	 * Sets additional dietary requirements for the Campus Card User.
	 * @param userid Unique ID of the Campus Cafe User.
	 * @param need Specifies the dietary need.
	 * @return
	 */
	public boolean setSpecialNeed(int userid, String need)
	{
		col = db.getCollection("user");
		BasicDBObject query = new BasicDBObject("id", userid);
		BasicDBObject dbobject = new BasicDBObject()
		.append("$push", new BasicDBObject("diet", need));
		col.update(query, dbobject);
		return true;
	}
	
	/**
	 * Sets the minimum caloric intake per day
	 * @param userid Unique ID of the Campus Cafe User.
	 * @param calories Specifies the minimum caloric intake per day.
	 * @return
	 */
	public boolean addCaloriePerDay(int userid, int calories)
	{
		col = db.getCollection("user");
		BasicDBObject query = new BasicDBObject("id", userid);
		BasicDBObject dbobject = new BasicDBObject()
		.append("$set", new BasicDBObject("calorieperday", calories));
		col.update(query, dbobject);
		return true;
	}
}

