import java.net.UnknownHostException;
import java.util.Random;
import javafx.application.Application;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.campuscafe.chart.*;
/**
 * 
 * @author Kevin Aloysius
 *
 */

public class Main {
	public static void main(String[] args) throws UnknownHostException
	{
		
		Driver driver = new Driver();
		
		DB db = (new MongoClient("localhost", 27017)).getDB("campuscafeinc");
		
		BasicDBObject query = new BasicDBObject("id", 1);
		driver.decFund(1, 10);
		
		
	}
}
