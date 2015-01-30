package edu.scu.oop.assign2;
/**
 * @author Kevin Aloysius
 * The TempRegulator Interface provides interface for Thermostat Operations.
 */
public interface TempRegulator
{
	void setTemperatureInF(int temp);
	void setTemperatureInC(int temp);
	int getTemperatureInF();
	int getTemperatureInC();
}