public class SmartOvenApplication
{
	public static void main(String args[])
	{
		Alpha1Oven alpha = new Alpha1Oven();
		alpha.setTemperature(223);
		alpha.setTime(3);
		alpha.start();
		alpha.showOvenStatus();
		System.out.println();
		Alpha2Oven beta = new Alpha2Oven();
		beta.placeFood();
		beta.setTime(4);
		beta.setTemperatureInC(35);
		beta.start();
		beta.showOvenStatus();
	}
}