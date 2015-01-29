package edu.scu.oop.assign2;
public class OvenThermostat implements TempRegulator
{
	private int currentTemperature;
	
	public void setTemperatureInF(int degreeF)
	{
		currentTemperature = degreeF;
	}
	
	public void setTemperatureInC(int degreeC)
	{
		int convertedTemp = ( ( degreeC * 9 ) / 5 ) + 32;
		currentTemperature = convertedTemp;
	}
	
	public int getTemperatureInF()
	{
		return currentTemperature;	
	}
	
	public int getTemperatureInC()
	{
		return ((currentTemperature - 32) * 5) / 9;
	}

}