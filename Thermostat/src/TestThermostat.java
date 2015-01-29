import java.util.Date;
import java.text.DateFormat;
/* 
Author : Kevin Aloysius
SCU ID : W1014809
*/
class Thermostat
{
	private double currentTemprature;
	private Date date = new Date();
	private UnitType unit;
	private char degsymbol = '\u00b0';
	
	
	Thermostat()
	{
		currentTemprature = 70;
		unit = UnitType.F;
	}

	Thermostat(double temprature)
	{
		checkAndInitialize(temprature);
	}

	Thermostat(double temprature, UnitType units)
	{
		if(units.equals(UnitType.C))
		{
			double convertedTemp = temprature * 1.8 + 32;
			checkAndInitialize(convertedTemp);
		}
		else
		{
			checkAndInitialize(temprature);
		}
	}

	private void checkAndInitialize(double temprature) {
		if (temprature >= 30 && temprature <= 110)
		{
			currentTemprature = temprature;
			unit = UnitType.F;
		}
		else
		{
			System.out.println("Invalid arguments provided for initializing.");
		}
	}
	
	void setTemprature(double temprature, UnitType units)
	{
		currentTemprature = temprature;
		unit = units;
	}

	void displayFahrenheit()
	{
		if(unit.equals(UnitType.F))
		{
			System.out.println("Temprature in F:  " + currentTemprature + degsymbol + UnitType.F);
		}
		else
		{
			double convertedTemp = currentTemprature * 1.8 + 32;
			System.out.println("Temprature in F:  " + convertedTemp + degsymbol + UnitType.F);
		}
		
	}

	void displayCelsius()
	{
		if(unit.equals(UnitType.C))
		{
			System.out.println("Temprature in C:  " + currentTemprature + degsymbol + UnitType.C);
		}
		else
		{
			double fahrenheitTemp = ((currentTemprature - 32) * 5) / 9;
			System.out.println("Temprature in C:  " + fahrenheitTemp + degsymbol + UnitType.C);
		}
	}

	void displayTemprature()
	{
		this.clock();
		this.displayFahrenheit();
		this.displayCelsius();
		System.out.println();
	}

	void reduce()
	{
		if (unit.equals(UnitType.C))
		{
			double convertedTemp = currentTemprature * 1.8 + 32;
			checkAndReduce(convertedTemp);
		}
		else
		{
			checkAndReduce(currentTemprature);			
		}
	}

	private void checkAndReduce(double convertedTemp)
	{
		if (convertedTemp - 1 >= 30 )
		{
			currentTemprature -= 1;
		}
		else
		{
			System.out.println("Warning: Temprature cannot be reduced below 30" + degsymbol + "F");
			System.out.println();
		}
	}

	void increase()
	{
		if (unit.equals(UnitType.C))
		{
			double convertedTemp = currentTemprature * 1.8 + 32;
			checkAndIncrease(convertedTemp);
		}
		else
		{
			checkAndIncrease(currentTemprature);
		}
	}

	private void checkAndIncrease(double convertedTemp)
	{
		if (convertedTemp + 1 <= 110)
		{
			currentTemprature += 1;
		}
		else
		{
			System.out.println("Warning: Temprature cannot be increased beyond 110" + degsymbol + "F");
			System.out.println();
		}
	}
	
	void clock()
	{
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		String datestring = df.format(date);
		System.out.println(datestring);
	}
}

public class TestThermostat {
	public static void main(String args[]) {
		Thermostat thermostat1 = new Thermostat();
		Thermostat thermostat2 = new Thermostat();
		Thermostat thermostat3 = new Thermostat();
		Thermostat thermostat4 = new Thermostat();
		Thermostat thermostat5 = new Thermostat();
		
	}
}