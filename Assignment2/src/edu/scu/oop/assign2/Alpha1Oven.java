package edu.scu.oop.assign2;
/**
 *@author Kevin Aloysius 
 *
 */

public class Alpha1Oven
{
	
	protected StatusType status;
	protected int cookingTemp;
	protected long cookingTimeInMinutes;
	protected OvenThermostat thermostat;
	private long startTime;
	protected boolean itemPlaced;
	
	public Alpha1Oven()
	{
		status = StatusType.off;
		itemPlaced = false;
		cookingTemp = 0;
		cookingTimeInMinutes = 0;
		thermostat = new OvenThermostat();
		startTime = 0;
	}
	
	public void turnoff()
	{
		status = StatusType.off;
	}
	
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
	
	public void setTime(int cookingTime)
	{
		
		cookingTimeInMinutes = cookingTime;
		startTime = System.currentTimeMillis();
	}
	
	public void placeFood()
	{
		itemPlaced = true;
	}
	
	public void clear()
	{
		status = StatusType.off;
		itemPlaced = false;
		cookingTemp = 0;
		cookingTimeInMinutes = 0;
		startTime = 0;
	}
	
	public void showOvenStatus()
	{
		
		System.out.println("Oven Name       	 : " + getOvenName());
		System.out.println("Oven Status     	 : " + status);
		System.out.println("Start Time      	 : " + displayTimeInHumanReadable(startTime));
		System.out.println("Set Temperature in F 	 : " + thermostat.getTemperatureInF() + "\u00b0" +"F");
		long stopTimeInMillis = ((long)cookingTimeInMinutes * 60 * 1000) + startTime;
		System.out.println("Stop Time       	 : " + displayTimeInHumanReadable(stopTimeInMillis));
	}
	
	private String getOvenName()
	{
		return this.getClass().getSimpleName();
	}
	
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
	
	private static String displayTimeInHumanReadable(long millisec)
	{
		int seconds = (int) ((millisec % (1000 * 60 * 60)) % (1000 * 60)) / 1000;
		int minutes = (int) (millisec % (1000 * 60 * 60)) / (1000 * 60);
		int hours	= (int) ((millisec / (1000 * 60 * 60) ) % 24) - 8;
		String time = hours + " hours " + minutes + " mintues " + seconds + " seconds";
		return time;
	}
}