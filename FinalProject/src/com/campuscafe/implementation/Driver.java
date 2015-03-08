package com.campuscafe.implementation;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 * 
 * @author Kevin Aloysius, Santa Clara University
 * 
 */
public class Driver {
	public DB db;
	public DBCollection col;
	String months[] = {"January", "February", "March", "April",
			"May", "June", "July", "August", "September", "October",
			"November", "December"};
	public String currentMonth = months[11];
	
	//Constructors to Connect to MongoDB
	public Driver()
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
	
	/**
	 * Gets the minimum caloric intake per day
	 * @param userid Unique ID of the Campus Cafe User.
	 * @return String specifying the current caloric intake of user per day.
	 */
	public String getCaloriePerDay(int userid)
	{
		col = db.getCollection("user");
		BasicDBObject getcurrent = new BasicDBObject("id", userid);
		DBObject obj = col.findOne(getcurrent);
		String calorieperday = obj.get("calorieperday").toString();
		return calorieperday;
	}
	
	/**
	 * Gets the the Expiry Year of the Campus User Card.
	 * @param userid Unique ID of the Campus Cafe User.
	 * @return Expiry Year of the Campus Card.
	 */
	public int getCardExpiry(int userid)
	{
		col = db.getCollection("user");
		BasicDBObject getcurrent = new BasicDBObject("id", userid);
		DBObject obj = col.findOne(getcurrent);
		Double cardexpiry = (Double) obj.get("cardexpiry");
		int card = cardexpiry.intValue();
		return card;
	}
	
	/**
	 * Gets the age of the Campus Card User.
	 * @param userid Unique ID of the Campus Cafe User.
	 * @return Age of the Campus Card User.
	 */
	public int getAge(int userid)
	{
		col = db.getCollection("user");
		BasicDBObject getcurrent = new BasicDBObject("id", userid);
		DBObject obj = col.findOne(getcurrent);
		Double userage = (Double) obj.get("age");
		int age = userage.intValue();
		return age;
	}
	
	public HashMap<String, Integer> getExpensesDataForGraph(int userid)
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		col = db.getCollection("user");
		BasicDBObject getcurrent = new BasicDBObject("id", userid);
		DBObject obj = col.findOne(getcurrent);
		for(String month : months)
		{
			Double expenses = (Double)((DBObject)obj.get("expenses")).get(month);
			int expense = expenses.intValue();
			map.put(month, expense);	
		}
		
		return map;
	}
	
	public HashMap<String, Integer> getCaloriesDataForGraph(int userid)
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		col = db.getCollection("user");
		BasicDBObject getcurrent = new BasicDBObject("id", userid);
		DBObject obj = col.findOne(getcurrent);
		for(String month : months)
		{
			Double calories = (Double)((DBObject)obj.get("calories")).get(month);
			int calorie = calories.intValue();
			map.put(month, calorie);
			System.out.println(calorie);
		}
		
		return map;
	}
	
}

