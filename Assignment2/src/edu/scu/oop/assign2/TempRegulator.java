package edu.scu.oop.assign2;
/**
 * @author Kevin Aloysius
 * The TempRegulator Interface provides interface for Thermostat Operations.
 * The TempRegulator interface makes sure that the methods provided by
 * the interface are implemented in the class which implements this
 * interface.
 * 
 */
public interface TempRegulator
{
	/**
	 * The setTemperatureInF interface
	 * provided by the TempRegulator initiates
	 * the implementation of a method which takes
	 * in a temperature and sets the value of the
	 * temperature in Fahrenheit.
	 * @param temp An int data type specifying
	 * 			   the value of the temperature
	 */
	void setTemperatureInF(int temp);
	
	
	/**
	 * The setTemperatureInC interface
	 * provided by the TempRegulator intitiates
	 * the implementation of a method which 
	 * takes in a temperature and sets the value
	 * of the temperature in Celsius.
	 * @param temp An int data type specifying
	 * 			   the value of the temperature
	 */
	void setTemperatureInC(int temp);
	
	/**
	 * The getTemeratureInF interface
	 * provided by the TempRegulator initiates
	 * the implementation of a method which
	 * returns the current Temperature in
	 * Fahrenheit.
	 * @return An int data type which returns
	 *         the temperature in Fahrenheit.
	 */
	int getTemperatureInF();
	
	/**
	 * The getTemeratureInC interface
	 * provided by the TempRegulator initiates
	 * the implementation of a method which
	 * returns the current Temperature in
	 * Celsius.
	 * @return An int data type which returns
	 *         the temperature in Celsius.
	 */
	int getTemperatureInC();
}