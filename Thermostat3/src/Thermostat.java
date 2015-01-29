import java.util.Date;
import java.text.DateFormat;

/**
 * @author Kevin Aloysius, Santa Clara University, COEN 275
 * 
 */

public class Thermostat
{
	private double currentTemperature;
	private Date date;
	private UnitType units;
	
	/**
	 *  Class constructor for Thermostat Class. 
	 *  The default constructor initializes data member currentTemprature and units to room-temperature.
	 *  This is equivalent to initializing the currentTemprature to 72 and units to (F) Fahrenheit.
	 */
	Thermostat() 
	{
		currentTemperature = 72;
		units = UnitType.F;
	}
	
	/**
	 * Parameterized constructor for Thermostat Class.
	 * Class constructor takes temperature parameter specifying the value to be initialized for
	 * the currentTemprature.  
	 */
	Thermostat(double temperature)
	{
		setTemperature(temperature, UnitType.F);
	}
	
	/**
	 * Parameterized constructor for Thermostat Class.
	 * Class constructor takes temperature and unit parameters specifying the value to be 
	 * initialized for the currentTemperature and units.
	 */
	Thermostat(double temperature, UnitType unit)
	{
		setTemperature(temperature, unit);
	}
	
	/**
	 * The checkInRange method is responsible for ensuring that the parameter pair of temperature
	 * and units are within acceptable ranges. The method returns a boolean value, namely true or
	 * false depending upon if the temperature for a said unit is in acceptable range or not.
	 * For Fahrenheit the acceptable temperature ranges from 30 to 110.
	 * For Celsius the acceptable temperature ranges from -1.1111111111111112 to 43.333333333333336
	 * 
	 * @param temp A numerical value specifying the temperature to be checked for range acceptance.
	 * @param tempunit An enumeration of type UnitType comprising of F,C
	 *                 where F stands for Fahrenheit and C stands for Celsius.
	 * @return true  - If the temperature is in acceptable range
	 *         false - If the temperature is not in an acceptable range.
	 */
	private boolean checkInRange(double temp, UnitType tempunit)
	{
		if (((tempunit.equals(UnitType.F) && temp >= 30 && temp <= 110)) || 
			((tempunit.equals(UnitType.C) && temp >= -1.1111111111111112 && temp <= 43.333333333333336)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * The convertTemprature is used for interconverting temprature from Fahrenheit to Celsius and vice-versa.
	 * 
	 * @param temprature A numerical value specifying the temperature to convert.
	 * @param unit An enumeration of type UnitType comprising of F,C
	 *             where F stands for Fahrenheit and C stands for Celsius.
	 * @return temperature in Celsius if unit is in Fahrenheit.
	 *         temperature in Fahrenheit if unit is in Celsius.
	 */
	private double convertTemperature(double temprature, UnitType unit)
	{
		if(unit.equals(UnitType.C))
		{
			return ((temprature * 9) / 5) + 32;
		}
		else
		{
			return ((temprature - 32) * 5) / 9;
		}
	}
	
	/**
	 * Sets the currentTemperature and units for the instance variables of the objects of the 
	 * Thermostat Class.
	 * 
	 * @param temperature A numerical value specifying the temperature to be set on the object.
	 * @param unit An enumeration of type UnitType comprising of F,C 
	 *             where F stands for Fahrenheit and C stands for Celsius.
	 */
	public void setTemperature(double temperature, UnitType unit)
	{
		if(checkInRange(temperature, unit))
		{
			currentTemperature = temperature;
			units = unit;
		}
		else
		{
			currentTemperature = 72;
			units = UnitType.F;
			System.out.println("Temprature was out of range. Set to " + currentTemperature + "\u00b0" + units);
		}
	}
	
	/**
	 * Returns the current date formated using DateFormat of the java.text package.
	 * The date format is of the form Month Day, Year
	 * 
	 * @return current date as String
	 */
	public String clock()
	{
		date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String datestring = df.format(date);
		return datestring;
		
	}
	
	/**
	 * Displays the current temperature in terms of Fahrenheit.If the corresponding units for the 
	 * object is in Fahrenheit,then it outputs the date along with the current temperature in Fahrenheit. 
	 * If the corresponding units for the object is in Celsius, then it first converts the current
	 * temperature to Fahrenheit and displays it accordingly.
	 */
	public void displayFahrenheit()
	{
		if(units.equals(UnitType.F))
		{
			System.out.println(clock() + "| Temperature : " + currentTemperature + "\u00b0" + UnitType.F);
		}
		else
		{
			System.out.println(clock() + "| Temperature : " + convertTemperature(currentTemperature, UnitType.C) + "\u00b0" + UnitType.F);
		}
	}
	
	/**
	 * Displays the current temperature in terms of Celsius.
	 * If the corresponding units for the object is in Celsius,then it outputs the date along 
	 * with the current temperature in Celsius. If the corresponding units for the object is in
	 * Fahrenheit, then it first converts the current temperature to Celsius and displays it accordingly.
	 */
	public void displayCelsius()
	{
		if(units.equals(UnitType.C))
		{
			System.out.println(clock() + "| Temperature : " + currentTemperature + "\u00b0" + UnitType.C);
		}
		else
		{
			System.out.println(clock() + "| Temperature : " + convertTemperature(currentTemperature, UnitType.F) + "\u00b0" + UnitType.C);
		}
		
	}
	
	/**
	 * Displays the current date along with the current temperature in Fahrenheit and Celsius.
	 */
	public void displayTemperature()
	{
		displayFahrenheit();
		displayCelsius();
	}
	
	/**
	 * Increase increase the current temperature by one degree. 
	 * The increase method also ensures that increasing the current temperature
	 * does not result in increasing it to an unacceptable temperature.
	 */
	public void increase()
	{
		if(checkInRange(currentTemperature + 1, units))
		{
			currentTemperature++;
		}
		else
		{
			System.out.println("Warning: Cannot increase temperature!");
		}
		
	}
	
	/**
	 * Reduce decreases the current temperature by one degree.
	 * The reduce method also ensures that decreasing the current temperature
	 * does not result in decreasing it to an unacceptable temperature.
	 */
	public void reduce()
	{
		if(checkInRange(currentTemperature - 1, units))
		{
			currentTemperature--;
		}
		else
		{
			System.out.println("Warning: Cannot reduce temperature!");
		}
	}
}