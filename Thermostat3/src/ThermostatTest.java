/**
 * @author Kevin Aloysius, Santa Clara University, COEN 275
 */
public class ThermostatTest
{
	public static void main(String args[])
	{
	
		Thermostat thermostat1 = new Thermostat();
		thermostat1.displayTemperature();
		System.out.println();
		
		Thermostat thermostat2 = new Thermostat(29, UnitType.F);
		thermostat2.increase();
		thermostat2.reduce();
		thermostat2.displayTemperature();
		System.out.println();
		
		Thermostat thermostat3 = new Thermostat(30, UnitType.C);
		thermostat3.displayFahrenheit();
		thermostat3.displayCelsius();
		System.out.println();
		
		Thermostat thermostat4 = new Thermostat(30, UnitType.F);
		thermostat4.displayFahrenheit();
		thermostat4.increase();
		thermostat4.displayFahrenheit();
		thermostat4.reduce();
		thermostat4.displayFahrenheit();
		thermostat4.reduce();
		System.out.println();
		
		Thermostat thermostat5 = new Thermostat(60);
		thermostat5.displayTemperature();
		System.out.println();
		
		Thermostat thermostat6 = new Thermostat(-5, UnitType.C);
		thermostat6.setTemperature(13, UnitType.C);
		thermostat6.displayTemperature();
		System.out.println();
		
		Thermostat thermostat7 = new Thermostat(110, UnitType.F);
		thermostat7.displayFahrenheit();
		thermostat7.increase();
		thermostat7.displayFahrenheit();
	}
}