import com.mongodb.BasicDBObject;
/**
 * 
 * @author Kevin Aloysius
 *
 */
//MongoDB DataBase Testing.
public class Main {
	public static void main(String args[])
	{
		Driver driver = new Driver();
		BasicDBObject dbObject = new BasicDBObject("name", "Larry Page").append("Works At","Google");
		driver.insert(dbObject, "user");
		driver.query("Works At", "Google", "user");
	}
}
