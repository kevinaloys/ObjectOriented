import edu.scu.oop.assign2.*;

public class App {
	Alpha2Oven alpha = new Alpha2Oven();
	String units;
	int temperature;
	public void setTemperature(String temp)
	{
		try
		{
			this.temperature = Integer.parseInt(temp);
		}
		catch(NumberFormatException e)
		{
			this.temperature = 0;
		}
		if(units == "celsius")
		{
			alpha.setTemperatureInC(this.temperature);
		}
		else if(units == "fahrenheit")
		{
			alpha.setTemperature(this.temperature);
		}
		
	}
	
	
	//Setters
	public void setTime(int time)
	{
		alpha.setTime(time);
	}
	
	public void setTempUnits(String tempUnits)
	{
		units = tempUnits;
	}
	public void setPlaced(boolean placement)
	{
		alpha.setPlaced(placement);
	}
	
	
	//Getters
	public int getTime()
	{
		return (int)alpha.getTime();
	}
	
	public int getTemperature()
	{
		return alpha.getTemeprature();
	}
	
	public boolean getPlaced()
	{
		return alpha.getPlaced();
	}
	
	public String getErrorMessage(int temp, int time, boolean placed)
	{
		return alpha.displayTempTimeError(temp, time, placed);
	}
	
	
	public void start()
	{
		alpha.start();
	}
	public String getStatus()
	{
		StatusType s;
		String status = new String();
		
		s = alpha.getStatus();
		
		if (s.equals(StatusType.off))
		{
			status = "Off";
		}
		else if(s.equals(StatusType.on))
		{
			status = "On";
		}
		return status;
	}
	
	
	public int getTemperatureInF()
	{
		return alpha.getTemperatureInF();
	}
	
	public int getTemperatureInC()
	{
		return alpha.getTemperatureInC();
	}
	public void getOvenMessage()
	{
		alpha.showOvenStatus();
	}
}
