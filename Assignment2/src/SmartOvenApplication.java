import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import edu.scu.oop.assign2.*;

public class SmartOvenApplication
{
	public static void main(String args[])
	{
		/*Alpha1Oven a = new Alpha1Oven();
		a.showOvenStatus();
		System.out.println();
		
		Alpha1Oven alpha = new Alpha1Oven();
		alpha.setTemperature(300);
		alpha.setTime(5);
		alpha.start();
		alpha.showOvenStatus();
		System.out.println();
		
		Alpha2Oven beta = new Alpha2Oven();
		beta.start();
		beta.showOvenStatus();
		System.out.println();
		
		beta.setTemperatureInC(350);
		beta.setTime(6);
		beta.placeFood();
		beta.start();
		beta.showOvenStatus();
		System.out.println();
		
		Alpha2Oven gamma = new Alpha2Oven();
		gamma.setTemperature(-633);
		gamma.setTime(-6);
		gamma.placeFood();
		gamma.start();
		gamma.showOvenStatus();
		System.out.println();
		
		Alpha2Oven lambda = new Alpha2Oven();
		lambda.setTemperature(400);
		lambda.setTime(42);
		lambda.placeFood();
		lambda.showOvenStatus();
		System.out.println();
		lambda.clear();
		lambda.showOvenStatus();*/
		
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new MainFrame();
			}
		});
		
	}
}