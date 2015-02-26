import edu.scu.oop.assign2.*;

public class App {
	Alpha2Oven alpha = new Alpha2Oven();
	String units;
	int temperature;
	
	
	
	
	public void setTemperature(String temp)
	{
		//Convert String to int
		this.temperature = Integer.parseInt(temp);
		
		if(units == "celsius")
		{
			alpha.setTemperatureInC(this.temperature);
		}
		else if(units == "fahrenheit")
		{
			alpha.setTemperature(this.temperature);
		}
		
	}
	
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
	
	public void start()
	{
		alpha.start();
	}
	public String getStatus()
	{
		StatusType s;
		String status = new String();
		
		s = alpha.getStatus();
		
		if (s == StatusType.off)
		{
			status = "Off";
		}
		else if(s == StatusType.on)
		{
			status = "On";
		}
		return status;
	}
	
	public void getOvenMessage()
	{
		alpha.showOvenStatus();
	}
	
}
