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
	
	Alpha1Oven()
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
		thermostat.setTemperatureInF((int)degrees);
		cookingTemp = thermostat.getTemperatureInF();
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
		System.out.println("Start Time      	 : " + startTime);
		System.out.println("Set Temperature in F 	 : " + thermostat.getTemperatureInF() + "\u00b0" +"F");
		System.out.println("Stop Time       	 : " + (((long)cookingTimeInMinutes * 60 * 1000) + startTime));
	}
	
	private String getOvenName()
	{
		return this.getClass().getSimpleName();
	}
	
	private static void displayTempTimeError(int temp, long time)
	{
		if (temp == 0 && time == 0)
		{
			System.out.println("Coooking Time and Cooking Temperature are not set");
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
}