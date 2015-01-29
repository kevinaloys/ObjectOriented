public class SmartOvenApplication
{
	public static void main(String args[])
	{
		Alpha1Oven alpha = new Alpha1Oven();
		alpha.setTemperature(223);
		alpha.setTime(3);
		alpha.start();
		alpha.showOvenStatus();
	}
}