package edu.scu.oop.assign2;
/**
 *@author Kevin Aloysius 
 *@version 1.0.0
 *@category Home Appliances
 */
public class Alpha2Oven extends Alpha1Oven
{
	private CookingMode currentMode;
	
	/**
	 * The Alpha2Oven() initializes the values
	 * for cookingTimeInMilliseconds and
	 * cookingTemp same as the one
	 * initialized by it's parent/superclass.
	 * Additionally, it also initializes the value
	 * for the currentMode
	 */
	public Alpha2Oven()
	{
		this.cookingTimeInMinutes = super.cookingTimeInMinutes;
		this.cookingTemp = super.cookingTemp;
		currentMode = CookingMode.Bake;
	}
	
	/**
	 * The setTemperatureInC is responsible for setting and changing the
	 * temperature of cookingTemperature. The setTemperature method 
	 * does not accept temperature value below -172 Celsius.
	 * @param degrees This is a double value specifying the degree 
	 * 				  for the parameters for setTemperature()
	 */
	public void setTemperatureInC(int degrees)
	{
		if (degrees <= -17)
		{
			System.out.println("Cooking Temperature cannot be below -17\u00b0C");
		}
		else
		{
			thermostat.setTemperatureInC(degrees);
			this.cookingTemp = thermostat.getTemperatureInC();
		}
	}
	
	/**
	 * The setCookingMode() method allows to
	 * set the currentMode of the Oven to any
	 * of the preset of being in Bake or Broil
	 * mode.
	 * @param mode
	 */
	public void setCookingMode(CookingMode mode)
	{
		currentMode = mode;
	}
	
	/**
	 * The start() method is responsible to switching "on"
	 * or "off" the oven depending upon the temperature and
	 * time set by the setTemperature() and setTimeInMinutes()
	 * as well as the value of itemPlaced()
	 */
	public void start()
	{
		if (cookingTemp > 0 && cookingTimeInMinutes > 0 && itemPlaced == true)
		{
			status = StatusType.on;
		}
		else
		{
			status = StatusType.off;
		}
	}
	
	/**
	 * The showOvenStatus() method is responsible for
	 * displaying the current status of the oven.
	 * The current values of the Oven's data members can
	 * be observed using showOvenStaus()
	 * Some of the information displayed through the
	 * showOvenStatus() method include the oven name,
	 * oven status : on/off, start time, the set temperature,
	 * and stop time. Additional to that, it also shows
	 * information regarding the setTemperature in Celsius,
	 * Cooking Mode and whether an item is placed on the
	 * oven or not.
	 */
	public void showOvenStatus()
	{
		super.showOvenStatus();
		if (thermostat.getTemperatureInF() <= 0)
		{
			System.out.println("Set Temperature in C 	 : " + "0" + "\u00b0" +"C");
		}
		else
		{
			System.out.println("Set Temperature in C 	 : " + thermostat.getTemperatureInC() + "\u00b0" +"C");
		}
		System.out.println("Cooking Mode		 : " + currentMode);
		System.out.println("Item Placed	         : " + itemPlaced);
	}
	
	public StatusType getStatus()
	{
		return status;
	}
	
	public void setPlaced(boolean placement)
	{
		this.itemPlaced = placement;
	}
	
	/**
	 * The displayTempTimeError is responsible for producing
	 * the appropriate Error Message depending on the status
	 * of cooking temperature, cooking time and whether or
	 * not an item is placed on the oven.
	 * @param temp An integer specifying the temperature
	 * @param time A long data type specifying the time
	 * @param placed A boolean data type specifying whether an
	 * 				 item is placed or not.
	 */
	private String displayTempTimeError(int temp, long time, boolean placed)
	{
		String error = null;
		if(temp == 0)
		{
			if(time == 0)
			{
				if(placed == false)
				{
					error = "Temperature and Time not set. Food is not placed!";
					
				}
				else
				{
					error = "Temperature and Time are not set!";
					
				}
			}
			else
			{
				if(placed == false)
				{
					error = "Temperature is not set. Food is not placed!";
					
				}
				else
				{
					error = "Temperature is not set!";
					
				}
			}
		}
		else
		{
			if(time == 0)
			{
				if(placed == false)
				{
					error = "Time is not set. Food is not placed!";
					
				}
				else
				{
					error = "Time is not set!";
					
				}
			}
			else
			{
				if(placed == false)
				{
					error = "Food is not placed!";
				}
			}
		}
		return error;
	}
}