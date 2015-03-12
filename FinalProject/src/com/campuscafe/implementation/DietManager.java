package com.campuscafe.implementation;

/**
 * 
 * @author Kevin Aloysius
 *
 */
public class DietManager {
	private Driver driver = new Driver();
	
	//UserOptio => yes/""
	public boolean incCalories(int userid, int calories, String useroption)
	{
		boolean result = false;
		if(useroption == "")
		{
			int consumedcalories = driver.getConsumedCalories(userid);
			int calorieperday = Integer.parseInt(driver.getCaloriePerDay(userid));
			
			if(calories + consumedcalories > calorieperday)
			{
				result = false;
			}
			else
			{
				result = true;
			}
		}
		if(useroption == "yes")
		{
			driver.incCalories(userid, calories);
			result = true;
		}
		
		
		return result;
	}
		
}
