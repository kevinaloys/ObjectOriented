package edu.scu.oop.assign2;

/**
 *@author Kevin Aloysius 
 *@version 1.0.0
 *@category Home Appliances
 */


public class Alpha1Oven
{
	
	protected StatusType status;
	protected int cookingTemp;
	protected long cookingTimeInMinutes;
	protected OvenThermostat thermostat;
	private long startTime;
	protected boolean itemPlaced;
	
	/**
	 * Alpha1Oven() is the Constructor for which initializes the
	 * Oven Status is is power of.cooking temperature is
	 * set to 0. The cookingTimeIn minutes is set to 0.
	 * The startTime for the oven is also set initialized to 0.
	 */
	public Alpha1Oven()
	{
		status = StatusType.off;
		itemPlaced = false;
		cookingTemp = 0;
		cookingTimeInMinutes = 0;
		thermostat = new OvenThermostat();
		startTime = 0;
	}
	
	/**
	 * The turnoff() method is responsible for modifying
	 * status datamember to "off". It acts as a setter
	 * method to setting the value of status to an enumeration
	 * type which is "off".
	 */
	public void turnoff()
	{
		status = StatusType.off;
	}
	 
	/**
	 * The start() method is responsible to switching "on"
	 * or "off" the oven depending upon the temperature and
	 * time set by the setTemperature() and setTimeInMinutes()
	 */
	public void start()
	{
		if(cookingTemp > 0 && cookingTimeInMinutes > 0)
		{
			status = StatusType.on;
		}
		else
		{
			displayTempTimeError(cookingTemp, cookingTimeInMinutes);
			status = StatusType.off;
		}
	}
	
	/**
	 * The setTemperature is responsible for setting and changing the
	 * temperature of cookingTemperature. The setTemperature method 
	 * does not accept temperature value below 72 Fahrenheit.
	 * @param degrees This is a double value specifying the degree 
	 * 				  for the parameters for setTemperature()
	 */
	public void setTemperature(double degrees)
	{
		if(degrees <= 72)
		{
			System.out.println("Cooking Temperature cannot be below 72\u00b0F");
		}
		else
		{
			thermostat.setTemperatureInF((int)degrees);
			cookingTemp = thermostat.getTemperatureInF();
		}
	}
	
	/**The setTime() is responsible for setting and changing the
	 * time of cookingTimeInMinutes and startTime. The setTime()
	 * method does not accept a negative time value.
	 * @param cookingTime This is a integer value specifying the time
	 * 					  to be set for setTime()
	 */
	public void setTime(int cookingTime)
	{
		if (cookingTime <= 0)
		{
			cookingTimeInMinutes = 0;
			startTime = 0;
		}
		else
		{
			cookingTimeInMinutes = cookingTime;
			startTime = System.currentTimeMillis();
		}
	}
	
	/**
	 * The placefood() method is a setter method which
	 * is responsible for changing the value of the
	 * itemPlaced data member to "true"
	 */
	public void placeFood()
	{
		itemPlaced = true;
	}
	
	/**
	 * The clear() method is responsible for resetting
	 * the values of the datamembers for the oven
	 * to it's default values.
	 */
	public void clear()
	{
		status = StatusType.off;
		itemPlaced = false;
		cookingTemp = 0;
		cookingTimeInMinutes = 0;
		startTime = 0;
	}
	
	/**
	 * The showOvenStatus() method is responsible for
	 * displaying the current status of the oven.
	 * The current values of the Oven's data members can
	 * be observed using showOvenStaus()
	 * Some of the information displayed through the
	 * showOvenStatus() method include the oven name,
	 * oven status : on/off, start time, the set temperature,
	 * and stop time.
	 */
	public void showOvenStatus()
	{
		
		System.out.println("Oven Name       	 : " + getOvenName());
		System.out.println("Oven Status     	 : " + status);
		System.out.println("Start Time      	 : " + displayTimeInHumanReadable(startTime));
		System.out.println("Set Temperature in F 	 : " + thermostat.getTemperatureInF() + "\u00b0" +"F");
		long stopTimeInMillis = ((long)cookingTimeInMinutes * 60 * 1000) + startTime;
		System.out.println("Stop Time       	 : " + displayTimeInHumanReadable(stopTimeInMillis));
	}
	
	/**
	 * The getOvenName() obtains the name of
	 * the current oven you are working with,
	 * whether it is the Regular Alpha1Oven
	 * or the Smart Alpha2Oven.
	 * @return
	 */
	private String getOvenName()
	{
		return this.getClass().getSimpleName();
	}
	
	/**
	 * The displayTempTimeError() takes in the temperature
	 * and time as the parameters. Depending on the current
	 * status of the temperature and time the displayTempTimeError
	 * while produce the output accordingly.
	 * @param temp An integer specifying temperature as the parameter
	 * 			   for checking the boundary conditions.
	 * @param time An integer specifying time as the parameter
	 *             for checking the boundary conditions.
	 */
	private static void displayTempTimeError(int temp, long time)
	{
		if (temp == 0 && time == 0)
		{
			System.out.println("Coooking Time and Cooking Temperature are not set!");
		}
		else if(temp == 0)
		{
			System.out.println("Cooking Temperature is not set!");
		}
		else if (time == 0)
		{
			System.out.println("Cooking Time is not set!");
		}
	}
	
	/**
	 * The displayTimeInHumanReadable() method takes in milliseconds
	 * and returns a String giving the hours, minutes and seconds.
	 * @param millisec A long datatype specifying the time in milliseconds
	 * @return String Returns a string of hours, minutes and seconds.
	 */
	private static String displayTimeInHumanReadable(long millisec)
	{
		String time = new String();
		int seconds = (int) ((millisec % (1000 * 60 * 60)) % (1000 * 60)) / 1000;
		int minutes = (int) (millisec % (1000 * 60 * 60)) / (1000 * 60);
		int hours	= (int) ((millisec / (1000 * 60 * 60) ) % 24);
		time = hours + " hours " + minutes + " mintues " + seconds + " seconds";
		return time;
	}
}