class Alpha2Oven extends Alpha1Oven
{
	private CookingMode currentMode;
	
	Alpha2Oven()
	{
		this.cookingTimeInMinutes = super.cookingTimeInMinutes;
		this.cookingTemp = super.cookingTemp;
		currentMode = CookingMode.Bake;
	}
	
	public void setTemperatureInC(int degrees)
	{
		thermostat.setTemperatureInC(degrees);
	}
	
	public void setCookingMode(CookingMode mode)
	{
		currentMode = mode;
	}
	
	public void start()
	{
		if (cookingTemp > 0 && cookingTimeInMinutes > 0 && itemPlaced == true)
		{
			status = StatusType.on;
		}
		else
		{
			displayTempTimeError(cookingTemp, cookingTimeInMinutes, itemPlaced);
			status = StatusType.off;
		}
	}
	
	public void showOvenStatus()
	{
		super.showOvenStatus();
		System.out.println("Set Temperature in C 	 : " + thermostat.getTemperatureInC() + "\u00b0" +"C");
		System.out.println("Cooking Mode		 : " + currentMode);
		System.out.println("Item Placed	         : " + itemPlaced);
	}
	
	private void displayTempTimeError(int temp, long time, boolean placed)
	{
		if(temp == 0)
		{
			if(placed == false)
			{
				System.out.println("Cooking Temperature is not set and food is not placed.");
			}
			else
			{
				System.out.println("Cooking Temperature is not set.");
			}
		}
		else if (time == 0)
		{
			if(placed == false)
			{
				System.out.println("Cooking Time is not set and food is not placed");
			}
			else
			{
				System.out.println("Cooking Time is not set");
			}
		}
	}
}