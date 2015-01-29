public class OvenTest
{
	public static void main(String args[])
	{
		Alpha1Oven alpha = new Alpha1Oven();
		alpha.showStatus();
		alpha.setTemprature(76);
		alpha.setTime(45);
		alpha.start();
		alpha.showStatus();
	}
}