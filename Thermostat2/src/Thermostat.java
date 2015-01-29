import java.util.Date;
import java.text.DateFormat;

public class Thermostat
{
	private double currentTemprature;
	private Date date;
	private UnitType units;
	
	Thermostat()
	{
		currentTemprature = 72;
		units = UnitType.F;
	}
	
	Thermostat(double temprature)
	{
		setTemprature(temprature, UnitType.F);
	}
	
	Thermostat(double temprature, UnitType unit)
	{
		setTemprature(temprature, unit);
	}
		
	public void setTemprature(double temprature, UnitType unit)
	{
		if(checkInRange(temprature, unit))
		{
			currentTemprature = temprature;
			units = unit;
		}
		else
		{
			System.out.println("Warning: Temprature cannot be set to " + temprature + "\u00b0");
		}
	}
	
	private void checkInRange(double temp, tempunit)
	{
		if (((tempunit.equals(UnitType.F) && temp >= 30 && temp <= 110)) || 
			((tempunit.equals(UnitType.C) && temp >= -1.1111111111111112 && temp <= 43.333333333333336))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}